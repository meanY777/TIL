<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>[회원가입 창]</h1>

<form action= "/member/join" method="post">
	아이디:<input type="text" name="member_id"><br>
	비밀번호:<input type="password" name="member_pw"><br>
	이름:<input type="text" name="member_nm"><br>
	생일:<input type="text" value="YYYYMMDD" name="member_birth"><br>
	<input type="submit" value="전송">
	
</form>

</body>
</html>