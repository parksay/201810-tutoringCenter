<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>js5</title>
<script>

var win;
var w = 300;
var h = 300;
var x = 0;
var y = 0;
var num = 30;
var xnum = num;
var ynum = 0;

window.onload = function() {
	win = window.open('', 'moveWin', 'width=300,height=300,left=' + x + ',top=' + y);
	win.document.write('<head><body><h1>* 새 창 *</h1></body></html>');
	setInterval(moveWindow, 20);
}

function moveWindow() {
	if (x >= screen.availWidth - w - num && y <= 0) {
		xnum = 0;
		ynum = num;
	}
	if (x >= screen.availWidth - w - num && y >= screen.availHeight - h - num) {
		xnum = -num;
		ynum = 0;
	}
	if (x <= 0 && y >= screen.availHeight - h - num) {
		xnum = 0;
		ynum = -num;
	}
	else if (x <= 0 && y <= 0) {
		xnum = num;
		ynum = 0;
	}
	x += xnum;
	y += ynum;
	win.moveTo(x, y);
	win.focus();
}

function closeWindow() {
	clearInterval(moveWindow);
	win.close();
}
</script>
</head>
<body>
<h1>[ 브라우저 객체 모델 ]</h1>

<p><a href="javascript:closeWindow()">닫기</a></p>

</body>
</html>
