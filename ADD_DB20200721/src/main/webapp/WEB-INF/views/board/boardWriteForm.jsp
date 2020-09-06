<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 폼</title>
</head>
<body>
<h1>글 작성</h1>
<form action="/board/boardWrite" method="post" enctype="multipart/form-data">
	글 제목:<input type="text" name="board_title"><br>
	글 내용:<br>
	<textarea rows="10" cols="40" name="board_context"></textarea>
	<br>
	<input type="file" name="upload">
	<br>
	<input type="submit" value="글 등록">
</form>
</body>
</html>