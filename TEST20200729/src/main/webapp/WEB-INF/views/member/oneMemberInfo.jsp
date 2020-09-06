<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function updateForm(){
		var member_id = document.getElementById('member_id').value;

		location.href ="/member/updateForm?member_id="+member_id;
		}
</script>
</head>
<body>
<h1>회원 정보</h1>
ID:${member.member_id}
PW:${member.member_pw}
Name:${member.member_nm}
등록일:${member.member_indate}

<input type="button" value="수정" onclick="updateForm()">
<input type="hidden" id="member_id"name="member_id" value="${member.member_id }">
</body>
</html>