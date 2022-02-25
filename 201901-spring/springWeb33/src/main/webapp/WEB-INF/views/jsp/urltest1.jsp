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

<p> 현재 경로 : http://localhost:888/web33/test/urltest</p>
<p>http://localhost:8888/web3/jsp1로 이동하고 싶을 때</p>

<p> <a href = "../jsp1"> 상대경로 </a> </p>  <!--  주소 바꿔도 살아 남음 , 가장 일반적 사용 -->
<p> <a href = "http://localhost:8888/web33/jsp1"> 절대경로1</a></p> <!-- 주소 바꾸면 죽음 -->
<p> <a href = "/web33/jsp1"> 절대경로2</a> </p>  <!-- 주소 바꾸면 죽음 -->
<p> <a href = "/jsp1"> 절대경로3 </a> </p>  <!-- 주소 안 바꿔도 죽음 -->
<p> <a href = " <c:url value = "/jsp1"/> "> url태그 사용 </a> </p> <!-- 주소 바꿔도 살아 남음 -->
abc/jsp1
web33/jsp1



</body>
</html>