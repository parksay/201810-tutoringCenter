<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> vo 객체로 전달</h1>

<form action = "param5" method = "post">
 이름 : <input type = "text" name = "name"> <br>
 나이 : <input type = "text" name = "age"> <br>
 전화 : <input type = "text" name = "phone"> <br>
주소 : <input type = "text" name = "adress"> <br>
 <!-- 추가 사항 : <textarea rows = "3" cols = "30" name = "adress"></textarea> -->
 <input type = "submit" value = "전송"><br>
  
 </form>

</body>
</html>