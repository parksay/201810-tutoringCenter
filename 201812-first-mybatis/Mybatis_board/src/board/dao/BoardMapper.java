package board.dao;

import java.util.ArrayList;
import java.util.HashMap;
import board.vo.BoardVO;

public interface BoardMapper {

	public int insertBoard(BoardVO b);
	public ArrayList<BoardVO> selectBoard();
	public int deleteBoardbyNum(int n);
	public ArrayList<BoardVO> searchbyID(HashMap hm);
	public int updateBoard(HashMap<String, Object> hm);
}
