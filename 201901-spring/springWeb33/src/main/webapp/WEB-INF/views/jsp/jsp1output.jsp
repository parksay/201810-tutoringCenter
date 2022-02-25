<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Calendar"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
hehe

<%  
	Calendar c = Calendar.getInstance();
	int m = c.get(Calendar.MONTH);
	int d = c.get(Calendar.DATE);
	%>
	c.get()
	오늘은 <%= m %>월 <%= d %>일ㅋㅋ
	
	날짜 선택 <select name= "date">
	<% for (int i = 1; i < 13; i = i + 1) { %>
	
	<option value = "<%= i %>"> <%= i %> </option>
	<% } %>
	
	</select>
	일 <select>
	<% for(int j = 1; j < 32; j = j + 1) { %>
	
	<option value = "<%= j %>"> <%= j %> </option>
	
	<% } %>
	
	</select>
	
	
	<p>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<select>월 선택
	<c:forEach var= "i" begin = "1" end = "12" > 
	  <option value = "${i}"> ${ i } 
	</c:forEach>
	</select>
	
<p>
</body>
</html>