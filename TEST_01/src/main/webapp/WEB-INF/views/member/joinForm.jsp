<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> [회원 가입] </h1>

<form action="/member/insertMember" method="post" >
	아이디<input type="text" name="member_id" id="member_id"><br>
	비밀번호<input type="password" name ="member_pw" id="member_pw"><br>
	비밀번호 확인<input type="password" id="member_pw_check"><br>
	이름<input type= "text" id="member_nm" name="member_nm"><br>
	생년월일<input type="text" id="member_birth" name="member_birth"><br>
	<input type="submit" value="전송">
</form>

</body>
</html>