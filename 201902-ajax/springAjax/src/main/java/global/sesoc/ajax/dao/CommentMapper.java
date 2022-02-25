package global.sesoc.ajax.dao;

import java.util.ArrayList;

import global.sesoc.ajax.vo.CommentVO;

public interface CommentMapper {

	
	public int write(CommentVO vo);
	public ArrayList<CommentVO> list();
	public int deleteComment(int num);
}
