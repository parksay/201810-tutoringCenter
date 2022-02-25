package global.sesoc.web33.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResourceController {

	
	@RequestMapping (value = "/res", method = RequestMethod.GET)
	public String rsrc1() {
		
		return "res1";
	}
	
	@RequestMapping (value = "/test/urltest", method = RequestMethod.GET)
	public String urltest1() {
		
		return "jsp/urltest1";
	}
		
	
}
