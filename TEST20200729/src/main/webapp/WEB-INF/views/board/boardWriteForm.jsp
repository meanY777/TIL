<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/boardWrite" method="post">
글제목:<input type="text" name="board_title"><br>
글내용:<br>
<textarea rows="" cols="" name="board_context"></textarea>
<br>
<input type="submit" value="글 등록">
</form>
</body>
</html>