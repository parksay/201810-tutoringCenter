<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> ${ number } </h2>
 [ EL & JSTL (코어 라이브러리) ]
 
 <ul>
 	
 	<li> 숫자 출력 </li>
 	<p> ${ nubmer } </p>
 
 	<li> 문자열 출력 </li>
 	<p> ${ str } </p>
 	
 	<li> 문자열 출력 </li>
 	<p> ${ list } </p>
 </ul>
 
 <c:if test = "${ str == 'abcd' }">
	<p> number는 100보다 작다. </p>
 </c:if>
 
 <c:if test = "${ 100< number && number <10000000 }">
 	<p> number는 사이다 </p>
 </c:if>
 
 <c:forEach var = "cnt" begin = "1" end = "5">
 <p> 반복 ${cnt } </p>
 </c:forEach>
 
 <c:forEach var = "i" begin = "0" end = "${ list.size() -1 }">
 <p> ${ list.get(i) } / ${ list[i] } </p>
 </c:forEach>
 
 <c:forEach var = "value" items = "${ list }">
 <p> ${ value } </p>
 </c:forEach>
 
 
 <table border = "1">
	 <tr>
		 <th> 이름 </th>
		 <th> 나이 </th>
		 <th> 번호 </th>
		 <th> 주소 </th>
	</tr>
 <c:forEach var="person" items="${ plist }">
	 <tr>
		 <td> ${ person.name } </td>
		 <td> ${ person.age } </td>
		 <td> ${ person.phone } </td>
		 <td> ${ person.adress } </td>
	 </tr>
 </c:forEach>
 
 </table>
 
 <c:choose>
 <c:when test = "${number < 200 && number > 100 }">
 <p> hello hi here </p>
 </c:when>
 <c:when test = "${ number < 300 && number > 200 }">
 <p> there hi hello </p>
 </c:when>
 <c:when test = "${ number < 400 && number > 300 }">
 <p> hi big world there </p>
 </c:when>
 </c:choose>
 
 <li> 제어문 - choose </li>
 <p> </p>
 
 <li> 문자열 분리 - forTokens</li>
 <p> ${ phone }</p>

  <c:forTokens var = "token" items = "${ phone }" delims = "-">
  	<p> 분리된 문자열 - out : ${ token } </p>
  	</c:forTokens>
  	 
 <li> 특수문자 출력 - out </li>
 <p> ${ data }</p>
 <p> <c:out value = "${ data }"> </c:out>
 
 <li> URL 생성 - url </li>
 <c:url value = "/jsp1"> </c:url>
 <p> <a href = "/jsp1"> jsp1로 이동 </a></p>
 <p> <a href = "<c:url value = "/jsp1"> </c:url>">jsp1로 이동</a></p>
  

  	
  
  
 
</body>
</html>