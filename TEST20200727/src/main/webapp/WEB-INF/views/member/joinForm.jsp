<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/member/insert" method="post">
	ID:<input type="text" name ="member_id"><br>
	PW:<input type="password"name ="member_pw"><br>
	Name:<input type="text" name ="member_nm"><br>
	birth:<input type="text" value="ex.19900316" name ="member_birth"><br>
	<input type="submit" value="전송">
</form>
</body>
</html>