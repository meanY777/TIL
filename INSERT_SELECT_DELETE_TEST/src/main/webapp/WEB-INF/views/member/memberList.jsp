<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function formCheck(){

		var min_bitrh = document.getElementById("min_birth").value;
		var max_bitrh = document.getElementById("max_birth").value;

		location.href = "/member/findMember?min_birth="+min_birth+"&max_birth="+maxbirth;
		
		}
</script>
<body>

<form >
	최소 생년 월일:<input type="text" id="min_birth">~최대 생년 월일:<input type="text"id="max_value">
	<input type="button" value="검색" onclick="formCheck();">
</form>
<table border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>날짜</th>
		<th></th>
	</tr>
	
	<c:forEach var="member" items="${list}" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${member.member_id}</td>
			<td>
			<a href="">${member.member_nm }</a>
			</td>
			<td>${member.indate }</td>
			<td>
				<a href ="/member/delete?member_id=${member.member_id}">삭제</a>
			</td>
		</tr>
	</c:forEach>
</table>
<a href="/">메인으로</a>
</body>
</html>