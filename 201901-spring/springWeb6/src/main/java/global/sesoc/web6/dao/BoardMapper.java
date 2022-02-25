package global.sesoc.web6.dao;

import java.util.ArrayList;
import org.apache.ibatis.session.RowBounds;

import global.sesoc.web6.vo.BoardVO;
import global.sesoc.web6.vo.ReplyVO;

public interface BoardMapper {

	
	public int insert(BoardVO vo);
	public ArrayList<BoardVO> getList();
	public BoardVO getBoardVO(int boardnum);
	public int getTotal(String searchText);
	public ArrayList<BoardVO> listBoard(RowBounds rb, String searchText);
	public int inputReply(ReplyVO vo);
	public ArrayList<ReplyVO> listReply(int boardnum);
	public int updateBoardVO(BoardVO vo);
}
