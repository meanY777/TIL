<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/checkJoin" method="post">
		ID:<input type="text" name="member_id">
		PW:<input type="password" name="member_pw">
		Name:<input type="text" name="member_nm">
		<input type="submit" value="가입">
	</form>
</body>
</html>