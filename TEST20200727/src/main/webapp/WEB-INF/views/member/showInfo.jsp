<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function updateForm(){
		var member_id = document.getElementById('member_id').value;
		location.href = "/member/update?member_id="+member_id;
		}
</script>
</head>
<body>
<table border="1">
		<tr>
	
			<th>아이디</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>등록일자</th>
			
		</tr>
	
			<tr>
				
				<td>${selectedMember.member_id }</td>
				<td>${selectedMember.member_nm }</td>
				<td>${selectedMember.member_birth }</td>
				<td>${selectedMember.member_indate }</td>
				
			</tr>
	</table>
	<input type="button" value="수정하기" onclick="updateForm()">
	<input type="hidden" id="member_id" value=${selectedMember.member_id }>
</body>
</html>