<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goToBoardWriteForm(){
		location.href ="/board/goToBoardWriteForm";
		}
</script>
</head>
<body>
<h1>게시판 글 목록</h1>

<input type="button" value="글쓰기" onclick="goToBoardWriteForm()">
</body>
</html>