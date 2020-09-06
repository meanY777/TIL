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
	function updateForm(){

		var board_no =${board.BOARD_NO};
		location.href = "/board/updateForm?board_no="+board_no;
		}
</script>
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
		<tr>	
				<td id="board_no">${board.BOARD_NO}</td>
				<td>${board.BOARD_TITLE }</td>
				<td>${board.BOARD_CONTEXT }</td>
				<td>${board.MEMBER_ID }</td>
				<td>${board.BOARD_INDATE }</td>
				<td>${board.BOARD_HITS }</td>
		</tr>

	</table>
	<c:if test="${loginId ==board.MEMBER_ID }">
		<button onclick="updateForm();">수정하기</button>
	</c:if>
	
</body>
</html>