<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function searchForm(){
	var searchType = document.getElementById('searchType').value;
	var searchText = document.getElementById('searchText').value;

	document.getElementById('text').value =searchText;
	document.getElementById('type').value =searchType;
	document.getElementById('search').submit();
	
	}
	
</script>
</head>
<body>
<h1>[영화 리스트]</h1>

<table border="1">
	<tr>
		<th>순서</th>
		<th>등록자</th>
		<th>영화 제목</th>
		<th>영화 조회수</th>
		<th>영화 등록일</th>
	</tr>
	
	<c:forEach var="movie" items="${movie }" varStatus="status">
		<tr>
			<td>${status.count }</td>
			<td>${movie.MEMBER_ID}</td>
			<td>
			
			<a href="/movie/movieContext?movie_no=${movie.MOVIE_NO}">${movie.MOVIE_TITLE}</a>
			
			</td>
			
			<td>${movie.MOVIE_HITS}</td>
			<td>${movie.MOVIE_INDATE }</td>
			
		</tr>
	</c:forEach>
</table>	
	<select id="searchType">
		<option value="title">제목</option>
		<option value="name">이름</option>
	</select>
	<input type="text" 	id="searchText">
	<input type="button" value="검색" onclick="searchForm()">

<form action="/movie/movieList" id="search" >
	<input type="hidden" id="type" name ="searchType">
	<input type="hidden" id ="text" name="searchText">
	<inpyt type="hidden" name="movie_no" value="${movie.MOVIE_NO}">
</form>
</body>
</html>