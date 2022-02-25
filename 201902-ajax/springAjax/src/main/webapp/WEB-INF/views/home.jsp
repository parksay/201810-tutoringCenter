<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ page session="false" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<ul>
<li>JavaScript</li>
<ol>
	<li><a href = "js1">기본 문법 연습1</a></li>
	<li><a href = "js2">배열과 반복문</a></li>
	<li><a href = "js3">기본 내장 객체와 브라우저 객체 모델</a></li>
</ol>
<li>jQuery</li>
	<ol>
		<li><a href = "jq1">기본 문법</a></li>
		<li><a href = "jq2">이벤트 처리</a></li>
		<li><a href = "jq3">이벤트 사용한 페이지 변화</a></li>
	</ol>
<li>Ajax</li>
	<ol>
		<li><a href = "jx1">기본적인 서버와 통신</a></li>
		<li><a href = "jx2">기본적인 서버와 통신2</a></li>
		<li><a href = "cmt1">댓글 입력</a></li>
	</ol>

</ul>



</body>
</html>
