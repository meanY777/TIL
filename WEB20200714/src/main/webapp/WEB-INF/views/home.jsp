<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

<%-- 	<c:set var="id" value="test" scope="request"></c:set>

	${id}
	<br>
	
	<c:remove var="id" scope="page"/>
	${id} !!!!
	
	
	<br>

	<!-- if -->
	<c:if test="${not empty id}" >
		<p>${id}님 환영합니다.</p>
	</c:if>
	<!-- if -->
	
	<c:if test="${not empty str}">
		<p>${str}님 환영합니다.</p>
	</c:if>
	
	<c:choose>
		<c:when  test="${num<10}">
			${num }은 10보다 작다.
		</c:when>
		<c:otherwise>
			${num }은 10보다 크다.
		</c:otherwise>
	</c:choose>
	
	<br>
	
	<c:forEach var="s" item="${list}">
		${s}<br>
	</c:forEach>
	
	<table border = "1">
		<tr>
			<th>이름</th>
		</tr>
	</table>
	
	<c:forEach var ="s" item="${list}">
		<tr>
			<td>${s}</td>
		</tr>
	</c:forEach> 
	--%>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>아이디</th>
		</tr>
		
		<c:forEach  var = "vo" items="${list2}" varStatus ="status">
			<tr>
				<td>${status.count}</td>
				<%-- <td>${status.index }</td> --%>
				<td>${vo.id}</td>
				<td>${vo.pw}</td>
				<td>${vo.age}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<!-- 20200715 -->
	<!-- 5가 출력이 되었음. -->
	<c:forEach var="i" begin ="0" end="5" step="1">
		${ i}<br>
	</c:forEach>
	
	<br>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>아이디</th>
		</tr>
		
		<c:forEach  var = "i" begin="0"  end="${list2.size()-1}">
			<tr>
				<td>${i+1}</td>
				<td>${list2[i].id}</td>
				<td>${list2[i].pw}</td>
				<td>${list2[i].age}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<!-- 안에 경로를 절대경로로 바꿔주는 것 -->
	<img alt="고양이" scr="<c:url value='/resources/images/cat.jpg'/>">
	
	<c:set var="str3" value="<marquee>test</marquee>"></c:set>

	
	${str3}
	
	<c:out value="<marquee>test</marquee>"></c:out>
	
</body>
</html>
