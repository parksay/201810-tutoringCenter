package global.sesoc.web33.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CookieController {
	private static final Logger logger = LoggerFactory.getLogger(CookieController.class);
	
	//쿠키 저장
	@RequestMapping (value = "/cookie1", method = RequestMethod.GET)
	public String cookie1(HttpServletResponse response){
		Cookie c1 = new Cookie("name", "abc");
		Cookie c2 = new Cookie("num", "123");
		
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		return "redirect:/";
	}
	
	
	//쿠키 읽기
	@RequestMapping (value = "/cookie2", method = RequestMethod.GET)
	public String cookie2(HttpServletRequest request){
		Cookie[] cks = request.getCookies();
		String ip = request.getRemoteAddr();
		//지금 접속한 아이피 주소
		
		for (Cookie c: cks) {
			
			logger.debug( "이름:{}, 값:{}", c.getName(), c.getValue() );
		}
		logger.debug(ip);

		return "redirect:/";
	}
	
	//쿠키 읽기
		@RequestMapping (value = "/cookie3", method = RequestMethod.GET)
		public String cookie3(
				@CookieValue(value="name", defaultValue="") String name
				, @CookieValue(value="num", defaultValue="0") int num 
				, @CookieValue(value="test1", defaultValue="x") String test1
				, @CookieValue(value = "test2", defaultValue="y") String test2
				, @CookieValue(value = "visit", defaultValue="0") int visit){
			
			
			if ( test2.equals("y") ) {
				
				test2 = test1;
				
			}
			
			
			logger.debug("name:" + name);
			logger.debug("num:" + num);
			logger.debug("test1" + test1);
			logger.debug("test2" + test2);
			logger.debug("visit:" + visit);
			return "redirect:/";
		}
	
	//쿠키 삭제
	@RequestMapping (value = "/cookie4", method = RequestMethod.GET)
	public String cookie4(HttpServletResponse response ){
		Cookie c1 = new Cookie("name", "0");
		Cookie c2 = new Cookie("num", "0");
		c1.setMaxAge(3);
		c2.setMaxAge(0);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		return "redirect:/";
	}

}
