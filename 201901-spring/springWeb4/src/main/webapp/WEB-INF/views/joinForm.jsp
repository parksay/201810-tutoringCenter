<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "<c:url value = "/join"/>" method = "post">
ID <input type = "text" name = "id">
PW <input type = "password" name = "password">
이름 <input type = "text" name = "name">
<input type = "submit" value = "끝">
</form>



</body>
</html>