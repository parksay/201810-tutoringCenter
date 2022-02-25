function formSubmit(num) {
	
	var f = document.getElementById('form'+num);
	var p = document.getElementById('pw'+num);
	
	if(p.value.length < 1) {
		alert('비밀번호를 입력하세요.');
		return;
	}
	
	if (confirm('삭제하시겠습니까?')) {
		f.submit();
	}
	
	return;
	
}