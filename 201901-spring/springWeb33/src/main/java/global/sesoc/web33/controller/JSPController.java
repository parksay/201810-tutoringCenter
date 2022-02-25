package global.sesoc.web33.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JSPController {

	private static final Logger logger = LoggerFactory.getLogger(JSPController.class);
	
	@RequestMapping ( value= "/jsp1", method = RequestMethod.GET)
	public String jap1method(Model model) {
		
		return "jsp/jsp1output";
	}
	
	
}
