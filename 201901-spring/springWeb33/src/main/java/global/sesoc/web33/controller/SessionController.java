package global.sesoc.web33.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 로그인 도와주는 컨트롤러
 * @author user
 *190115
 */

@Controller
public class SessionController {

	/**
	 * 콘솔창에 출력 도와주는 로거
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(SessionController.class);

	
	
	@RequestMapping(value = "/session1", method = RequestMethod.GET)
	public String sesseionCtr(Model model, HttpSession session) {
		 
		model.addAttribute("rvalue","모델 데이터");
		session.setAttribute ("svalue", "세션에 저장한 값");

		return "session/ses1";
	}
	
	
	@RequestMapping(value = "/session2", method = RequestMethod.GET)
	public String sessionCtr2(HttpSession session, Model model) {
		
		return "session/ses2";
	}
	
	@RequestMapping(value = "/session3", method = RequestMethod.GET)
	public String sessionCtr3(HttpSession session, Model model) {
		//세션 정보 삭제하기 - 세션 객체필요
		session.removeAttribute("svalue");
		//세션 초기화
		//session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String log(HttpSession session, Model model) {
		
		
		return "session/loginform";
	}
	
	/**
	 * 
	 * @param session	세션
	 * @param model	모델 객체
	 * @param userid	사용자가 입력한 아이디
	 * @param psw	사용자가 입력한 비번
	 * @return	view의 경로
	 */
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logcheck(HttpSession session, Model model, String userid, String psw) {
		//ID와 비밀번호 확인, 틀리면 로그인 폼, 맞으면 세션정보를 저장 후 리다이렉트
		if(userid.equals("abc") && "123".equals(psw)){
			session.setAttribute("userid", userid);
			logger.debug("로그인 됨");
			
			return "home";
		}
		else {
			model.addAttribute("error","다시 입력해주세요");
			
			return "session/loginform";
		}
	}
	
	@RequestMapping (value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("userid");
		
		return "redirect:/";
	}
	
}
