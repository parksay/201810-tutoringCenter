<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src = "resources/jsfiles/jquery-3.3.1.min.js"></script>
<script>
<%-- 문서 객체가 준비가 완료되면 실행 --%>
$(document).ready(
	function() {
		<%--이벤트 발생할 때마다 해주기.--%>
		$('#bt2').on('click', bt2Click);
		<%--이벤트 연결 한 번만 해주기.--%>
		$('#bt1').one('click', bt1Click);
		$('#bt3').on('click', bt3Click);
		$('#bt4').on('click', bt4Click);
		$('img').on('click', pop);
		$('#text1').on('keyup',printkey)
	}
);

function bt1Click() {
	alert('클릭 이벤트');
}
function bt2Click() {
	<%--이벤트 연결 끊어 주기.--%>
	$('#bt1').off('click');
}
function bt3Click() {
	$('#bt1').off('click');
	$('#bt1').off('click');
	$('#bt1').off('click');
	$('#bt1').on('click', bt1Click);
}
function bt4Click() {
	hi.close();
	clearInterval(itv);
}
var hi;
var itv;
function pop() {
	
	hi = window.open('resources/imgfiles/e027.JPEG','a','width=200, height=300');
	$('#hello').html('hhhhhhhhhhhhhhhhh');
	itv=setInterval(
		function(){
			hi.moveBy(5,5);
			$('#hello').after('hhhhhhhhhhhhhhhhh<br>');
		}
	, 50);
	
}
function printkey() {
	var content = $('#text1').val();
	$('#hello').html(content);
	
}
</script>
<title>Insert title here</title>
</head>
<body>
<h2>[jQuery 이벤트 처리]</h2>

<p>
jquery 불러오기
ready 는 onload 처럼 열림과 동시에 실행
여러개 있어도 순서대로 모두 실행

이벤트 연결은 on 끊는건 off
이벤트 - 클릭,더블클릭, 마우스 갖다 대기, 등등 여러 가지
</p>

<input type = "button" id="bt1" value = "버튼1"><br>
<input type = "button" id="bt2" value = "버튼2"><br>
<input type = "button" id="bt3" value = "버튼3"><br>
<input type = "button" id="bt4" value = "닫기"><br>
<input type = "text" id = "text1" value ="키 이벤트 시험용"><br>
<div><img src = "resources/imgfiles/a.jpg" height = "200"></div><br>
<div id = "hello"></div>

</body>
</html>