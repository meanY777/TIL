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


		//ajax함수는 인수로 {} 객체를 받음.
		$.ajax({
			url:"/first",
			success:function(){
				alert("통신 성공");
				}
			});
		}
	function second(){
		var settings = {
				url:"/second",
				data:{
					msg:"안녕하세요?"
					},
				success:function(){
					alert("통신성공");
					}
				}
		$.ajax(settings);
		}

	function third(){

		$.ajax({
			url:"/third",
			success:function(data){
				alert("통신 성공");
				alert("컨트롤러에서 받은 데이터 :"+data);
				}
			})
		}
	function fourth(){

		$.ajax({
			url:"/fourth"
			,type:'post'
			,data:{
				msg:"안녕하세요"
				}
			,success:function(data){
				alert("통신 성공");
				alert("컨트롤러에서 받은 데이터 :"+data);
				}
			})
		}
</script>
</head>
<body>
	<button onclick="first();">AJAX로 단순 통신하기</button>
	<button onclick="second();">컨트롤러로 문자열 보내기</button>
	<button onclick="third();">컨트롤러부터 문자열을 받기</button>
	<button onclick="fourth();">데이터 전달하고 받기</button>
</body>
</html>