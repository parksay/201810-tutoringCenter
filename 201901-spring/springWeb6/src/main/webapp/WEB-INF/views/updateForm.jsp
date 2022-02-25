<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href = "resources/css/web6.css" type = "text/css" rel = "stylesheet">
<title> Hello Big World! </title>
</head>
<body>


<h3>[회원가입] </h3>

<form action = "updateInfo" method = "post" onsubmit = "">
<table>
<tr>
	<th>ID</th>
	<td>${ vo.custid }</td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type = "password" name = "password" id = "psw" value = "${ vo.password }"> </td>
</tr>
<tr>
	<th>비밀번호 확인</th>
	<td><input type = "password" id = "pswcheck"> </td>
</tr>
<tr>
	<th>이름</th>
	<td><input type = "text" name = "name" id = "name" value = "${ vo.name }"></td>
</tr>
<tr>
	<th>이메일</th>
	<td><input type = "text" name = "email" value = "${ vo.email }"></td>
</tr>
<tr>
	<td>고객구분</td>
	<td>
		<c:if test = "${ vo.division == 'personal' }">
			<input type = "radio" name = "division" value = "personal" checked>개인
		</c:if>
		<c:if test = "${ vo.division == 'company' }">
			<input type = "radio" name = "division" value = "company">기업
		</c:if>
	</td>
</tr>
<tr>
	<th>식별번호</th>
	<td><input type = "text" name = "idno" value = "${ vo.idno }"></td>
</tr>	
<tr>
	<th>주소</th>
	<td><input type = "text" name = "address" value = "${ vo.address }"></td>
</tr>
<tr>
<th></th>
<td><input type = "submit" value = "수정"></td>
</tr>

</table>
</form>


</body>
</html>