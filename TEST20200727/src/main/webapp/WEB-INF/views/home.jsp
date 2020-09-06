<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>




<c:choose>
	<c:when test="${not empty sessionScope.loginId}">
	${sessionScope.loginId}님 환영합니다.
		<a href="/member/joinForm">회원가입폼으로</a>
		<a href="/member/list">멤버 리스트로</a>
		<a href="/member/logout">로그아웃</a>
		<a href ="/board/boardList">글 목록 페이지</a>
		
	</c:when>
	<c:otherwise>
	
	
		<a href="/member/loginForm">로그인 폼 이동</a>
	</c:otherwise>
</c:choose>
</body>
</html>
