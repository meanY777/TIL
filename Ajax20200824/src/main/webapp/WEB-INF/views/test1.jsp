<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js  "></script>
<script type="text/javascript">
	function sendArray(){
		$.ajax({
			url:'/sendArray'
			,type:"post"
			,data:{
				arr:[
					$('input:text').val()
					,$('input:password').val()
					]
				}
			,traditional:true
			,success:function(){alert("통신성공!")}
			,error:function(e){alert("통신 실패...");console.log(e);}
			
			});
		}

	function sendVO(){
		$.ajax({

			url:"/sendVO"
			,type:"post"
			,data:
				/* userid:$(".userid").val()
				,userpw:$(".userpw").val() */
				
				/* $('form').serialize() */
				{
				userid:$('input[name=userid]').val()
				,userpw:$('input[name=userpw]').val()
					}
				
			,success:function(){
				alert("통신성공");
				}
			,error:function(e){
				alert("통신실패");
				console.log(e);
				}	
			})
		}
	function receiveArray(){
		
		$.ajax({

			url:"/receiveArray"
			,type:"post"
			,success:function(data){
				alert("통신성공");
				console.log(data);
				}
			,error:function(e){
				alert("통신실패");
				console.log(e);
				}
			})
		}
	function receiveVO(){
		
		$.ajax({

			url:"/receiveVO"
			,type:"post"
			,success:function(data){
				alert("통신성공");
				console.log(data);
				}
			,error:function(e){
				alert("통신실패");
				console.log(e);
				}
			})
		}
</script>
</head>
<body>
	<form>
		<input type="text" name="userid"><br>
		<input type="password" name="userpw">
	</form>
	<button onclick="sendArray();">컨트롤러로 배열을 보내기</button>
	<button onclick="sendVO();">컨트롤러로 VO을 보내기</button>
	
	<button onclick="receiveArray();">컨트롤러에서 배열을 받기</button>
	<button onclick="receiveVO();">컨트롤러에서 VO를 받기</button>

</body>
</html>