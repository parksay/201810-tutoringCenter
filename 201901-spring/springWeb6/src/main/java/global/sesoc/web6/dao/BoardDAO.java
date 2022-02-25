package global.sesoc.web6.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web6.vo.BoardVO;
import global.sesoc.web6.vo.ReplyVO;

@Repository
public class BoardDAO {
	
@Autowired
SqlSession ss;
	
	public int inputBoard(BoardVO vo) {
		
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		int check = 0;
		check = bmapper.insert(vo);
		
		
		return check;
	}
	
	public ArrayList<BoardVO> getList() {
		ArrayList<BoardVO> list = null;
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		list = bmapper.getList();
		return list;
	}
	
	public BoardVO readBoardVO(int boardnum) {
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		BoardVO vo = null;
		vo = bmapper.getBoardVO(boardnum);
		
		return vo;
	}
	
	public int getTotal(String searchText) {
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		int cnt = bmapper.getTotal(searchText);

		
		return cnt;
	}
	//글목록 보기 RowBounds 추가됨
	public ArrayList<BoardVO> listBoard(int start, int count, String searchText) {
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		
		//검색 결과의 일부만 가져오는 객체 start는 시작, count는 갯수
		RowBounds rb = new RowBounds(start, count);
		
		ArrayList<BoardVO> boardlist= null;
		boardlist = bmapper.listBoard(rb, searchText);
		return boardlist;
		
	}
	
	public int replyInput(ReplyVO vo){
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		int check = 0;
		check = bmapper.inputReply(vo);
		return check;
	}
	
	public ArrayList<ReplyVO> listReply(int boardnum) {
		ArrayList<ReplyVO> rlist = null;
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		rlist=bmapper.listReply(boardnum);
		
		return rlist;
	}
	
	
	public int reviseBoardVO(BoardVO vo) {
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		int check = 0;
		check = bmapper.updateBoardVO(vo);
		return check;
	}
	
}
