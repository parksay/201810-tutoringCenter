<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <fmt:setLocale value ="ko" scope = "request"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:choose>
<c:when test = "${ num1 > 100 }">
num1은 100보다 크다
</c:when>
</c:choose>
<P>${ today }</P>
<p> <fmt:formatDate type = "both" value = "${ today }"/> </p>
<p> <fmt:formatDate value = "${ today }"  type = "date" pattern = "yy년 MM월 DD일 E요일"/> </p>
<p> <fmt:formatDate value = "${ today }"  type = "date" pattern = "hh시 mm분 ss초"/> </p>
<p> <fmt:formatDate value = "${ today }"  type = "date" pattern = " MM/DD hh:ss E요일"/> </p>

<p> {num1}</p>
<p> <fmt:formatNumber value= "${ num1 }" pattern = "#,###.00" /> </p>
<p> <fmt:formatNumber value= "${ num2 }" pattern = "#,###.00" /></p>
<p> <fmt:formatNumber value= "${ num3 }" pattern = "#,##0.00" /></p>
<p> <fmt:formatNumber value= "${ num3 }" pattern = "0%" /></p>




</body>
</html>