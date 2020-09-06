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
	function createBook(){

		location.href="/book/createBookPage";
		}
	
	function search(){
		var searchText = document.getElementById('searchText').value;
		var bookType = document.getElementById('bookType').value;
		
		if (searchText.value == ''||searchText.length==0) {
			alert("검색어를 입력하세요.");

			return false;
		}
		
		
	
		

		location.href="/book/search?bookType="+bookType+"&searchText="+searchText;
		
		}

</script>
<script type="text/javascript">
	 function tatalIncome(){

			$.ajax({
				url:"/book/tatalIncome"
				,type:"post"
				,success:function(data){
					$('#text1').val(data);
					}
			,error:function(e){
				console.log(e);
				}
				});
			
		 }
	 function tatalOutcome(){

			$.ajax({
				url:"/book/tatalOutcome"
				,type:"post"
				,success:function(data){
					$('#text1').val(data);
					}
				,error:function(e){
					console.log(e);
					}
				});
			
		 }

	function min(){
		
		$.ajax({
			url:"/book/min"
			,type:"post"
			,success:function(data){
				$('#text2').val(data);
				}
			,error:function(e){
				console.log(e);
				}
			});
		}
	function max(){
		
		$.ajax({
			url:"/book/max"
			,type:"post"
			,success:function(data){
				$('#text2').val(data);
				}
			,error:function(e){
				console.log(e);
				}
			});
		}
	
</script>
</head>
<body>
	<h1>[가계부]</h1>
	<table border="1">
		<tr>	
			<th>번호</th>
			<th>메모</th>
			<th>종류</th>
			<th>금액</th>
			<th>작성일</th>
			<th></th>
			<th></th>
		</tr>
		
		<c:if test="${empty list}">
			<tr>
				
				<td>등록된 데이터가 없음</td>
			</tr>
		</c:if>
		<c:if test="${not empty list }">
		<c:forEach var="book" items="${list }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${book.moneybook_memo }</td>
				<td>${book.moneybook_type }</td>
				<td>${book.moneybook_amount }</td>
				<td>${book.money_indate }</td>
				<td>
					<button onclick="location.href='/book/updateBook?moneybook_no=${book.moneybook_no}'">수정</button>
				</td>
				<td>
					<button onclick="location.href='/book/delete?moneybook_no=${book.moneybook_no}'">삭제</button>
				</td>
			</tr>
		</c:forEach> 
		</c:if>
		
		
		
	</table>
	<button onclick="createBook();" >가계부 작성</button>
	
	
		<select id ="bookType">
			<option value="전체">전체</option>
			<option value="수입">수입</option>
			<option value="지출">지출</option>
		</select>
		
		<input type="text" id="searchText">
		
		<button onclick="search();">검색</button>
		<br>
		<button onclick="tatalIncome();">총 수입 구하기</button>
		<button onclick="tatalOutcome();">총 지출 구하기</button>
		<input type="text" id="text1" placeholder="총 수입또는 지출" value="">
		<br>
		<button onclick="min();">최소 금액 구하기</button>
		<button onclick="max();">최대 금액 구하기</button>
		<input type="text" id="text2">
</body>
</html>