<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/member/update" method="post">
		ID:<input type="text" placeholder="${member.member_id}" value="${member.member_id}"readonly="readonly" name="member_id" id="member_id">
		PW:<input type="password" name="member_pw" id="member_pw">
		NAME:<input type="text" placeholder="${member.member_nm}" name="member_nm" id="member_nm">

		<input type="submit" value="수정하기">
	
	</form>
</body>
</html>