<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록페이지</title>

<script type="text/javascript">
	function goToBoardForm(){

		location.href ="/board/goToBoardForm" ;
		}
</script>
</head>
<body>
	
	<input type="button" value="글쓰기" onclick="goToBoardForm()">
</body>
</html>