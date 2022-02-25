<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function arrayTest1() {
	<%-- 그냥 변수라고만 알려주고 애들 여러개 넣으면 저절로 array로 알아 먹고 자료형 알아서 세팅해줌
	자바는 { ~~~ } 였지만 javascript 는 [ ~~~ ] 나머지는 비슷 --%>
	
	var array = [32, 324, 32, 256, 34];
	alert('전체 출력: '+array);
	alert('0번째 출력:' +array[0]);
	
	for (var i = 0; i < array.length - 1 ; i = i + 1) {
		
		alert(array[i]);
	}
}

var array = [];
<%-- text창으로 입력 받아서 입력 받은 내용을 arraylist에 넣어주고 arraylist를 화면에 출력해주기 --%>
function arrayTest2() {
	var add = document.getElementById('content');
	array.push(add.value);
	add.value = '';
	alert(array);
	var print = document.getElementById('ar');
	print.innerHTML = array;
	<%-- centent 라는 id를 가진 tag로 커서를 위치시켜 놓기 (그냥 없어도 되지만 편의상 해보자면)--%>
	content.focus();
}
	
function stringTest1() {
	var text = document.getElementById('content');
	var output = document.getElementById('print');
	var print = document.getElementById('ar');
	var n = text.value.length;
	print.innerHTML = '길이: ' + n;
}

function stringTest2() {
	var text = document.getElementById('content');
	var output = document.getElementById('print');
	var print = document.getElementById('ar');
	var n = text.value.substring(0,1);
	print.innerHTML = '0번째: ' + n;
}

</script>
</head>
<body>
<h1>[ 자바 기본 문법 ]</h1>

<ul>
<li> <a href = "javascript:arrayTest1()"> 배열 사용 </a> </li>
<li> <a href = "javascript:"></a> </li>
<li> <a href = "javascript:"> </a> </li>
<li> <a href = "javascript:"> </a> </li>

</ul>
<input type = "text" id = "content">
<p><input type = "button" onclick = "arrayTest2()" value = "배열 내용 추가"></p>

<p><input type = "button" onclick = "stringTest1()" value = "문자열의 길이"></p>
<p><input type = "button" onclick = "stringTest2()" value = "0번째 글자"></p>

<div id = "ar"> </div>
</body>
</html>