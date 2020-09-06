<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function first(){

		$.ajax({
			url:"/first"
			,type:"post"
			,data:{
				id:$('input:text').val()
				,pw:$('input:password').val()
				}
			,success:function(){
				alert("통신 성공");
				}
			,error:function(e){
				alert("통신 실패");
				console.log(e);
				}
			})
		}
	function second(){
		$.ajax({
			url:"/second"
			,type:"post"
			,data:{
				arr:[
					$('input:text').val(),
					$('input:password').val()
				]
		
				}
			,traditional:true
			,success:function(){
				alert("통신 성공");
				}
			,error:function(){
				alert("통신 실패");
				}
			})
		}
	function third(){
		$.ajax({
			url:"/third"
			,type:"post"
			,data:{
				id:$("input:text").val()
				,pw:$("input:password").val()
				}
			,success:function(){
				alert("통신 성공");
				}
			,error:function(){
				alert("통신 실패");
				}
			})
		}
	function fourth(){
		$.ajax({
			url:"/fourth"
			,type:"post"
			,data:$('form').serialize()
			,success:function(){
				alert("통신 성공");
				}
			})
		}
	function fifth(){
		var data={
				id:$('input:text').val()
				,pw:$('input:password').val()
				}
		$.ajax({
			url:"/fifth"
			,type:"post"
			,data:JSON.stringify(data)
			,contentType:"application/json;charset=utf-8"
			,dataType:"json"
			,success:function(data){
				alert("통신 성공");
				alert(data);
				}
			})
		}
</script>
</head>
<body>
	
	<h1>여러 개의 데이터 보내기</h1>
	
	<form>
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
		</table>
	</form>
	
	<button onclick="first();">여러 개의 매개변수로 각각 보내기</button>
	<button onclick="second();">배열로 묶어서 보내기</button>
	<button onclick="third();">VO를 통해서 보내기</button>
	<button onclick="fourth();">직렬화해서 보내기</button>
	<button onclick="fifth();">123123</button>
</body>
</html>