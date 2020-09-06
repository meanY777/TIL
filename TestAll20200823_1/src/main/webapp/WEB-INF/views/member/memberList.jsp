<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function search(){
		
		var min = document.getElementById('mindate').value;
		var max = document.getElementById('maxdate').value;

		location.href = "/member/search?mindate="+min+"&maxdate="+max;
		
		}
</script>
</head>
<body>
	최소<input type="text" placeholder="ex.20201004" name="mindate" id="mindate">
	~최대<input type="text" placeholder="ex.20201004" name="maxdate" id="maxdate">
	<br>
	<input type="button" value="검색" onclick="search();">
	
	<c:if test="${not empty list }">
	

	<table border="1">
			<tr>
				<th>순서</th>
				<th>아이디</th>
				<th>이름</th>
				<th>생일</th>
				<th>등록일</th>
				<th></th>
			</tr>
			<c:forEach var="member" items="${list}" varStatus = "status" >
				<tr>
					<td>${ status.count}</td>
					<td>
					<a href="/member/memberInfo?member_id=${ member.member_id}">${member.member_id}</a>
					</td>
					<td>${member.member_nm }</td>
					<td>${member.member_birth }</td>
					<td>${member.member_indate}</td>
					<td><a href="/member/memberDelete?member_id=${member.member_id }">삭제</a></td>
				</tr>
			</c:forEach>
		
	</table>	
	</c:if>
	<c:if test="${empty list }">
		<h1>[정보가 없습ㄴ]</h1>
	</c:if>
</body>
</html>