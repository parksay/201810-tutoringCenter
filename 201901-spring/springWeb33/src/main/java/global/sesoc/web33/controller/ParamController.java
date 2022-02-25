package global.sesoc.web33.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web33.vo.Person;


@Controller
public class ParamController {

	
	private static final Logger logger = LoggerFactory.getLogger(ParamController.class);
	
	@RequestMapping(value = "/param1", method = RequestMethod.GET)
	public String Param1method(Model model, String name, String num) {
		logger.info("param1 실행");
		logger.debug("name:{}, num:{}", name, num);
		return "param1output";
}
	
	@RequestMapping(value = "/param2", method = RequestMethod.GET)
	public String Param2method(Model model) {
		logger.info("param2 실행");
		logger.debug("asdf");
		return "param2output";
	}
	
	@RequestMapping(value = "/param3", method = RequestMethod.GET)
	public String Param3method(Model model, String str, String num, String sel, String text, String[] check) {
		logger.info("param3 실행");
		logger.debug("str:{}", str);
		logger.debug("num:{}", num);
		logger.debug("sel:{}", sel);
		logger.debug("text:{}", text);
		
		if(check != null) {
			for(int i = 0; i < check.length ; i = i + 1) {
				logger.debug(check[i]);
			}
		} else {
		}
		return "param3output";
	}

	@RequestMapping (value = "/param4", method = RequestMethod.GET)
	public String param4method() {
		logger.info("gg");
		return "param4output";
	}
	
	
	@RequestMapping ( value = "/param5", method = RequestMethod.POST)
	public String param5method(Person p,String adress) {
		/*Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setPhone(phone);
		p.setAdress(adress);*/
		
		logger.debug("person:{} , memo:{}",p, adress);
		
		return "redirect:/";
	}
}