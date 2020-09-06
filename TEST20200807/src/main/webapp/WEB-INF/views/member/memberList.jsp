<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
	
		<tr>
			<th>순서</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생일</th>
			<th>등록일</th>
		</tr>
		
		<c:forEach var="member" items="${list }" varStatus = "status">
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>
				<a href="/member/memberInfo?member_id=${member.member_id }">${member.member_nm }</a>
				</td>
				<td>${member.member_birth }</td>
				<td>${member.member_indate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>