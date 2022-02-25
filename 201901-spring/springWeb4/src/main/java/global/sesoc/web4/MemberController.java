package global.sesoc.web4;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web4.dao.MemberMapper;
import global.sesoc.web4.vo.Member;

/**
 * 회원 가입, 회원 목록 보기 컨트롤러
 */
@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//빈으로 등록된 것을 가져옴
	@Autowired
	SqlSession sqlSession;
	
	//가입 폼으로 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String viewJoinForm() {
		return "joinForm";
	}

	//가입 처리
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member) {
		logger.info("전달된 param : {}", member);
		
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = 0;
		try {
			result = mapper.insert(member);
		}
		catch (Exception e) {
			e.printStackTrace();
			return "joinForm";
		}
		if (result != 1) {
			return "joinForm";
		}
		return "redirect:/";
	}
	
@RequestMapping(value = "list", method = RequestMethod.GET)
public String viewList(
		Model model){
	MemberMapper mmapper = sqlSession.getMapper(MemberMapper.class);
	ArrayList<Member> mlist = mmapper.getList();
	model.addAttribute("list", mlist);
	return "memberList";
}

@RequestMapping(value = "/select", method = RequestMethod.GET)
public String search() {
	
	
	return "view";
}

@RequestMapping(value = "/selectOne", method = RequestMethod.POST)
public String searchOne(
		String id
		, Model model) {
	logger.info(id);
	
	MemberMapper mmapper = sqlSession.getMapper(MemberMapper.class);
	Member m1 = mmapper.selectOne(id);
	
	if( m1 != null) {
	model.addAttribute("m", m1);
	model.addAttribute("check", "1");
	logger.info( m1.getName() );
	}
	else if ( m1 == null) {
		model.addAttribute("check", "2");
	}
	
	return "view";
}


@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
public String searchOneGet(
		String id
		, Model model) {
	logger.info("이거는 get 방식");
	
	MemberMapper mmapper = sqlSession.getMapper(MemberMapper.class);
	Member m1 = mmapper.selectOne(id);
	
	if( m1 != null) {
	model.addAttribute("m", m1);
	model.addAttribute("check", "1");
	logger.info( m1.getName() );
	}
	else if ( m1 == null) {
		model.addAttribute("check", "2");
	}
	
	return "view";
}


@RequestMapping(value = "delete", method = RequestMethod.GET)
public String delete(
		Model model
		, String id) {
	
	MemberMapper mmapper = sqlSession.getMapper(MemberMapper.class);
	int check = mmapper.delete(id);
	model.addAttribute("check", check);
	model.addAttribute("deleteId", id);
	return "memberList";
}

@RequestMapping(value = "insert", method = RequestMethod.GET)
public String insertMember(
		Member m1
		,Model model ) {
	
	MemberMapper mmapper = sqlSession.getMapper(MemberMapper.class);
	int check = mmapper.insert(m1);
	model.addAttribute("name", m1.getName() );
	
	return "home";
}
}