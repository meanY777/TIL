<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/update" method="post">
	
		글 제목:<input type="text" name="board_title" placeholder="${board.BOARD_TITLE }"><br>
		글 내용:<textarea rows="" cols="" name="board_context" placeholder="${board.BOARD_CONTEXT }"></textarea>
		<input type="hidden" name="board_no" value="${board.BOARD_NO }">
		<input type="submit" value="전송">
		
	</form>
</body>
</html>