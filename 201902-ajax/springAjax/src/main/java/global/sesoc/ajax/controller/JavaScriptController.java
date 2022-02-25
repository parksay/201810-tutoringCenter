package global.sesoc.ajax.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavaScriptController {
	
	private static final Logger logger = LoggerFactory.getLogger(JavaScriptController.class);
	
@RequestMapping(value = "js1", method = RequestMethod.GET)
public String moveJs1() {
	
	
	return "javascript1";
}

@RequestMapping(value = "js2", method = RequestMethod.GET)
public String moveJs2() {
	
	
	return "javascript2";
}

@RequestMapping(value = "js3", method = RequestMethod.GET)
public String moveJs3() {
	
	
	return "javascript3";
}

@RequestMapping(value = "jq1", method = RequestMethod.GET)
public String moveJq1(){
	
	return "jquery1";
}

@RequestMapping(value = "jq2", method = RequestMethod.GET)
public String moveJq2(){
	
	return "jquery2";
}

@RequestMapping(value = "jq3", method = RequestMethod.GET)
public String moveJq3(){
	
	return "jquery3";
}


@RequestMapping(value = "/resources/js/jquery-3.3.1.min.js")
public String moveJq(){
	
	return "../../resources/jquery-3.3.1.min.js";
}

}
