<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src = "resources/jsfiles/jquery-3.3.1.min.js"></script>
<script>
var i =0;
var linkar = ['https://www.naver.com','/www.daum.net','/www.kyobobook.co.kr','/www.ypbooks.co.kr']
$(document).ready(
	function() {
		$('#bt1').on('click', test1);
		$('#bt2').on('click', test2);
		$('#bt3').on('click', test3);		
		$('#bt4').on('click', test4);		
		$('#bt5').on('click', test5);		
		$('#bt6').on('click', test6);
		
		$('#array').on('click', array);		
		$('#img1').on('click', imgTest);
		$('#linktest').on('click',linktest);
		setInterval(
			function() {
				$('#linktest2').attr( 'href', linkar[i] );
				$('#linktest2').html( linkar[i] );
				i = i + 1
				if ( i == linkar.length ) { i = 0}
			} , 2000 );
		$('#texthtml').on('click', texthtml);
		$('#inputread').on('click', inputread);

		
	}
);
function test1() {
	$('#test1').addClass('text3');
}
function test2() {
	$('#test1').removeClass('text3');
}
function test3() {
	$('p').addClass('text4');
}
function test4() {
	$('p').removeClass('text4');
}
function test5() {
	$('p').after('<br>');
}
function test6() {
	$('p').before('<!--');
	$('p').after('-->');
}

function array() {
	var ar1 = [10, 20, 30, 40, 50];
	var ar2 = ['aaa','bbbbbb','c','dddd'];
	$(ar1).each(
		function (
		<%--첫번째 패러미터는 첨자 변수, 자료형은 항상 숫자 --%> i
		, <%--두 번째 패러미터는 배열의 각각 값, 자료형은 그때그때 다름--%>j){
			<%-- 이렇게 하면
			첫 회에서 0,10
			둘째 회에서 1,20
			셋째 회에서 2,30 ...
			값의 자료형은 다른 거일 수도. 객체일 수도.
			--%>
		alert(i+','+j);		
		}	
	);
	$(ar2).each( 
		function(x, y) {
			alert( x + '번째 길이는' + y.length );
		}
	);	
}

function imgTest(){
	var src = $('#img1').attr('src');
	<%-- if 구문 조건문 안에는 비교할 때 == 쓰기 --%>
	if( src == 'resources/imgfiles/a.jpg' ) {
		$('#img1').attr('src', 'resources/imgfiles/d097.JPEG');
		} else {
		$('#img1').attr('src', 'resources/imgfiles/a.jpg');		
	}
}

function linktest(){
	$('#linktest').removeAttr('href');
	
}

function texthtml(){
	var a = $('#outputdiv').html();
	var b = $('#outputdiv').text();	
	alert( a );
	<%--바로 넣어도됨--%>
	alert( $('#outputdiv').text() );
	
	
	<%-- html은 여는 태그와 닫는 태그 사이의 값, text는 문자열만 읽어 옴. --%>
	var c = $('p').html();
	var d = $('p').text();
	alert( c );
	alert( d );
	
	$('p').each(
		function( i, ob) {
		<%-- 각각의 p 태그들을 객체로 취급, 하나씩 꺼내오면서 ob라는 패러미터에 넣어서 아래 함수 실행 --%>
			alert( $(ob).html() );
		}
	);
}

function inputread() {
	var x = $('#inputdiv').html();
	x = x + '입력: <input type = "text"><br>';
	$('#inputdiv').html(x);
	alert(x);
	
}
</script>

<style>
.text1 { color: blue; font-size:10px; }
.text2 {color: green; font-size:20px;}
.text3 {font-size:30px; font-weight: bolder;}
.text4 {text-align:center; border: 1px solid blue; }

</style>


<title>Insert title here</title>
</head>
<body>
<h1>[문서 객체 다루기]</h1>
<input type = "button" id = "bt1" value = "클래스 속성 추가"> <br>
<input type = "button" id = "bt2" value = "클래스 속성 삭제"> <br>
<input type = "button" id = "bt3" value = "전체에 클래스 속성 추가"> <br>
<input type = "button" id = "bt4" value = "전체에 적용된 클래스 속성 삭제"> <br>
<input type = "button" id = "bt5" value = "전체 한칸씩 띄기"> <br>
<input type = "button" id = "bt6" value = "숨기기"> <br>
<input type = "button" id = "array" value = "array"> <br>

<p> p 태그 비교군 클래스 없음 </p>
<p class ="text1"> p 태그 text1 클래스 </p>
<p class ="text2"> p 태그 text2 클래스 </p>
<p id = "test1"> p 태그 쿼리로 만지는 테스트용</p>
<br>
<a href = "www.naver.com" id = "linktest">네이버로 가는 링크</a>
<br>
<a href = "" id = "linktest2">hi</a>
<br>
<!--  문서 객체 수정 -->
<input type  = "button" id = "texthtml" value = "문서 객체 내부 읽기">
<div id = "outputdiv"> 여기 뭔가 출력할 거임 </div>
<br>
<div id = "inputdiv"> 입력: <input type = "text"> </div>
<input type = "button" id = "inputread" value = "출력">


<pre>
이미지 클리하면 2개 번갈아 토글로 바뀜
링크 누르면 네이버로 가는 버튼인데, 링크 제거 버튼 후에는 클릭해도 작동 없음
3초마다 다른 이미지로 바뀜
</pre>

<img id = "img1" src = "resources/imgfiles/d097.JPEG" height = "500">
</body>
</html>