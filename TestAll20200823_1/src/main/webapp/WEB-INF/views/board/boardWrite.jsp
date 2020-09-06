<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<form action="/board/uploadBoard" method="post">
		글 제목:<input type="text" name="board_title">
		<br>글 내용:
		<textarea rows="" cols="" name="board_context"></textarea>
		<input type="submit" value="글 작성">
	</form>
</body>
</html>