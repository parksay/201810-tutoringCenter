<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src = "resources/jsfiles/jquery-3.3.1.min.js"> </script>
<script>
$(document).ready(
	function() {
	//버튼 클릭하면 함수 실행
	$('#bt1').on('click',call1);
	$('#bt2').on('click',call2);

}
)

function call1(){
	alert('call1 실행');
	
	$.ajax({
		url: 'jxtest1'
		, type:'GET'
		, dataType: 'text'
		, success: output1
		, error:	
			function(e){
				alert(e);
			<%-- 그냥 넣어 두면 객체라고 object라고만 나오는데, 그 값을 꺼내서 문자열로 받아오는 기능이 있음 --%>
				 alert( JSON.stringify(e) ); }
	});


}

function output1(){
alert('output1로 나옴');

}

function call2(){
	$.ajax({
		url: 'jxtest2'
		, type: 'GET'
		, data: {str: 'abcd'} <%-- 숫자는 그냥 쓰면 되고 문자열은 따옴표 써서 --%>
		, dataType: 'text'
		, success: output2
		, error: function(){ 	alert('오류남');		}	
	<%-- http://localhost:8888/ajax/jxtest2?str=abcd 이렇게 가는 객체임 --%>
	});
}
	
function output2(s){
		alert('서버에서 가져온 값: ' + s);
	}
	
</script>
<title>Insert title here</title>
</head>
<body>
<h3>[Ajax로 서버와 통신하기]</h3>

<input type = "button" id = "bt1" value = "서버 호출"> <br>
<input type = "button" id = "bt2" value = "서버와 데이터 주고 받기"> <br>



</body>
</html>