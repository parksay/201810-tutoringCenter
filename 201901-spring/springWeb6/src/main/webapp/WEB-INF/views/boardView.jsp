<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table class = "menutable">
	<tr>
		<td class = "menu"> <a href = "">게시판1 </a></td>
		<td class = "menu"> <a href = "">게시판2 </a></td>
		<td class = "menu"> <a href = "">게시판3 </a></td>
		<td class = "menu"> <a href = "">게시판4 </a></td>
	</tr>
</table>


<table class = "windowtable">

	<tr>
		<td class = "windownum">글번호 : </td>
		<td> 1</td>
		<td class = "windowid">작성자 : </td>
		<td> aaa</td>
		<td class = "windowtitle"> 글 제목: </td>
		<td class = "wintitle"> 글1
		<td class = "windowdate">작성일 : </td>
		<td> 2018-12-24</td>
		<td class = "windowhit">조회수 : </td>
		<td> 34</td>
	</tr>
	<tr>
		<td colspan = "10"> 
			<div class = "boardcontent">
				<img src = "image/dog/d001.GIF">
			</div>
		</td>
	</tr>
	<tr>
		<td class = "goback" colspan = "5"> 
			<a href = "dogboard.html">
				<input type= "button" value = "목록으로">
			</a>
		</td>
		<td class = "writereply" colspan = "5">
			<input type = "button" value = "댓글쓰기">
		</td>
	</tr>
</table>



</body>
</html>