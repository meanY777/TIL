<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<!-- 	 <script type="text/javascript">

		window.onload=function(){
			var id = document.getElementById('bookType22');
			if(id=='수입'){
				
				 var zebal = document.getElementById('income');
				 
				 
				 zebal.setAttribute('selected',selected);
				 document.body.appendChild(zebal);
				
				}
			 if(id=='지출'){
				 var zebal = document.getElementById('outcome');
				 zebal.setAttribute('selected',selected);
				 document.body.appendChild(zebal);
				 
				}
			
				
			};
		</script> -->
		<script type="text/javascript">
	 	$(function(){
	 		
		 	var i =${book.moneybook_type};
			

			
				if(i=='수입'){
					
					
					$('#income').selected();
					
					}
				 if(i=='지출'){
					 $('#outcome').selected();
						 	
					}
				
		
			}); 
		</script> 
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
		<input type="hidden" id="bookType22" value="${book.moneybook_type}">
		메모:<input type="text" id="memo" value="${book.moneybook_memo }"><br>
		분류:
		
		<select id ="bookType" >
			<option value="수입" id="income" >수입</option>
			<option value="지출"id="outcome" >지출</option> 
		</select> 
		
		<br>
		금액:<input type="text" id="kingaku" value="${book.moneybook_amount }">
		<br>
		<input type="button" onclick="makeForm();" value="수정하기">
		
		<form action ="/book/update" method ="get" id ="searchForm">
		
			<input type="hidden" name ="moneybook_memo" id ="memo2">
			<input type="hidden" name ="moneybook_type" id ="bookType2">
			<input type="hidden" name ="moneybook_amount" id ="kingaku2">
			<input type="hidden" name="moneybook_no" value="${book.moneybook_no }">
		</form>
</body>
</html>