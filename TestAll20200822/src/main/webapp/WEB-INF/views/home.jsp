<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>[가계부]</h1>
	

	
	
	<c:if test="${not empty loginId }">
		<ul>
			<li>
				<a href="/book/bookList">내 가계부 </a>
			</li>
			<li>
				<a href="/member/loginOut">로그아웃</a>
			</li>
		</ul>
	
	</c:if>
	<c:if test="${empty loginId }">
		<ul>
			<li>
				<a href="/member/joinForm">회원 가입</a>
			</li>
			<li>
				<a href="/member/loginPage">로그인</a>
			</li>
		</ul>
		
	</c:if>
</body>
</html>
