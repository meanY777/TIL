<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax보충2</title>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js  "></script>
<script type="text/javascript">

	function sendJSON(){
		$.ajax({
			url:"/sendJSON"
			,type:"post"
			,data:JSON.stringify({
				userid:$("input:text").val()
				,userpw:$('input:password').val()
				})
			,contentType:"application/json;charset=utf-8"
			,success:function(){

				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
				
				}
			})
		}
	
	function receiveJSON(){
		$.ajax({
			url:"/receiveJSON"
			,type:"post"
			,dataType:"json"
			,success:function(data){
				console.log(data);
				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
				
				}
			})
		}
	function sendList(){
		var arr =[
			$("input:text").val()
			,$("input:password").val()
			];
		$.ajax({
			url:"/sendList"
			,type:"post"
			,data:JSON.stringify(arr)
			,contentType:"application/json;charset=utf-8"
			,success:function(){
				alert("통신 성공");
				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
					
				}
			})
		}
	function sendMap(){
		var map ={
			userid:$("input:text").val()
			,userpw:$("input:password").val()
			};
		
		$.ajax({
			url:"/sendMap"
			,type:"post"
			,data:JSON.stringify(map)
			,contentType:"application/json;charset=utf-8"
			,success:function(){
				alert("통신 성공");
				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
					
				}
			})
		}
	function receiveList(){
		$.ajax({
			url:"/receiveList"
			,type:"post"
			,dataType:"json"
			/* dataType:"text"로 해서 데이터를 문자열화한 문자열을 출력할 수 있다*/
			,success:function(data){
				console.log(data);
				//parse는 문자열을 객체로 변경하는 것
				//stringify와 반대로
				console.log(JSON.parse(data))
				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
				
				}
			})
		}
	function receiveMap(){
		$.ajax({
			url:"/receiveMap"
			,type:"post"
			,dataType:"json"
			,success:function(data){
				console.log(data);
				}
			,error: function(e){
				alert("통신실패");
				console.log(e);
				
				}
			})
		}
</script>
</head>
<body>
	<form>
		<input type="text">
		<input type="password">
	</form>
	
	<button onclick="sendJSON();">json으로 보내</button>
	<button onclick="receiveJSON();">컨트롤러에서 json 받기</button>
	<br>
	<button onclick="sendList();">컨트롤러에 어레이리스트로 보내기-JSON</button>
	<button onclick="sendMap();">컨트롤러에 map으로 보내기-JSON</button>
	<br>
	<button onclick="receiveList();">컨트롤러에 어레이리스트로 받기-JSON</button>
	<button onclick="receiveMap();">컨트롤러에 map으로 받기-JSON</button>
	
</body>
</html>