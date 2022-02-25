package global.sesoc.web33.controller;

import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web33.vo.Person;

@Controller
public class ELController {

	
private static final Logger logger = LoggerFactory.getLogger(JSPController.class);
	
	@RequestMapping ( value= "/el", method = RequestMethod.GET)
	public String jap1method(Model model) {
		int number = 265;
		String str = "abcd";
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		String phone = "010-3445-2134";
		String data = "<marquee> 문자열 </marquee>";
		model.addAttribute("list", list);
		model.addAttribute("number", number);
		model.addAttribute("str", str);
		model.addAttribute("phone", phone);
		model.addAttribute("data", data);
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add( new Person("김", 20, "1111", "서울") );
		plist.add( new Person("이", 56, "3545", "광주") );
		plist.add( new Person("박", 32, "4612", "부산") );
		
		model.addAttribute("plist", plist);
		
		
		return "eltest";
	}
	
	
	@RequestMapping (value= "/jstl1", method = RequestMethod.GET)
	public String jstlc1(Model model) {
		
		
		return "jsp/jstl1";
	}	
	
	@RequestMapping (value= "/jstl2", method = RequestMethod.GET)
	public String jstlc2(Model model) {
		

		Date today = new Date();
		double num1 = 12345.678;
		double num2 = 99.9;
		double num3 = 0.1;
		
		model.addAttribute("today", today);
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("num3", num3);
		
		return "jsp/jstl2";
	}	
	
	@RequestMapping (value= "/jstl3", method = RequestMethod.GET)
	public String jstlc3(Model model) {
	
		String str = "abc-ABC-가나다";
		model.addAttribute("str",str);
		
		
		return "jsp/jstl3";
	}
	
}
