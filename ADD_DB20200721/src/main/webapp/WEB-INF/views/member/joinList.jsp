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
	<h1>회원목록페이지</h1>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>등록일자</th>
			<th></th>
		</tr>
		
		<c:forEach var ="member" items="${memberList} " varStatus ="status">
			<tr>
				<td>${status.count}</td>
				<td>${member.member_id}</td>
				<td>
				<a href="/member/selectOne?member_id=${member.member_id }">${member.member_nm }</a>
				</td>
				<td>${member.member_indate}</td>
				<td> 
				<a href="/member/delete?member_id=${member.member_id}">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>