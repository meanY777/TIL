<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 폼</h1>
	<form action="/member/join" method="post">
		ID:<input type="text" name="member_id"><br>
		PW:<input type="password" name="member_pw"><br>
		Name:<input type="text" name="member_nm"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>