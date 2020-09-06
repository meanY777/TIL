<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>메인 화면</title>
</head>
<body>
<h1>
	[ 메인 화면 ] 
</h1>
<h2>
	${gisu} 
	${gisu2}
</h2>

<!-- 
	쿼리스트링 방식
	요청주소 ? 변수명 = 값 & 변수명 = 값
 -->
<ul>
	<li>
		<a href="/ex/example1?name=test"> jsp 파일 이동 1 </a>
		<a href="/ex/example2"> jsp 파일 이동 2 </a>
		<a href="/ex/example3"> jsp 파일 이동 3 </a>
	</li>
</ul>
</body>
</html>
