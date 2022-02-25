package global.sesoc.ajax.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.ajax.vo.CommentVO;

@Repository
public class CommentDAO {

	@Autowired 
	SqlSession ss;
	
public int input(CommentVO vo){
	int check = 0;
	CommentMapper cmapper = ss.getMapper(CommentMapper.class);
	check = cmapper.write(vo);
	return check;
}

public ArrayList<CommentVO> getList(){
	ArrayList<CommentVO> list = null;
	CommentMapper cmapper = ss.getMapper(CommentMapper.class);
	list = cmapper.list();
	return list;
}

public int delComment(int num){
	int check = 0;
	CommentMapper cmapper = ss.getMapper(CommentMapper.class);
	check = cmapper.deleteComment(num);
	return check;
}


}