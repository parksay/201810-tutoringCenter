package global.sesoc.web3.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);  
	
	
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String test5(Model model) {
	logger.info("테스트5 요청");
	
	String a = "서버에서 가져온 문자열";
	int num = 1000;
	model.addAttribute("call", a);
	model.addAttribute("call2", num);
	ArrayList<String> sl = new ArrayList<>();
	sl.add("hi");
	sl.add("hello");
	model.addAttribute("sl",sl);
	int int1 = 36;
	double double1 = 3.6;
	HashMap<String,Object> hm = new HashMap<>();
	hm.put("int1", int1);
	hm.put("double1", double1);
	model.addAttribute("hm",hm);
	model.addAttribute("int1", int1);
	model.addAttribute("double1", double1);
	boolean boolean1 = true;
	model.addAttribute("boolean1",boolean1);
	
		
		return "testview5";
	}
	
	@RequestMapping (value = "/test6", method = RequestMethod.GET)
	public String fromtest(Model model) {
		
		return "/test1/testview6";
	}
	
	@RequestMapping (value = "/join", method = RequestMethod.POST) 
	public String join(String name, int age) {
		logger.info(name + age);
		
		return "/test1/testview6";
	}
	
	
}
