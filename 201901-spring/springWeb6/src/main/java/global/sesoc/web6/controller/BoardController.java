package global.sesoc.web6.controller;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import global.sesoc.web6.dao.BoardDAO;
import global.sesoc.web6.dao.CustomerDAO;
import global.sesoc.web6.util.FileService;
import global.sesoc.web6.util.PageNavigator;
import global.sesoc.web6.vo.BoardVO;
import global.sesoc.web6.vo.CustomerVO;
import global.sesoc.web6.vo.ReplyVO;

@RequestMapping("board")
@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	//한 페이지에 몇 개, 한 페이지에 몇 장까지, 이런 거는 아예 상수로 선언해 버리기.
	//게시판 관련 상수값들
	final int countPerPage = 10;			//페이지 당 글 수
	final int pagePerGroup = 5;				//페이지 이동 그룹 당 표시할 페이지 수
	final String uploadPath = "/boardfile";	//파일 업로드 경로
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value= "list", method = RequestMethod.GET)
	public String moveBoard(
			Model model
			, @RequestParam(value = "page", defaultValue = "1") int page
			, @RequestParam(value = "searchText", defaultValue = "") String searchText
				){
		logger.debug("게시판으로 이동 시도");
		int total  = dao.getTotal(searchText);
		logger.debug("총 글 갯수:{}", total);
		model.addAttribute("total",total);

		if(page<1){ page = 1;}
		PageNavigator navi = new PageNavigator(countPerPage, pagePerGroup, page, total);
		model.addAttribute("navi", navi);

		logger.debug("페이지:{}, 검색어:{}", page, searchText);
		model.addAttribute("searchText", searchText);
		
		ArrayList<BoardVO> list = null;
		list = dao.listBoard( navi.getStartRecord(), navi.getCountPerPage(), searchText );
		model.addAttribute("list",list);
		logger.debug("게시판으로 이동 완료");
		
		
		return "boardList";
	}
	
	@RequestMapping(value= "write", method = RequestMethod.GET)
	public String moveInput(HttpSession session) {
		session.removeAttribute("boardFlag");
		session.removeAttribute("boardCheck");
		logger.debug("글 쓰러 이동");
		return "boardInput";
	}
	
	@RequestMapping(value= "write", method = RequestMethod.POST)
	public String inputProg(
			BoardVO vo
			, HttpSession session
			, Model model
			, MultipartFile upload) {
		session.setAttribute("boardFlag", true);
		logger.debug("글쓰기 시도");
		int check = 0;
		String custid = null;
		custid = (String) session.getAttribute("custid");
		vo.setId(custid);
		
		//첨부파일이 있는 경우 지정된 경로에 저장하고, 원본 파일명과 저장된 파일명을 Board객체에 세팅
		if (upload != null && !upload.isEmpty()) {
			String savedfile = FileService.saveFile(upload, uploadPath);
			vo.setOriginalFile(upload.getOriginalFilename());
			vo.setSavedFile(savedfile);
		}
		
		check  = dao.inputBoard(vo);

		if(check == 1) {
			session.setAttribute("boardCheck", true);
		}
		if(check == 0) {
			session.setAttribute("boardCheck", false);
		}
		
		logger.debug("글쓰기 완료");
		return "boardInput";
	}
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String moveView(
			Model model,
			HttpSession session,
			int boardnum) {
			
			//boardnum 바탕으로 board 객체 읽어오기
			logger.debug("글읽기 시도");
			BoardVO vo = null;
			vo = dao.readBoardVO(boardnum);
			model.addAttribute("board",vo);
			logger.debug("게시글 읽기 완료");
			
			//전달받은 번호의 글 정보 읽기
			ArrayList<ReplyVO> rlist  = null;
			rlist = dao.listReply(boardnum);
			model.addAttribute("rlist", rlist);
			logger.debug("리플 읽기 완료");

			//조회수 읽어 와서 1 올려주고 다시 저장해주기
			int hits = 0;
			hits = vo.getHits();
			hits = hits + 1;
			vo.setHits(hits);
			int check = 0;
			check = dao.reviseBoardVO(vo);
			if(check == 1) {
				logger.debug("조회수 증가 완료");
			} else { logger.debug("조회수 증가 실패"); }
			
			return "boardWindow";
	}
	
	/**
	 * 파일 다운로드
	 * @param boardnum 파일이 첨부된 글 번호
	 */
	@RequestMapping(value = "download", method = RequestMethod.GET)
	public String fileDownload(
			int boardnum
			, Model model
			, HttpServletResponse response ) {
		BoardVO board = dao.readBoardVO(boardnum); //글 1개에 대한 정보
		
		//원래의 파일명
		String originalfile = new String(board.getOriginalFile());
		try {
			response.setHeader("Content-Disposition", " attachment;filename="+ URLEncoder.encode(originalfile, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//저장된 파일 경로
		String fullPath = uploadPath + "/" + board.getSavedFile();
		
		//서버의 파일을 읽을 입력 스트림과 클라이언트에게 전달할 출력스트림
		FileInputStream filein = null;
		ServletOutputStream fileout = null;
		
		try {
			filein = new FileInputStream(fullPath);
			fileout = response.getOutputStream();
			
			//Spring의 파일 관련 유틸
			FileCopyUtils.copy(filein, fileout);
			
			filein.close();
			fileout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping (value = "replyWrite", method = RequestMethod.POST)
	public String writeReply(
			ReplyVO reply
			, Model model
			, HttpSession session) {
		//세션에서 로그인한 아이디를 읽는다
		String id = (String) session.getAttribute("custid");
		
		//아이디를 reply 객체에 추가
		reply.setId(id);
		
		//리플 정보를 테이블에 저장함
		int result = dao.replyInput(reply);
		
		if ( result == 0) {
			//저장 실패하면 글 목록으로 돌아간다
			return "redirect:list";
		}
		else {
			//저장 성공하면 읽던 글로 마저 돌아가기
			return "redirect:view?boardnum=" + reply.getBoardnum();
		}
	}
	
	@RequestMapping (value = "revise", method = RequestMethod.POST)
	public String reviseBoard(
			@RequestParam(value = "boardnum", defaultValue = "0") int boardnum
			, @RequestParam(value ="id", defaultValue = "x") String id) {
	
	
		return "";
	}
}
