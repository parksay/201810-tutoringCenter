package global.sesoc.ajax.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.ajax.dao.CommentDAO;
import global.sesoc.ajax.vo.CommentVO;

@Controller
public class CommentController {

	Logger logger = LoggerFactory.getLogger(CommentController.class);
	@Autowired CommentDAO dao;
	
@RequestMapping(value = "cmt1", method=RequestMethod.GET)
public String moveComment1(){

	
	return "comment";
}


@ResponseBody
@RequestMapping(value = "inputCmt", method = RequestMethod.POST)
public int inputCmt(CommentVO vo){
	logger.debug("vo:{}",vo);
	int check = 0;
	check = dao.input(vo);	
	logger.debug("삭제 여부: " + check);
	return check;
}

@ResponseBody
@RequestMapping(value = "list", method = RequestMethod.GET)
public ArrayList<CommentVO> printList(){
	
	ArrayList<CommentVO> list = null;
	list = dao.getList();	
	return list;
}

@ResponseBody
@RequestMapping(value = "delCmt", method = RequestMethod.POST)
public int deleteCmt(int num){
	logger.debug("delNum:{}",num);
	int check = 0;
	check = dao.delComment(num);	
	return check;
}
@ResponseBody
@RequestMapping(value = "updtest", method = RequestMethod.POST)
public void updtest(String text){
	logger.debug(text);
	return;
}

}
