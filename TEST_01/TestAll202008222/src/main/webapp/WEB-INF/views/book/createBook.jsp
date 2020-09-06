<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">


	function makeForm(){
	
			var memo = document.getElementById('memo');
			var kingaku = document.getElementById('kingaku');

			if (memo.value == ''||memo.length==0) {
				alert("메모를 입력하세요.");

				return false;
			}

			if (kingaku.value == ''||kingaku.length==0) {
				alert("금액을 입력하세요.");

				return false;
			}
			
		var bookType = document.getElementById('bookType').value;
		var memo = document.getElementById('memo').value;
		var kingaku = document.getElementById('kingaku').value;
		
		document.getElementById('bookType2').value =bookType;
		document.getElementById('memo2').value =memo;
		document.getElementById('kingaku2').value =kingaku;
		
		document.getElementById('searchForm').submit();

		}
</script>
</head>
<body>
	<h1>[가계부 입력]</h1>
	

		메모:<input type="text" id="memo"><br>
		분류:
		<select id ="bookType">
			<option value="수입">수입</option>
			<option value="지출">지출</option>
		</select>
		<br>
		금액:<input type="text" id="kingaku">
		<br>
		<input type="button" onclick="makeForm();" value="입력">
		
		<form action ="/book/createBook" method ="get" id ="searchForm">
		
			<input type="hidden" name ="moneybook_memo" id ="memo2">
			<input type="hidden" name ="moneybook_type" id ="bookType2">
			<input type="hidden" name ="moneybook_amount" id ="kingaku2">
		</form>

</body>
</html>