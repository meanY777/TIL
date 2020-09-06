<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
<form action="/member/join" method="post">
	id:<input type="text" name = "member_id"><br>
	pw:<input type="password" name = "member_pw"><br>
	name:<input type="text" name = "member_nm"><br>
	bitrh_day:<input type="text" name ="member_birth"><br>
	<input type="submit" value="가입하기">
	
</form>
</body>
</html>