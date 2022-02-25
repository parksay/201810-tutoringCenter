<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function check() {
	var id = document.getElementById('id');
	var password = document.getElementById('password');
	
	if( id.value.length < 3 || password.value.length < 3) {
		
		alert('비번과 아이디는 3글자 이상 부탁');
		return false;
	} else {
		
		return true;
	}
	
}


</script>
</head>
<body>

<c:if test= "${ modelScope.error != null }">
${ modelScope.error }
</c:if>
<c:if test = "${ error == null }">
환영합니다
</c:if>

<form action = "login" method = "post" onsubmit = "return check()">
아이디 <input type = "text" id = "id" name = "userid"> <br>
비밀번호 <input type = "password" id = "password" name = "psw"> <br>
<input type = "submit" value = "전송">
</form>


</body>
</html>