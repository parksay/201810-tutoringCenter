<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Big world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test ="${ !check }">
	<p> <a href = "join"> 가입하기 </a> </p>
	<p> <a href = "login"> 로그인하기 </a> </p>
</c:if>

<c:if test ="${ flag }">
	<c:if test = "${ !check }">
		<p> ${ msg } </p>
	</c:if>
	<c:if test = "${ check }">
		<p> ${ custname }님이 로그인 중입니다.</p>
		<p> <a href = "updateInfo"> 개인정보 수정 </a> </p>
		<p> <a href = "logout"> 로그아웃 </a> </p>
	</c:if>
</c:if>
<p> <a href = "board/list"> 게시판 이동</a> </p>
<%-- 글 수정할 때 기존에 업로드 해놨던 파일이 있으면, 지우고 나서 새로 덮어쓰는 기능
이름 겹치지 않도록 하면서 업로드파일들 다 한 폴더에 저장하는 기능 
/190131 정도 꺼 찾아 보기--%>
</body>
</html>
