<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src= "resources/jsfiles/jquery-3.3.1.min.js"></script>
<script>
$(document).ready(
	function(){
		$('#formButton1').on('click', formsubmit1);	
		$('#formButton2').on('click', formsubmit2);	
		$('#formButton3').on('click', formsubmit3);			
		$('#formButton4').on('click', formsubmit4);
		$('#divButton1').on('click', divoutput1);
		$('#divButton2').on('click', divoutput2);

	}	
);

function formsubmit1(){
	var n = $('#name').val();
	var a = $('#age').val();
	var p = $('#phone').val();
	$.ajax({
		<%-- url 은 문자열로 한다. 작은 따옴표로 넣어야 --%>
		url: 'insertForm'
		, type:	'GET'//이게 method
		//, dataType:	//받아올 데이터의 자료형, 타입
		, success: function() { alert('저장되었습니다.'); }	//성공했을 때 뭐 실행
		, error: function(e){ alert(JSON.stringify(e)); }	//
		, data: {name: n, age:a, phone:p}
		//여기서 앞은 서버에 보낼 때 무슨 이름으로 보내줄지, 뒤에 거는 그 이름에 무슨 값 담아 보내줄지
	});
}

function formsubmit2(){
	var n2 = $('#name2').val();
	var p2 = $('#phone2').val();
	var a2 = $('#age2').val();
	<%-- 자바의 VO객체 Person으로 받기. name,age,phone이라는 멤버변수 갖는 객체로 받기 --%> 
	$.ajax({
		url: 'insertForm2'
		, type: 'POST'
		, data: {name: n2, phone: p2, age: a2}
		, success: function(){ alert('저장되었습니다.'); }
		, error: function(e){ alert(JSON.stringify(e)); }
	});
}

function formsubmit3(){
	var n3 = $('#name3').val();
	var p3 = $('#phone3').val();
	var a3 = $('#age3').val();
	<%-- 자바의 VO객체 Person으로 받기. name,age,phone이라는 멤버변수 갖는 객체로 받기 --%> 
	$.ajax({
		url: 'insertForm3'
		, type: 'POST'
		, data: $('#writeForm3').serialize() //그 폼의 값들을 다 알아서 차례로 하나씩 보내 줌
		, success: function(){ alert('저장되었습니다.'); }
		, error: function(e){ alert(JSON.stringify(e)); }
	});
}

function formsubmit4(){
	var n4 = $('#name4').val();
	var p4 = $('#phone4').val();
	var a4 = $('#age4').val();
	<%-- 자바의 VO객체 Person으로 받기. name,age,phone이라는 멤버변수 갖는 객체로 받기 --%> 
	$.ajax({
		url: 'insertForm4'
		, type: 'POST'
		, data: {name: n4, phone: p4, age: a4}
		, success: function(){ alert('저장되었습니다.'); }
		, error: function(e){ alert(JSON.stringify(e)); }
	});
}


function divoutput1() {
	$.ajax({
		url:'jsontest'
		, type : 'GET'
		, dataType: 'text'
		, success: function(p1) { $('#divout1').html(p1); }
		, error: function(e) { alert( JSON.stringify(e) ); }
	});
	
}
//text로 출력해 보고, 안에 뭐가 들어있나 보고, 다시 JSON 객체로 바꿔서 그 속성이나 값들을 활용
function divoutput2() {
	$.ajax({
		url:'jsontest'
		, type : 'GET'
		, dataType: 'json'
		, success: function(p1) { 
			var str = '이름은: ' + p1.name;
			str = str + '나이는: ' + p1.age;
			str = str + '번호는: ' + p1.phone;
			$('#divout2').html(str);
			
			$('#divout3').html('<table border = "1"><tr><td>이름: </td><td>' + p1.name + '</td></tr><tr><td>나이: </td><td>' + p1.age + '</td></tr><tr><td>번호: </td><td>' + p1.phone + '</td></tr></table>')
		}
		, error: function(e) { alert( JSON.stringify(e) ); }
	});
	
}
</script>

<title>Insert title here</title>
</head>
<body>

<h3> [Ajax 서버와 통신하기2] </h3>
<form id = "writeForm1">
이름<input type = "text" id = "name"><br>
나이<input type = "text" id = "age"><br>
전화<input type = "text" id = "phone"><br>
<input type ="button" id = "formButton1" value = "저장"><br>
</form>
<br>
<form id = "writeForm2">
이름<input type = "text" id = "name2"><br>
나이<input type = "text" id = "age2"><br>
전화<input type = "text" id = "phone2"><br>
<input type ="button" id = "formButton2" value = "저장"><br>
</form>
<br>
<%-- 이거는 name으로 서버에 보내기. 서버 쪽에서 parameter로 받든 vo객체로 받든
name이랑 서버쪽 이름이랑 잘 맞아야 함. 여전히 action은 없음. action 있으면
그 페이지로 떠나는 거잖아.--%>
<form id = "writeForm3">
이름<input type = "text" name = "name3"><br>
나이<input type = "text" name = "age3"><br>
전화<input type = "text" name = "phone3"><br>
<input type ="button" id = "formButton3" value = "저장"><br>
</form>

<form id = "writeForm4">
이름<input type = "text" name = "name4"><br>
나이<input type = "text" name = "age4"><br>
전화<input type = "text" name = "phone4"><br>
<input type ="button" id = "formButton4" value = "저장"><br>

</form>
<input type ="button" id = "divButton1" value = "Person 객체 받아오기"><br>
<div id = "divout1"></div><br>

<input type ="button" id = "divButton2" value = "json으로 person객체"><br>
<div id = "divout2"></div><br>

<input type ="button" id = "divButton3" value = "json으로 person객체"><br>
<div id = "divout3"></div><br>
</body>
</html>