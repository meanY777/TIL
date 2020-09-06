<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="list" items="${list }">
		<tr>
			<th>${list.boardNum }</th>
			<th>
			<a href="/board/readBoard?boardNum=${list.boardNum}">${list.title}</a>
			</th>
			<th>${list.writer }</th>
			<th>${list.indate }</th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>