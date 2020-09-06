<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	
	<script type="text/javascript">
		location.href ="http://localhost:8888/ex/example1?name=abcd"
	</script>
</head>
<body>
<h2>${gisu} </h2>
<h1>
	[메인화면]
</h1>

<a href = "/ex/example1?name=test">jsp 파일 이동 1</a>
<a href ="/ex/exam">경로 두번 타고</a>

</body>
</html>
