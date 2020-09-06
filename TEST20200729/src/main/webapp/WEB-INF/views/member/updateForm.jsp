<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<form action="/member/updateMember" method="post">

ID:<input type="text" value="${member.member_id }" name="member_id" readonly="readonly"><br>
PW:<input type="password" name="member_pw"><br>
Name<input type="text" name="member_nm" value="${member.member_nm }"><br>
<input type="submit" value="수정" >
</form>
</body>
</html>