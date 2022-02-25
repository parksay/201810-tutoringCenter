package global.sesoc.web2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("메인 화면 접속");
		
		model.addAttribute("test", "뷰로 보내는 문자열" );
		return "home";
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3() {
		logger.info("테스트3");
		
		return "test/testview3";
	}
	
	@RequestMapping(value = "/abc/test4", method = RequestMethod.GET)
	public String test4() {
		logger.info("테스트4");
		
		return "testview4";
	}
	
	
}
