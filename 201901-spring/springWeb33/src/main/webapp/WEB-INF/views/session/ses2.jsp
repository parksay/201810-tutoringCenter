<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

세션 정보 : ${sessionScope.svalue } <br>
요청 정보: ${requestScope.rvalue } <br>
-Scope 써서 특정 영역으로 탐색 구간 좁힘
</body>
</html>