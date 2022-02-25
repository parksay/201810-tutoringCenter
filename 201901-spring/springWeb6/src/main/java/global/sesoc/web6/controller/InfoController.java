package global.sesoc.web6.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web6.dao.CustomerDAO;
import global.sesoc.web6.dao.CustomerMapper;
import global.sesoc.web6.vo.CustomerVO;

//개인정보 수정 컨트롤러
@Controller
public class InfoController {
	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@Autowired
	CustomerDAO customerDAO;
	//개인정보 수정 폼으로 이동
	
	@RequestMapping(value = "/updateInfo", method = RequestMethod.GET)
	public String updateTry(
			HttpSession session
			, Model model) {
		//세션에서 로그인 아이디 읽기
		String custid = (String) session.getAttribute("custid");
		
		//그 아이디로 DB에서 개인정보 검색, VO 객체 리턴
		CustomerVO vo = customerDAO.getCustomer(custid);
		//VO객체 모델에 저장, 수정폼으로 포워딩
		model.addAttribute("vo",vo);
		
		return "updateForm";
	}

	//사용자가 수정입력한 정보를 DB에 update
	@RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
	public String updateProg(
			HttpSession session
			, CustomerVO vo){
		logger.debug("정보수정 시도");
		//ID는 null 로 넘어옴. -> 세션에서 받아다가 넣어줘야 함.
		//password 공백으로 넘어오면 있던 비밀번호 사라짐
		String custid = (String) session.getAttribute("custid");
		vo.setCustid(custid);
		int check = 0;
		check = customerDAO.updateCust(vo);
		
		//수정 check 1이면 어디로, 0이면 어디로 
		//수정된 이름 세션으로 새로 넣어줘야
		if ( check == 1) {
			session.setAttribute( "custname", vo.getName() );
			session.setAttribute( "custid", custid);
			session.setAttribute( "custname", vo.getName() );
			session.setAttribute( "check", true);
			logger.debug("정보수정 완료");
			return "updateDone";
			
		}

		if ( check == 0) {
			
			return "updateForm";
		}
		
		
		return "updateForm";
	}

	
	//수정된 결과를 보여주는 페이지로 이동
	@RequestMapping(value = "/updateResult", method = RequestMethod.POST)
	public String updateComp() {
		
		return "updatePost";
	}
	
}
