<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix=  "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<link href = "../resources/css/board.css" type = "text/css" rel = "styleSheet">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 상단 메뉴 바 --%>

<table class = "menutable">
	<tr>
		<td class = "menu"> <a href = "">게시판1 </a></td>
		<td class = "menu"> <a href = "">게시판2 </a></td>
		<td class = "menu"> <a href = "">게시판3 </a></td>
		<td class = "menu"> <a href = "">게시판4 </a></td>
	</tr>
</table>


<%-- 글 보기 메인 창 --%>
<table class = "windowtable">

	<tr>
		<th class = "windownum">글번호 : </td>
		<td>${ board.boardnum }</td>
		<th class = "windowid">작성자 : </td>
		<td>${ board.id }</td>
		<th class = "windowtitle"> 글 제목: </td>
		<td class = "wintitle">${ board.title }
		<th class = "windowdate">작성일 : </td>
		<td> ${ board.inputDate }</td>
		<th class = "windowhit">조회수 : </td>
		<td>${ board.hits }</td>
	</tr>
	<tr>
		<td colspan = "10"> 
			<div class = "boardcontent">
				<img src = "image/dog/d001.GIF">
				${ board.content }
			</div>
		</td>
	</tr>
	
	<tr>
		<td class = "goback" colspan = "5"> 
			<a href = "<c:url value = "/board/list"/>">
				<input type= "button" value = "목록으로"  >
			</a>
		</td>
		<c:if test = "${ requestScope.board.id == sessionScope.custid}"> 
			<td class = "writereply" colspan = "5">
				<form action = "<c:url value = "/board/revise"/>" method = "post">
					<input type = "hidden" name = "id" value = "${ custid }">
					<input type = "hidden" name = "boardnum" value = "${ board.boardnum }">
					<input type = "submit" value = "글 수정">
				</form>
			</td>
		</c:if>
	</tr>
	<tr>
		<th>첨부파일 다운로드</th>
		<td>
		<!-- 첨부된 파일이 있는 경우, 해당 파일을 다운로드 할 수 있는 링크 제공 -->
			<c:if test="${board.originalFile != null}">
				<a href="download?boardnum=${board.boardnum}">
					${board.originalFile}
				</a>
			</c:if>
		</td>
	</tr>
</table>


<%-- 댓글 출력 --%>
<table class = "schtable">
	<%-- 로그인 중이라면 댓글 작성 가능 --%>
	<c:if test = "${ custid != null }">
		<tr>
			<td>
				<form id = "replyform" action = "replyWrite" method = "post" onSubmit= "return reply()">
				댓글작성:
				<input type = "hidden" name = "boardnum" value = "${ board.boardnum }"/>
				<input type= "text" name = "text" id = "retext" style = "width:300px;"/>
				<input type = "submit" value = "확인" />
				</form>
			</td>
		</tr>
	</c:if>
	
	<tr>
		<th>작성자</th>
		<th>댓글 내용</th>
		<th>작성일</th>
	</tr>
	
<c:forEach var = "rlist" items = "${ rlist }" >
	<tr>
		<td>${ rlist.id }</td>
		<td>${ rlist.text }</td>
		<td>${ rlist.inputDate }</td>
		<td>
			<c:if test="${rlist.id == sessionScope.custid}">
				[<a href="javascript:replyDelete(${reply.replynum}, ${reply.boardnum })">삭제</a>]
			</c:if>
		</td>
	</tr>
</c:forEach>
</table>
</body>
</html>