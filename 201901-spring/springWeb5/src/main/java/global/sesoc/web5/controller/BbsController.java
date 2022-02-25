package global.sesoc.web5.controller;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web5.HomeController;
import global.sesoc.web5.dao.BbsMapper;
import global.sesoc.web5.vo.BbsVO;

@Controller
public class BbsController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	SqlSession sqlSession;
	SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String viewform() {
		
		
		
		return "writeform";
	}
	
	
	@RequestMapping(value= "/write", method= RequestMethod.POST)
	public String writecomp(BbsVO vo ){
		
		BbsMapper bmapper = sqlSession.getMapper(BbsMapper.class);
		bmapper.inputBbs(vo);
		
		return "writeform";
	}
	
	
	@RequestMapping(value= "/bbslist", method = RequestMethod.GET)
	public String viewList(
			Model model) {
		
		BbsMapper bmapper = sqlSession.getMapper(BbsMapper.class);
		ArrayList bbslist = bmapper.getList();
		model.addAttribute("list", bbslist);
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/delete1", method = RequestMethod.POST)
	public String dlt(BbsVO vo){
			
	BbsMapper bmapper = sqlSession.getMapper(BbsMapper.class);
	int check = bmapper.deleteBbs(vo);
	String msg = "0";
	switch (check) {
		case 0 : msg = "삭제 실패"; break;
		case 1 : msg = "삭제되었습니다"; break;
	}
	logger.debug(msg);
	logger.debug(vo.getPassword() + vo.getBoardnum() );
	return "redirect:/bbslist";
	}

	@RequestMapping(value = "/delete2", method = RequestMethod.POST)
	public String dlt2(
			String password
			, int boardnum
			, Model model){
	
	logger.debug(password + boardnum);
	/*
		BbsMapper bmapper = sqlSession.getMapper(BbsMapper.class);
		int check = bmapper.deleteBbs(vo);
		String msg = "0";
		switch (check) {
			case 0 : msg = "삭제 실패"; break;
			case 1 : msg = "삭제되었습니다"; break;
		}
		model.addAttribute("msg", msg);
	*/
	return "redirect:/bbslist";
	}


}