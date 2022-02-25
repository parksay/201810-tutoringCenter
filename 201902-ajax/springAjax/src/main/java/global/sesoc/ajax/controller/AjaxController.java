package global.sesoc.ajax.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.ajax.Person;

@Controller
public class AjaxController {
	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);
	
	
@RequestMapping(value = "jx1", method = RequestMethod.GET)
public String moveAjax1() {
	
	return "ajax1";
}

@ResponseBody
@RequestMapping(value = "jxtest1", method = RequestMethod.GET)
public void ajaxtest1() {
	logger.debug("실행됨1");
	return;
}
/*
기존에는, 즉 @RequestMapping만 붙어있을 때는, return의 값이 항상 String 이었고,
그것 String 값의 의미는 앞뒤에 prefix, postfix 붙어서 항상 view의 jsp파일을 의미했지.
하지만 @ResponseBody 까지 붙어있을 때는 return 값이 의미하는 게 ajax한테 던져줄 값임.
진짜 return값임. int일 수도 string일 수도, 우리가 만든 VO객체인 Student 객체나 Board객체 등일 수도 있음
이것에 유의하며 써줘야 함
*/
@ResponseBody
@RequestMapping(value = "jxtest2"
, method = RequestMethod.GET
, produces = "application/json;charset=UTF-8")
//이거는 보내주는 값이 한글이라는 걸 알려주는 속성. encoding 설정
public String ajaxtest2(String str //ajax 객체에서 data 라는 속성으로 값 보내주니까 그거 받으려고
		) {
	logger.debug("실행됨2");
	String text = "아무 값";
	return text;
	//return 으로 보내주는 거는 ajax에서 success 속성으로 부르는 함수, 그 함수에 패러미터로 던져짐
	
}

@RequestMapping(value = "jx2", method = RequestMethod.GET)
public String moveAjax2() {
	
	return "ajax2";
}


@ResponseBody
@RequestMapping(value="insertForm", method=RequestMethod.GET) 
public void insert1(String name,String age, String phone){
		logger.debug("name:{},age:{},phone:{}",name,age, phone);
		
}
@ResponseBody
@RequestMapping(value="insertForm2", method=RequestMethod.POST) 
public void insert2(Person p1){
		logger.debug("data");
		logger.debug("data:{}",p1);

}

@ResponseBody
@RequestMapping(value="insertForm3", method=RequestMethod.POST) 
public void insert3(String name, int age ,String phone){
		logger.debug("name:{},age:{}",name,age);
		
}

@ResponseBody
@RequestMapping(value="insertForm4", method=RequestMethod.POST) 
public void insert4(String name, int age ,String phone){
		logger.debug("name:{},age:{}",name,age);
		
}

@ResponseBody
@RequestMapping(value="jsontest", method=RequestMethod.GET) 
public Person jsontest1(){
		Person p1 = new Person("홍길동", 20 , "108-198280-23");
		return p1;
}

@ResponseBody
@RequestMapping(value="jsontest2", method=RequestMethod.GET) 
public Person jsontest2(){
		Person p2 = new Person("홍길동", 20 , "108-198280-23");
		return p2;
}









}

