<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>

	<script type="text/javascript">
	
		function formCheck(){

			var member_id = document.getElementById('member_id').value;
			
			location.href = "/member/updateForm?member_id="+member_id;

			
				
			}
		
	</script>
</head>
<body>
		
		<table border="1">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>생일</th>
				<th>등록일</th>
			</tr>
			
				<tr>
					<td>${member.member_id}</td>
					<td>${member.member_nm }</td>
					<td>${member.member_birth }</td>
					<td>${member.member_indate}</td>
				</tr>
		</table>
		<c:if test="${member.member_id == loginId}">
		<input type="button" value="수정하기" onclick="formCheck();">
		</c:if>
		<input type="hidden" value="${member.member_id}" id ="member_id"name="member_id">
</body>
</html>