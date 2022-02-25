package global.sesoc.web6.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import global.sesoc.web6.dao.CustomerDAO;
import global.sesoc.web6.vo.CustomerVO;

@Controller
public class LoginController {


	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	CustomerDAO customerDAO;
	
	
	//로그인 폼으로 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		
		return "loginForm";
	}
	//로그인 처리
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String loginTry(
			String custid
			, String password
			, Model model
			, HttpSession session ) {
		//session.setAttribute("userid", userid);
		//session.removeAttribute("svalue");

		
		//사용자가 입력한 id로 검색 그리고 검색창 다녀왔다는 플래그
		CustomerVO vo = null;
		vo = customerDAO.getCustomer(custid);
		session.setAttribute("flag", true);
		
		//비밀번호도 확인
		if(vo != null){
			//id psw 맞으면 세션에 login 정보 저장
			if( password.equals( vo.getPassword() ) ){
				session.setAttribute("custid", custid);
				session.setAttribute( "custname", vo.getName() );
				session.setAttribute("check", true);
				return "redirect:/";
			}
			else{
				session.setAttribute("msg","비밀번호가 틀립니다.");
				return "loginForm";
			}
		}
		else{
			session.setAttribute("check", false);
			//로그인으로 돌아감
		}
	return "loginForm";
	}
	
	
	//로그 아웃 처리
	@RequestMapping(value= "/logout", method = RequestMethod.GET)
	public String logout(
			HttpSession session){
		logger.debug("로그아웃 시도");
		session.removeAttribute("custid");
		session.removeAttribute("custname");
		session.removeAttribute("vo");
		session.setAttribute("flag", false);
		session.setAttribute("check", false);
		logger.debug("로그아웃 완료");

		return "redirect:/";
	}
	
}
