<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fn" uri ="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Big World!</title>
<link href = "resources/css/bbs.css" rel = "stylesheet" type = "text/css" >
<script src = "resources/js/bbs.js"></script>
</head>
<body>

<c:forEach var = "i" begin="0" end="${ list.size() - 1}" >

<table class = "list">
<tr>
	<th>글번호</th>
	<th>작성자</th>
	<th>작성일</th>
</tr>
<tr>
	<td>${ list[i].boardnum }</td>
	<td>${ list[i].name }</td>
	<td>${ list[i].inputdate }</td>
</tr>
<tr>
	<th>글 내용</th>
	<td colspan ="2"><pre> ${ list[i].content } </pre></td>
</tr>
<tr>
	<th>글 삭제</th>
	<td colspan ="2">
	<form method = "post" action = "delete1" >비밀번호
			<input type ="text" id = "dltpsw" name = "psw">
			<input type = "hidden" value = "${list[i].boardnum}" name = "boardnum">
			<input type= "submit" value = "삭제" >
		</form>
			
</td>
</tr>
</table>
</c:forEach>
<br>

<c:if test = "${msg.length > 2 }">
${msg}
</c:if>
<%--  //redirect라서 출력 안 됨 --%>
<br>
<a href = "write"> 글쓰러 가기 </a>

<%-- //쌤꺼 반복문 - items 속성 활용

<c:forEach var = "bbs" items = "${list}">
번호: ${bbs.boardnum}
작성자: ${bbs.name}
작성일: ${bbs.inputdate}

<pre>
${bbs.content}
</pre>

<form action = "delete1" method = "post">
<input type = "hidden" name ="boardnum" value = "${bbs.boardnum}">
<input type = "password" name = "password">
<input type = "submit" value = "삭제">
</form>
<a href = "javascript:formSubmit(${bbs.boardnum})"> 삭제 </a>
</c:forEach>
 --%>
 
<%--	//vo객체로 한 번에 보내기
		<form method = "post" action = "delete1" onsubmit = "dlt()" >비밀번호
			<input type ="text" id = "dltpsw" name = "password">
			<input type= "submit" value = "삭제" >
			<input type = "hidden" value = "${list[i].boardnum}" name = "boardnum">
			
		</form>
 --%>
 
 
 <%-- //for구문에 번호 붙여서 각 폼을 떼어놓기
 
 	<form id = "form${ list[i].boardnum }" action = "delete2" method = "post">
		<input type = "hidden" name = "boardnum" value = "${ list[i].boardnum }">
		<input type = "password" name = "password" id = "pw${ list[i].boardnum }">
		<a href = "javascript:formSubmit(${ list[i].boardnum })"> 삭제</a>
	</form>

 
  --%>


</body>
</html>