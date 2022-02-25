<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Hello Big World! </title>
</head>
<body>
글쓰기

String id = ${ id } <br>
Strubg custid = ${ custid }
<%-- 파일 업로드가 안 되니? 폼 속성에 enctype은 추가 했니? --%>
<form action = "write" method = "post" enctype = "multipart/form-data">
<table>
	<tr>
		<th> 글제목 </th>
		<td> <input type = "text" name ="title" id ="title">  </td>
	</tr>
	<tr>
		<th> 글내용 </th>
		<td> <input type = "text" name ="content" id ="content"> </td>
	</tr>
	<tr>
		<th>파일첨부</th> 
		<td>
			<input type="file" name="upload" size="30">
		</td>
	</tr>
	<tr>
		<th> 완료</th>
		<td> <input type = "submit" value = "전송"> </td>
	</tr>
	<tr>
		<th> </th>
		<td> </td>
	</tr>

</table>
</form>
<a href = "<c:url value = "/board/list"/>"> 뒤로가기 </a>

<c:if test = "${ boardFlag != null }">
	<c:if test = "${ boardCheck }">
		<p> 글이 저장되었습니다. </p>
	</c:if>
	<c:if test = "${ !boardCheck }">
		<p> 다음에 다시 시도해 주세요. </p>
	</c:if>
</c:if>

</body>
</html>