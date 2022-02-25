<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script>
//검색할 id 입력 했냐 안 했냐
function formCheck(){
	var id = document.getElementById('searchId');
	if (id.value.length < 3) {
		alert('검색할 ID를 3자 이상 입력');
		return false;
		
	}
	return true;
	
}
//Id사용 할 거냐 안 할 거냐
function selectId(){
	
	var id = opener.document.getElementById('custid');
	id.value = '${searchId}';
	this.close();
	
}
</script>

<title>Hello Big World</title>
</head>
<body>
<h3> [ID 중복 확인 ]</h3>

<form action = "idCheck" method = "post" onsubmit = "return formCheck();">

검색할 ID <input type = "text" name = "searchId" id = "searchId" value = "${ searchId }">
		<input type = "submit" value = "검색">
</form>
<br>
${ search } <br>
${ searchResult }
<c:if test ="${search}">
	<c:if test ="${searchResult == null}">
		<p> 사용할 수 있는 ID입니다. </p>
		<p> <a href ="javascript:selectId()"> 사용하기 </a></p>
	</c:if>
		
	<c:if test = "${searchResult != null}">
		<p> 이미 사용중인 ID입니다. </p>
	</c:if>
</c:if>
</body>
</html>