<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/member/update2" method= "post">
		id:<input type="text" name="member_id" value="${member.member_id}" readonly="readonly">
		<br>pw:<input type="password" name="member_pw">
		<br>name:<input type="text" name="member_nm" value="${member.member_nm}">
		<br><input type="submit" value="수정">
	</form>
</body>
</html>