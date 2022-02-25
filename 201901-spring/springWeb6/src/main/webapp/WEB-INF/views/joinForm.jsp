<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href = "resources/css/web6.css" type = "text/css" rel = "stylesheet">
<script src = "resources/js/web6.js"></script>
<title>Hello Big World</title>
</head>
<body>
[회원가입]

<form action = "join" method = "post" onsubmit = "return formCheck();">
<table>
<tr>
	<th>ID</th>
	<td><input type = "text" name = "custid" id = "custid" value="${ searchId }"
	readonly = "readonly" placeholder = "ID 중복 확인 버튼 클릭하세요" > </td>
	<td><input type= "button" value = "ID 중복 확인" id = "idcheck"
				onclick = "idCheck()">
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type = "password" name = "password" id = "psw"> </td>
</tr>
<tr>
	<th>비밀번호 확인</th>
	<td><input type = "password" id = "pswcheck"> </td>
</tr>
<tr>
	<th>이름</th>
	<td><input type = "text" name = "name" id = "name"></td>
</tr>
<tr>
	<th>이메일</th>
	<td><input type = "text" name = "email"></td>
</tr>
<tr>
	<td>고객구분</td>
	<td><input type = "radio" name = "division" value = "personal" checked>개인
		<input type = "radio" name = "division" value = "company">기업</td>
</tr>
<tr>
	<th>식별번호</th>
	<td><input type = "text" name = "idno"></td>
</tr>	
<tr>
	<th>주소</th>
	<td><input type = "text" name = "address"></td>
</tr>
<tr>
<th></th>
<td><input type = "submit" value = "가입"></td>
</tr>


</table>
</form>


</body>
</html>