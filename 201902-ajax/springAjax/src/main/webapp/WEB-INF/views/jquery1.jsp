<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src = "resources/jsfiles/jquery-3.3.1.min.js"></script>
<script>
$(document).ready( function() {
	
	$('h3').css('color', 'red');
	$('p').css('color', 'green');
	$('.bluetext').css('color', 'blue');
	$('#redtext').css('color', 'red');
	$('[src$=jpg]').css('height','10');
	$('div').css('font-style','italic');
	$('#p1').css('text-align','right');
	$('td,th[id$=1]').css('font-style','italic');
	$('td,th[id$=1]').css('color','#F8C2A9');
	$('#td2').css('font-style', 'justify');
	$('table[id*=2]').css('color','#178F92');
} );


</script>
<title>Insert title here</title>
</head>
<body>
<h3>[jQuery 기본 문법]</h3>
<li><a href = "javascript:test1()"></a></li>
<p> p태그 이용한 문자열 </p>
<p class = "bluetext"> class를 이용한 문자열 </p>
<p id = "redtext"> id를 이용한 문자열 </p>
<img src = "resources/a.jpg">

<div class = "divtext" id = "div1"> 이것은 div 1이지.</div> <br>
<div> 이것은 그냥 div지. 비교군이지</div>
<p class = "ptext" id = "p1"> 이것은 p1이지.<br>
<p>  이것은 그냥 p지. 비교군이지 </p>

<table id = "tb1">
	<tr>
		<th>제목1</th>
		<th id="th1">제목2</th>
		<th id ="th2">제목3</th>
	</tr>
	<tr id = "tr1">
		<td><div>내용1</div></td>
		<td id = "td1">내용2</td>
		<td id = "td2">내용3</td>
	</tr>
</table>
<table id = "tb2">
<tr>
<td>테이블2</td>
</tr>
</table>
</body>
</html>