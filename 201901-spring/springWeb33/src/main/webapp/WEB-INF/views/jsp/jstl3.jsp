<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
    <%@ taglib prefix = "fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<p> ${ str } </p>
<p> length(str) = ${ fn : length(str) } </p>
<P> toUpperCase : ${ fn : toUpperCase(str) } </P>
<p> substring : ${ fn : substring(str, 2, 5) }</p> 


</body>
</html>