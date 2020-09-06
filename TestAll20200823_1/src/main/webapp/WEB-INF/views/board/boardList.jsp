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
/* 		function writeBoard(){
			location.href ="/board/writeBoard";
			}
		function searchBoard(){
			var searchType = document.getElementById('searchType').value;
			var searchText = document.getElementById('searchText').value;

			document.getElementById('type').value =searchType;
			document.getElementById('text').value =searchText;

			document.getElementById('searchForm').submit();
			} */
		function searchBoard(){
				var str = $('#searchText').val();

				$.ajax({
					url:"/searchText"
					,type:"post"
					,data:{
						str:str
						}
					,success:function(){
						alert("전달완료");
						}
					})
				}
			
	</script>
</head>
<body>
	
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${list }" varStatus="status">
			<tr>	
				<td>${board.BOARD_NO}</td>
				<td><a href="/board/boardInfo?board_no=${board.BOARD_NO}">${board.BOARD_TITLE }</a></td>
				<td>${board.MEMBER_ID }</td>
				<td>${board.BOARD_INDATE }</td>
				<td>${board.BOARD_HITS }</td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="writeBoard();">글 쓰기</button>
	<br>
<!-- 	<select id="searchType">
		<option  value="title">제목</option>
		<option value="name">글쓴이</option>
	</select> -->
	
	<input type="text" id="searchText">
	<input type="button" value="검색" onclick="searchBoard();">
<!-- 	
	<form action="/board/boardList" method="get" id="searchForm" >
		<input type="hidden" name="searchType" id="type">
		<input type="hidden" name="searchText" id="text">
	</form> -->
</body>
</html>