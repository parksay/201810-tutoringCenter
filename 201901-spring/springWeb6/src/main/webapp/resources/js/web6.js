function formCheck() {
	var i = document.getElementById('custid');
	var p = document.getElementById('psw');
	var pc = document.getElementById('pswcheck');
	
	if (i.value.length < 3) {
		alert('아이디는 세 글자 이상 입력');
		return false;
	}
	
	if ( !psw.value.equals(pswcheck.value) ){
		alert('비밀번호 확인');
		return false;
	}
		return true;
}

function idCheck(){  
	
 window.open("idCheck", "idWin","top = 200, left = 500, width = 400, height = 400, menubar = no");	
	
	
	
	
}








