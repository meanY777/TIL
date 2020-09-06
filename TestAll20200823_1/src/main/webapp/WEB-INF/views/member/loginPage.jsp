<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	function loginCheck(){

		$('form').submit();
		
		}
	
</script>
</head>
<body>
<h1>[로그인 페이지]</h1>
<form action="/member/login" method="post">
ID:<input type="text" name="member_id">
PW:<input type="password" name="member_pw">
</form>
<input type="button" value="로그인" onclick="loginCheck();">
</body>
</html>