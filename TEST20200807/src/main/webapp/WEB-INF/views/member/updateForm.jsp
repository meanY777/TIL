<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[수정 페이지]</title>
<script type="text/javascript">
	update(){

		var member_id = document.getElementById('member_id').value;
		var member_pw = document.getElementById('member_pw').value;
		var member_name = document.getElementById('member_name').value;
		var member_birth= document.getElementById('member_bitrh').value;

		location.href = "member/update?member_id="+member_id+""

		}
</script>
</head>
<body>
<h1>[수정 페이지]</h1>

ID:<input type="text" value="${member.member_id }" id = "member_id" readonly="readonly">
PW:<input type="password" id ="member_pw" name="member_pw">
Name:<input type="text" value="${member.member_nm}" id="member_nm" name="member_nm">
Birth_day:<input type="text" value="YYYYMMDD" id="member_birth" name="member_birth">

<input type="button" value="수정하기" onclick="update()">
</body>
</html>