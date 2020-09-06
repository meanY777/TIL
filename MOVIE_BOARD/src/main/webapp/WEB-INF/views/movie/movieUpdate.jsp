<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "/movie/update" method="post">
title:<input type="text" value="${movie.movie_title }" name="movie_title">
context:<textarea rows="10" cols="40" name="movie_context"></textarea>
<input type="hidden" value="${movie.movie_no }" name ="movie_no">
<input type="submit" value="수정하기">


</form>

</body>
</html>