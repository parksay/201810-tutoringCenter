package global.sesoc.web33;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
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
	public String home(Locale locale, Model model
			, @CookieValue(value= "visit", defaultValue = "0") int visitcnt
			, HttpServletResponse response ) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		visitcnt = visitcnt + 1;
		String x = Integer.toString(visitcnt);

		Cookie v = new Cookie("visit", x);
		response.addCookie(v);
		model.addAttribute( "cnt", v.getValue() );
		
		
		/*
		Cookie c = new Cookie( "cnt", Integer.toString(cnt + 1) );
		response.addCookie(c);
		model.addAllAttributes("visit", cnt + 1)
		*/
		
		
		
		
		
		
		
		return "home";
	}
	
}
