<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
<%-- 다른 모든 메소드에서 접급할 수 있게끔, 전역 변수로 선언 --%>
var win = null;
function test1() {
	
	<%-- open(주소/창의 이름,id /새 창의 크기);--%>
	win = window.open('', 'w', 'heigt = 50, width = 50'); <%-- 창의 이름, 같은 이름은 한 개까지만 열림 --%>
}

<%-- test1() 실행할 때 만들었던 객체를, test2()에서 가리키고 싶어, 걔를 불러다가
다른 함수,기능(크기 조절이라든가)하고 싶어-> 객체를 전역변수로 선언하면 되지.
우리 눈에 보이는 이 창은, 프로그래밍 언어 입장에서 보면 그냥 객체 --%>

function test2() {
	<%--상대적 이동, 기존에 새로운 창인 win 의 위치로부터, 상대적으로 얼만큼 위치시킬지 --%>
	win.moveBy(5,5);
	<%-- 절대적 이동, 기존 창 위치는 모르겠고, 여기로 움직여라 --%>
	win.moveTo(20,20);
	<%-- 이미 열린 창 크기를 바꿔라 --%>
	win.resizeTo(200,200);
	<%-- 이 창을 활성화 시켜라 --%>
	win.focus();
	
}

function test3() {
	<%-- document 객체는 어떤 윈도우 안에서 있는 객체. document.write('abc'); 지금 창에 있는 내용
	다 지우고 abc만 써놓음. 사실은 this.document 였는데 생략된 거.
	다른 창에서 내용 지우고 다른 거 쓰고 싶으면 그 창 이름.document.write(); 하면 됨 --%>
	win.document.write('Hello Big World!');
	win.focus();
	
}

function test4() {
	var w =screen.width;
	var h = screen.height;
	//alert(w + ',' + h);
	w = w/2;
	h = h/2;
	win.window.resizeTo(w,h);
	win.moveTo(w/2,h/2);
	win.focus();
	
}

function test5() {
	var url = location.href;
	var dv = this.document.getElementById('hi');
	dv.innerHTML = url;
	url = 'http://www.naver.com';
	locaton.href = url;
}

function test6() {
	
	//모바일로 접속했을 때는 http://localhost:8888/ajax/mobile로 이동
	//pc로 접속했을 때에는  http://localhost:8888/ajax/pc로 이동
	
	var dv = this.document.getElementById('hi');
	var dv2 = this.document.getElementById('hello');
	var user = navigator.userAgent;
	alert(user);
	var words = ['Mobile','Android','iPhone','Samsung', 'LG'];
	//등등 키워드로 하는 데도 있고, 화면 해상도로 결정하는 데도 있고
 	var t = 'false';
	alert(words);
	for(var i = 0; i < words.length; i = i + 1) {
		if(user.match(words[i],'i') != null ) { t = 'true'; dv2.innerHTML = user.match(words[i],'i'); break;}
	}
	
	<%-- str1.match(str2) 하면 리턴값은 str. str1이랑 str2랑 겹치는 문자열을 찾아서 반환해 줌
	str1.includes(str2) 하면 리턴값은 true or false. 겹치는 게 있으면 true 없으면 false --%>
	
	dv.innerHTML = user;
 

   	if( t=='true' )  {
		location.href = 'https://m.naver.com';
 	} else {
		location.href = 'http://www.daum.net';
	} 
}
var pop;
function test7() {
	pop = window.open( 'resources/e027.JPEG', 'pop', 'width = 200, height = 200' );
	setTimeout( 
		function() {
			alert('광고지롱~')
		}
	, 3000);
	var i =0;
	var j = 0;
	setInterval( 
		function(){
			
			pop.moveTo(i,j)
			i=i + 10;
			j = j + 10;
		}
	, 100);
}


</script>


<title>Insert title here</title>
</head>
<body>
<h1>[브라우저 객체 모델 ]</h1>
window 객체 연습
<input type = "button" value = "새 창 열기" onclick = "test1()"><br>
<input type = "button" value = "이미 열리 창의 크기 조절" onclick = "test2()"><br>
<input type = "button" value = "새 창 내용 바꾸기" onclick = "test3()"><br>
<input type = "button" value = "화면 크기 받아와서 그 반으로 창 크기 맞추기" onclick = "test4()"><br>
<input type = "button" value = "location객체  href 속성" onclick = "test5()"><br>
<input type = "button" value = "navigator 객체  userAgent 속성" onclick = "test6()"><br>
<input type = "button" value = "광고 팝업창 연습" onclick = "test7()"><br>
<br>
mobile 이냐 pc냐에 따라 다르게 이동<br>
user에 match
<div id = "hi"> </div> <br>
Chrome에 match
<div id = "hello"> </div>
</body>
</html>