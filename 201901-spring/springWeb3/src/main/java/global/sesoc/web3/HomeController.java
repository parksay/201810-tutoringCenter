package global.sesoc.web3;

import java.text.DateFormat;
import java.util.ArrayList;
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
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

		return "home";
	}
	
	@RequestMapping (value = "/abc/test", method = RequestMethod.GET)
	public String test1() {
		logger.info("hello world");
		String a = "testview1";
		return a;
	}
	
	
	@RequestMapping (value = "/test2", method = RequestMethod.GET)
	public String test2() {
		 logger.info("아 여깄는 메세지는 콘솔창에 뜨는 거구나");
		 return "/test1/testview2";
	 }
	
}
