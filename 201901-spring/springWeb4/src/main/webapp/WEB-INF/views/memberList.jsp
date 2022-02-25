<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "resources/css/view.css" type = "text/css" rel = "stylesheet">

</head>
<body>

<table class = "list">
<tr>
	<th> 아이디 </th>
	<th> 이름 </th>
	<th> 삭제 </th>
</tr>
	<c:forEach var="i" items="${ list }" >
<tr>
	<td> <a href = "selectOne?id=${i.id}"> ${i.id} 님 </a> </td>
	<td> ${i.name} 실명</td>
	<td> <a href = "delete?id=${i.id}"> 삭제  </a></td>
</tr>
</c:forEach>
<%--
	<c:forEach var = "i" begin = "0" end = "${ list.size() -1 }">
	
	<td> ${ list[i].id }
 --%>

</table>

 <c:if test = "${ check == 1 }">
 <p> ${ deleteId }님이 삭제되었습니다 </p>
 </c:if>
 
 <input type = "button" value = "삭제" onclick = "goDelete()"> 
 <script>
 function goDelete() {
	 
	 if ( confirm("삭제?")) { /alert랑 똑같은데 yes / no 선택하는
		 
		 location.href = 'delete?id=' + id; /이동시켜주는 객체
	 }
	 
 }
 </script>
 
</body>
</html>