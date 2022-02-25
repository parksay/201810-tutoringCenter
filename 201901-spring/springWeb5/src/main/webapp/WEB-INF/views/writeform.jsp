<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 글쓰기 </title>
<link href = "resources/css/bbs.css" type = "text/css" rel = "stylesheet">
<script src = "resources/js/bbs.js"></script>
</head>
<body>
<h1> Hello Big World! </h1>
<h3> 글쓰기 </h3>

<form action = "write" method = "post">

이름: <input type ="text" name="name" id = "name"> <br>
비번: <input type ="text" name="password" id = "password"> <br>
내용: <textarea id = "content" name="content" ></textarea>
<input type ="submit" value = "완료">

</form>

</body>
</html>