<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/boardUpdate" method="post">
	글 제목:<input type="text" name="board_title" value="${map.BOARD_TITLE }"><br>
	글 내용:<br>
	<textarea rows="10" cols="40" name="board_context"value="${map.BOARD_CONTEXT }"></textarea>
	<input type=hidden name ="board_no" value="${map.BOARD_NO }">
	<br>
	<input type="submit" value="글 수정">
</form>
</body>
</html>