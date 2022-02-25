<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src = "resources/jsfiles/jquery-3.3.1.min.js"></script>
<script>

$(document).ready(
	function(){
		$('#cmtSubmit').on('click', submit1);

		list();
});

function submit1(){
	var userid = $('#userid').val();
	var content  = $('#content').val();
	$.ajax({
		url: 'inputCmt'
		, type: 'POST'
		, data: {name: userid, text: content} //이렇게 보낼 거면 id 가지고 val값 가져와서 보내주는 거고
			//$('#cmtForm').serialize() 이렇게 보낼 거면 tag에  name들 붙여 줘야 하고
		, dataType: 'json'
		, success: function(n){ alert('저장되었습니다' + n);}
		, error: function(e) { alert(JSON.stringify(e)); }
	
	});
	list();
}

function list(){
	$.ajax({
		url: 'list'
		, type: 'get'
		, dataType: 'json' //일단 text로 받아서 출력해보고 그 안의 내용을 확인한 후에 json으로 받기
		, success: output
		, error: function(e) { alert( JSON.stringify(e)); }
	});
}

function output(list){
	var str = '<table>';
	$.each(list, function(key,item){
		str += '<tr>';
		str = str + '<td class ="tdNum">' + item.num + '</td>';
		str = str + '<td class ="tdName">' + item.name + '</td>';
		//나중에 밑에서 수정이나 삭제할 거 고려해서 datanum 속성 넣어 둠
		str = str + '<td class ="tdText" datanum="'+item.num+ '" id = "text'+item.num+'">' + item.text + '</td>';
		str = str + '<td><input type = "button" value = "수정" class = "btnUpd" datanum="'+item.num+'"></td>';
		str = str + '<td><input type = "button" value = "삭제" class = "btnDel" datanum="'+item.num+'"></td>';
		str = str + '</tr>';
	});
	str = str + '</table>';		
		
	$('#listDiv').html(str);
	$('.btnDel').on('click',commentDel);
	$('.btnUpd').on('click',commentUpd);
	}	



//리플 삭제
function commentDel(){
	//this 라는 명령어: 이 이벤트랑 연결된 그 객체를 this라고 부름
	var num = $(this).attr('datanum');
	$.ajax({
		url: 'delCmt'
		, data: {num: num}
		, dataType: 'text'
		, type: 'POST'
		, success: function(num){ alert('삭제 성공' + num); }
		, error: function(e){ alert( JSON.stringify(e) ); }
		
	});
	list();
}

// 댓글 수정 누르면 텍스트 창이 나타나면서 수정 내용 입력 받게 만들기, 기존의 '수정'이라는 버튼은 '완료' 버튼으로 바뀜
//그리고 그 버튼에 한해서, 다시 이벤트처리 해줌. 다른 버튼까지 기본적으로 다 이벤트 연결해 놓으면,
//'수정'누르기 전 버튼인지, '수정'누른 후 버튼인지 모름. 이거 수정한다 눌러놓고 다른거 '수정'버튼 누르면 수정 완료 되버림
//input text 태그에 value 받아올 거 대비해서 id에 num 붙여 주기
function commentUpd(){
	var num = $(this).attr('datanum');
	var textid = '#text' + num;
	var str = '<input type = "text" id = "updtext'+num+'">';
	$(textid).html(str);
	$(this).attr('value','완료');
	$(this).on('click',updateCmt);
}

//input태그의 value를 받아 와서 ajax로 보내버리기. 근데 input태그 value를 못 받아오네
function updateCmt(){
	var num = $(this).attr('datanum');
	alert(num);
	var updtxtID = '#updtext'+ num;
	alert(updtxtID);
	var updcont = $(updtxtID).val();
	alert(updcont);
	$.ajax({
		url: 'updtest'
		, type: 'POST'
		, data: {text: updcont}
		, success: function(){ alert('수정 성공'); }
		, error: function(){ alert('수정 실패'); }
	});
	list();
	
	
}



</script>

<title>Insert title here</title>
</head>
<body>
<h3>[댓글 작성 및 저장 연습]</h3>

<div id = "formDiv">
<form id = "cmtForm">
댓글 작성자: <input type = "text" id = "userid" >
<br>
댓글 내용: <input type = "text" id = "content">
<br>
<input type = "button" id = "cmtSubmit" value = "완료">
</form>
</div>
<br>

<div id = "listDiv">

</div>
</body>
</html>