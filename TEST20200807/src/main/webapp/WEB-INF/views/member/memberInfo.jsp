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
		location.href = "/member/updateForm?member_id="+member_id;

		}
</script>
</head>
<body>
	<table border="1">
	
		<tr>
			<th>순서</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생일</th>
			<th>등록일</th>
		</tr>
		
	
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>${member.member_nm }</td>
				<td>${member.member_birth }</td>
				<td>${member.member_indate }</td>
			</tr>

	</table>
	
	<input type="button" value="수정하기" onclick="updateForm()">
	<input type="hidden" name ="member_id" id="member_id" value="${member.member_id }">
</body>
</html>