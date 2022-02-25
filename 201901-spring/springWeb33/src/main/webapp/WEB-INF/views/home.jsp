<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	spring 예제 3  
</h1>

<ol>
<li> <p> <a href = ""> 서버 - 클라이언트의 값 전달 </a> </p></li>
 <ul>
 	<li> <p> <a href = "param1"> GET방식으로 parameter 전달 </a> </p> </li>
 	<li> <p> <a href = "param2"> POST 방식으로 parameter 전달</a> </p> </li>
 	<li> <p> <a href = "param3"> VO 객체로 parameter 전달</a> </p> </li>
 	<li> <p> <a href = ""> 서버에서 클라이언트로 보내기</a> </p> </li>
 	<li> <p> <a href = "/web33/paramtest1/hi/hello"> paramtest1 </a> </p> </li>
 </ul>
 
 <li> <p> </a> 리소스 사용</p> </li>
 
 <ul>
 <li> <p> <a href = "res"> 리소스 사용 </a> </p> </li>
 
 <li> <p> <a href = "session1"> 세션 사용</a> </p> </li>
 <li> <p> <a href = "session2"> 세션에 정보 저장 </a> </p> </li>
 <li> <p> <a href = "session3"> 세션 정보 삭제</a> </p> </li>
 

 <c:if test = "${sessionScope.userid == null}">
 <li> <p> <a href = "login"> 로그인 페이지로</a> </p> </li> <br>
 </c:if>
 <c:if test = "${sessionScope.userid != null}">
 <li> <p> ${sessionScope.userid}님 로그인 중 </p> </li> 
 <li> <p> <a href = "logout">로그아웃하기</a> </p> </li> <br>
 </c:if>

 </ul>
 <ul>
 <li> <a href = "cookie1"> 쿠키 생성	</a> </li> 
 <li> <a href = "cookie2"> 쿠키 읽기	</a> </li> 
 <li> <a href = "cookie3"> 쿠키 어노테이션으로 읽기	</a> </li> 
 <li> <a href = "cookie4"> 쿠키 삭제	</a> </li> 
  <li> ${ cnt } </li> 
 <li> <%= "이거 그대로 출력 됨?" %> </li>
 
 </ul>
</ol>

<P>   </P>
</body>
</html>

