<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록페이지</title>

<script type="text/javascript">
	function boardWriteForm(){
		location.href = "/board/boardWriteForm"
		}
	function searchBoard(){
		var searchType = document.getElemenetById('searchType').value;
		var searchText = document.getElemenetById('searchText').value;

		document.getElemenetById('type').value = searchType;
		document.getElemenetById('text').value = searchText;
		
		document.getElemenetById('searchForm').submit();
		}
</script>
</head>
<body>
	<h1>글 목록</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
			<c:forEach items="${list }" var="data" varStatus="status">
				<td>${status.count }</td>
				<td>
				<a href="/board/boardRead?board_no=${data.BOARD_NO }">${data.BOARD_TITLE }</a>
				</td>
				<td>${data.MEMBER_NM }</td>
				<td>${data.BOARD_INDATE }</td>
				<td>${data.BOARD_HITS }</td>
			</c:forEach>
		
	</table>
	
	@@ @ 1 2 3 4 5 @ @@
	
	<input type="button" value="글쓰기" onclick="boardWriteForm()">
	<br>
	
	<select name ="searchType">
		<option value="title">제목</option>
		<option value="name">작성자</option>
	</select>
	<input type="text" id="searchText" >
	<input type="button" value="검색" onclick="searchBoard()">
	<!-- post 방식으로 보내려면 폼태그로 묶어서 보내야한다. 
		만약 그냥 get 방식으로 location.href를 써도 된다.
	 -->
	<form action="/board/searchBoard" method="get" id="searchForm">
		<input type="hidden" name="searchType" id="type">
		<input type="hidden" name="searchText" id="text">
	</form>
</body>
</html>