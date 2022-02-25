<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function test1() {
alert('test1() 실행');
}

function test2(str, num) {
	alert('전달된 문자열:' + str);
	var s = sum(num);
	alert(num + '까지의 합계:' + s);
}

function sum(n) {
	var s = 0;
	for (var i = 1; i<= m; i++) {
		s = s + i;
	}
	return s;
}

num1 = 0;
function test3() {
	var num2 = 0;
	num1++;
	num2++;
	alert('num1:' + num1 + '\nnum2:' + num2);
}

function test4() {
	document.write('출력한 내용');
}

function test5() {
	var dv = document.getElementById('div1');
	dv.innerHTML = '출력한 내용';
}

function test6() {
	//정수인 경우는 곱하기2 해서 결과 출력, 아닌 경우는 계산할 수 없다는 메세지 출력
	var sel = confirm('계속하시겠습니까?');
	alert(sel);
	var input = prompt('입력하세요');
	alert(input);
	var x = Number(input);
	if (x.isNaN) {
		alert('계산할 수 없습니다');
	} else {
		alert(2*x);
	}
	<%-- 위아래 차이는, 위에서는 x 변수에  Number 객체를 만들어서 넣어 준 거고,
	Number 클래스에 지원하는 isNaN이라는 이름의 멤버 메소드를 실행한 거고.
	Number객체.inNaN()을 실행한 거고. 아래에서는 isNaN(str) 이라는 함수로
	true or false 만 알아내고 싶은 거고.
	--%>
	if( isNaN(input) ) {
		alert('계산할 수 없습니다');

	} else {

		var y = parseInt(input);
		alert(2*y);
	}
	
	
}

</script>
</head>
<body>
<h2>[ JavaScript 기본 문법 ]</h2>
<!-- javascript의 실행 순서를 잘 봐라 -->
<script> alert('alert2'); </script>
<ul>
<li> <a href = "javascript:test1()">함수 정의, 호출</a></li>
<li> <a href = "javascript:test2('abc',5)">parameter의 전달과 리턴값</a></li>
<!-- javascript도 패러미터랑 리턴값이 있다 java랑 마찬가지-->
<!-- 저기 'abc'에 문자열 넣고 싶을 때, EL이랑 조합하려면 '${str}' 이렇게 해야지
그냥 ${str} 이러면, 얘는 뭐 변수명인가? 이런다고 -->

<li> <a href = "javascript:test3()"> 전역변수와 지역변수</a></li>
<!-- 여러번 실행할 경우, 로컬 변수는 실행할 때마다 다시 처음부터 시작하는데,
전역변수는 누적되지. 전역변수 num1은 시작하자마자 생성되고, 로컬 변수 num2는
생길지 영원히 안 생길지 몰라. 호출한다면, 그때 생기겠지-->
<li> <a href = "javascript:test4()">출력1  -write()함수</a></li>
<!-- id의 내용을 가져와서 새로운 jsp를 켜서  그 안에 출력해줌 -> 새창 열기 -->
<li> <a href = "javascript:test5()">출력2  -innerHTML함수</a></li>
<!--  현재창에서 바꿔줌  -->
<li> <a href = "javascript:test6()">출력3  -parseInt함수</a></li>
</ul>
<div id = "div1"> 이게 바로 내용 텍스트 </div>

페이지 열자마자 일정 시간 후에 페이지 넘어가기, 
클릭하면 일정 시간 후에 페이지 넘어가기,
페이지 열자마자 타이머 켜기, 클릭하면 끄기,
클릭하면 타이머 켜기, 클릭하면 끄기 
</body>
</html>