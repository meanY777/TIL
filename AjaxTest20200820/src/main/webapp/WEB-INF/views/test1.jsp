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
			,success:function(){
				alert("통신 성공");
				}
			})

		}
	function second(){

		var settings ={
			url:"/second"
			,data:{
				msg:"안녕하세요?"
				}
			,success:function(){
				alert("통신 성공");
				}
			}
		$.ajax(settings);
		}
	function third(){
		$.ajax({
			url:"/third"
			,success:function(data){
				alert("통신 성공");
				alert("컨트롤러에서 받은 데이터:"+data);
				}
			})
		}
	function fourth(){
		$.ajax({
			url:"/fourth"
			,type:"post"
			,data:{
				msg:"보낸 데이터가 잘 돌아오려나?"
				}
			,success:function(data){
				alert("통신 성공");
				alert("받은 데이터는 잘 돌아왔어요 ->"+data);
				}
			})
		}
	function fifth(){
		$.ajax({
			url:"/fifth"
			,type:"post"
			,success:function(data){
				alert("통신 성공");
				console.log(data);
				}
			,error:function(e){
				alert("통신 실패");
				console.log(e);
				}
			,complete:function(){
				alert("통신 종료");
				}
			
			})
		}

	function sixth(){
		$.ajax("/sixth")
			.done(function(data){
				alert("통신 성공");
				console.log(data);
				})
			.fail(function(e){
				alert("통신 실패");
				console.log(e);
				})
			.always(function(){
				alert("통신 종료");
				
				})
		}
</script>

</head>
<body>
	<button onclick="first();">에이젝스로 단순 통신하기</button>
	<button onclick="second();">컨트롤러로 문자열 보내기</button>
	<button onclick="third();">컨트롤러에서 정보 받기</button>
	<button onclick="fourth();">데이터 전달하고 받기</button>
	<button onclick="fifth();">통신 결과 처리 방법</button>
	<button onclick="sixth();">통신 결과 처리 방법 2</button>
</body>
</html>