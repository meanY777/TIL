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
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>취미</th>
		<th>소개</th>
		</tr>
		
		<c:forEach var  ="vo" items="${list}" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${vo.id }</td>
				<td>${vo.name}</td>
				<td><c:forEach var="b" items="${vo.hobby}" >${b}</c:forEach></td>
				<td>${vo.introduce}</td>
				<td><a href="/member/delete?id=${vo.id}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>