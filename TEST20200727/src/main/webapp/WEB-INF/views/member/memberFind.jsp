<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<form action ="/member/findMember" method="post">
	최소 생년 월일 <input type="text" name="min_birth">~ 최대 생년월일<input type="text" name="max_birth">
	<br><input type="submit" value="검색">
	</form>

		
		<c:choose>
		<c:when test="${not empty list2}">
		<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>등록일자</th>
		
			
		</tr>
		<c:forEach var="member" items="${list2}" varStatus ="status">
			<tr>
				<td>${status.count}</td>
				<td>${member.member_id }</td>
				<td>${member.member_nm }</td>
				<td>${member.member_birth }</td>
				<td>${member.member_indate }</td>
				
			</tr>
		</c:forEach>
		</table>
		</c:when>
			
		<c:otherwise>
				<h1>정보가 없습니다.</h1>
		</c:otherwise>
		</c:choose>
	
</body>
</html>