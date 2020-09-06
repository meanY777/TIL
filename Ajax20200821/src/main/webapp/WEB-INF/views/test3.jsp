<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 심화</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function fourth(){
		
		var data ={
				userID:$('input:text').val()
				,userPw:$('input:password').val()
				}
		
		$.ajax({
			
			url:"/fourth"
			,type:"post"
			,data:JSON.stringify(data)
			,contentType:"application/json;charset=utf-8"
			,success:function(){
				alert("통신성공!");
				}
			,error:function(e){
				alert("통신실패!");
				console.log(e);
				}
			})
		}

		function fifth(){
			$.ajax({
				url:"/fifth"
				,type:'post'
				,dataType:"json"
				,success:function(data){
					alert("성공");
					console.log(data);
					}
				,error:function(e){
					alert("통신실패!");
					console.log(e);
					}
				})
				
			}
</script>
</head>
<body>
	<form>
		<table>
		<tr>
			<td>아이디:</td>
			<td><input type="text" name="userid"></td>
		</tr>
		<tr>
			<td>비밀번호:</td>
			<td><input type="password" name="userpw"></td>
		</tr>
		</table>
		
	</form>
	
	<button onclick="fourth();">json 객체로 보내기</button>
	<button onclick="fifth();">json 객체로 받기</button>
</body>
</html>