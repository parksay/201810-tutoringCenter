<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href = "../resources/css/board.css" rel = "stylesheet" type = "text/css">
<script>
function formSubmit(page) {
	
	var f = document.getElementById('pagingForm'); //검색폼
	var p = document.getElementById('page'); //히든 항목
	p.value = page;
	f.submit();
	
}

</script>
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

총 글 수 ${ total }

<table class = "boardtable">
	<tr>
		<td colspan = "5" class = "pagecategory">게시판1</td>
	</tr>
	<tr >
		<th class = "boardnum">글 번호</th>
		<th class = "boardid">작성자</th>
		<th class = "boardtitle" >글 제목</th>
		<th class = "boarddate">작성일</th>
		<th class = "boardhit">조회수</th>
	</tr>
<c:forEach  var = "i" items = "${ list }">
	<tr>
		<td class = "boardnum" >${ i.boardnum }</td>
		<td class = "boardid" >${ i.id }</td>
		<td class = "boardtitle">
				<a href = "view?boardnum=${ i.boardnum }" >${ i.title }</a>
		</td>
		<td class = "boarddate" >${ i.inputDate }</td>
		<td class = "boardhit" >${ i.hits }</td>
	</tr>
</c:forEach>
</table>

<%-- <c:forEach var = "i" begin= "0" end = "${ list.size() - 1}" > ${ list[i].boardNum } --%>

<form id = "pagingForm" method = "get" action = "list" class = "schtable">
			<select class ="schselect">
				<option>글 번호</option>
				<option>작성자</option>
				<option>글 제목</option>
				<option>작성일</option>
			</select>
			<input type = "text" class = "schwords" name = "searchText" value = "${ searchText }">
			<input type = "button" value = "검색" onclick = "formSubmit(1)">
			<input type = "hidden" name = "page" id= "page" value = "1">
			<a href = "write"><input type = "button" value =  "글 쓰러 가기 "></a>
			</form>
			
<%--  페이지 이동 부분  --%>

<div id = "navigator" class = "navigator">
	<a href = "javascript:formSubmit(${ navi.currentPage - navi.pagePerGroup })"> ㅕㅕ</a> &nbsp;
	<a href = "javascript:formSubmit(${ navi.currentPage - 1 })"> ㅓ </a> &nbsp; &nbsp;
	
	<c:forEach var = "counter" begin = "${ navi.startPageGroup }" end = "${ navi.endPageGroup }">
		<c:if test = "${ counter == navi.currentPage }"> <b> </c:if>
			<a href = "javascript:formSubmit(${ counter })">${ counter} </a> &nbsp;
		<c:if test = "${ counter == navi.currentPage }"> </b> </c:if>
	</c:forEach>
	&nbsp; &nbsp;
	<a href = "javascript:formSubmit(${ navi.currentPage + 1 })"> ㅏ </a> &nbsp; &nbsp;

	<a href = "javascript:formSubmit(${ navi.currentPage + navi.pagePerGroup })"> ㅑㅑ </a> 
</div>
<%--  페이지 이동 끝 --%>


<a href = "<c:url value = "/"/>"> 홈으로 </a>

</body>
</html>