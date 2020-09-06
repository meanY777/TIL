<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function updatePage(){

		var movie_no = document.getElementById('movie_no').value;

		location.href = "/movie/updatePage?movie_no="+movie_no;
		}
	function deleteMovie(){
		var movie_no = document.getElementById('movie_no').value;

		location.href = "/movie/delete?movie_no="+movie_no;
		}
	
</script>
</head>
<body>
		
		
		등록자 ${movie.member_id}<br>
		영화 제목 ${movie.movie_title}<br>
		영화 조회수${movie.movie_hits}<br>
		영화 등록일${movie.movie_indate }<br>
		
		
		<input type="button" value="수정하기" 	onclick="updatePage()"> 
		<input type="hidden" value="${movie.movie_no }" id="movie_no">
		
		<input type="button" value="삭제하기"	onclick="deleteMovie()">
		
	<a href="/movie/movieList">리스트로</a>
</body>
</html>