
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<form onclick="location.href='/member/remove'">	
	<table border ="1">
		<tr> 
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>취미</th>
			<th>성별</th>
			<th>자기소개</th>
		</tr>
			
		<c:forEach var="vo" items="${list}" varStatus="status" >
			
			<tr>
			
				<td>${status.index +1 }</td>
				<input type="hidden" value="${status.index}">
				<td>${vo.id}</td>
				<td>${vo.name}</td>
				<td>
					<c:forEach var="f" items="${vo.fun}">${f}</c:forEach>
				</td>
				<td>${vo.gender}</td>
				<td>${vo.introduce }</td>
				
			</tr>
	
		</c:forEach>
	
	
	</table>
	</form>	
</body>
</html>