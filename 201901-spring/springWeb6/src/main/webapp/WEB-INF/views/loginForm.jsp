<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href = "resources/css/web6.css" rel = "stylesheet" type = "text/css">

<title> Hello Big World!</title>
</head>
<body>

<h3> [ 로그인 ] </h3>
<form action = "login" method = "post">
	<table>
		<tr>
			<th>아이디: </th>
			<td><input type = "text" name= "custid"></td>
		</tr>
		<tr>
			<th>비밀번호: </th>
			<td><input type = "text" name = "password"></td>
		</tr>
		<tr>
			<td colspan = "2"> <input type = "submit" value = "로그인"> </td>
		</tr>
	</table>
</form>


<c:if test ="${ flag }">
	<c:if test = "${ !check }">
		<p> ${ msg } </p>
	</c:if>
	<c:if test = "${ check }">
		<p> 로그인되었습니다</p>
	</c:if>
</c:if>
</body>
</html>