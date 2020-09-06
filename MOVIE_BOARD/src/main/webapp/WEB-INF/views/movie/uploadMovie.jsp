<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>[영화등록]</h1>

<form action="/movie/upload " method="post">
등록회원:<input type="text" name ="member_id"><br>
영화 제목:<input type="text" name ="movie_title"><br>
영화 내용:<textarea rows="10" cols="40" name ="movie_context">
</textarea>
<br>
<input type="submit" value="등록">



</form>
</body>
</html>