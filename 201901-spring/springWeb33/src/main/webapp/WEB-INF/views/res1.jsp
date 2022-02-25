<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src = "resources/js/jstest1.js"></script>
<link href= "<c:url value= "/resources/css/csstest1.css"> </c:url>" rel ="stylesheet" type = "text/css">

</head>
<body>
<img src = "./resources/image/d092.jpg" width = "45%" height = "90%"> <br>
<img src = "/resources/image/d092.jpg"> <br>
<img src = "web3/resources/image/d092.jpg"> <br>

<img src = "<c:url value = "/resources/image/d092.jpg"></c:url>" width = "30%" height = "60%"> <br>

<input type= "button" value = "js함수 체크" onclick = "test1()"> <br>

<p class = "textRed"> test 테스트 중 </p>
<c:url value = "/adfjoi/adfsji.jsp"> 실험중 이건 뭐가 되지 </c:url>
</body>
</html>