package global.sesoc.web6.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web6.dao.CustomerDAO;
import global.sesoc.web6.vo.CustomerVO;

@Controller
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerDAO dao;
	
	@RequestMapping(value= "/join", method = RequestMethod.GET)
	public String joinform(){
		
		return "joinForm";
	}
	
	
	@RequestMapping(value= "/join", method = RequestMethod.POST)
	public String joinDone(CustomerVO vo) {
		logger.debug("가입 데이터: {}",vo);
		
		int result = 0;
		result = dao.insert(vo);  //int로 받기
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/idCheck", method = RequestMethod.GET)
	public String idcheck1(){
		
		

		return "idCheck";
	}
	
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public String idcheck2(String searchId, Model model){
		logger.debug("flag1");
		//ID전달해서 검색하고, 그 검색 결과를 VO객체로 받아 보기
		CustomerVO vo = dao.getCustomer(searchId);
		//검색 결과를 model에 저장하고 jsp로 다시 이동
		logger.debug("flag2");
		model.addAttribute("searchId",searchId);
		model.addAttribute("searchResult", vo);
		model.addAttribute("search", true);
		logger.debug("flag3");
		
		return "idCheck";
	}
}
