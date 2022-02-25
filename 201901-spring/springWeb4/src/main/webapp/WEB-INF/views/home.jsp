<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
Spring web4 예제
</h1>

<P>  The time on the server is ${serverTime}. </P>


<p> <a href = "<c:url value = "/join"/>"> 가입하기 </a> </p>
<p> <a href = "list"> 모든 회원 정보 보기 </a> </p>
<p> <a href = "select"> 아이디 검색 </a>

<c:if test = "${ check == 1 }">
<p> 가입 완료 </p>
<p> ${ name }님 환영합니다 </p>
</c:if>

</body>
</html>
