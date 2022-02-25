<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 회원 검색 </h1>

<form action = "selectOne" method = "post">
검색할 ID <input type = "text" name ="id">
<input type = "submit" value = "검색">
</form>


<c:if test = "${check.equals('1')}">
<p> 아이디 : ${m.id} </p>
<p> 이름 : ${m.name} </p>
</c:if>


<c:if test = "${check.equals('2')}">
<p> 검색 결과가 없습니다 </p>
</c:if>

</body>
</html>