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
	function boardDelete(){
			var board_no = document.getElementById('board_no').value;
			location.href="/board/boardDelete?board_no="+board_no;

		}
	function boardUpdateForm(){
		var board_no = document.getElementById('board_no').value;
		location.href="/board/boardUpdateForm?board_no="+board_no;
		}
</script>
<body>
글번호:${map.BOARD_NO }
글제목:${map.BOARD_TITLE}
글내용:${map.BOARD_CONTEXT}
작성일:${map.BOARD_INDATE }
조회수:${map.BOARD_HITS }
작성자:${map.MEMBER_NM }
<c:if test="${not empty map.ORIGINALFILE}">

<a href="/board/download?board_no=${map.BOARD_NO }">첨부파일:${map.ORIGINALFILE }</a>

</c:if>
첨부파일:





<c:if test="${sessionScope.loginId == map.MEMBER_ID }">
	<input type="button" value="삭제" onclick="boardDelete()"><br>
	<input type="button" value="수정" onclick="boardUpdateForm()"><br>
	<input type="hidden" value="${map.BOARD_NO }" id="board_no">
</c:if>

</body>
</html>