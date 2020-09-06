<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	span{color:red;}
</style>
<script type="text/javascript" scr="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	$(function(){

		$("#btn1").on("click",function(){
			console.log('a');
			});
		$('#btn1').click(function(){
			$(this).off();
			});
		$("#btn1").mouseenter(function(){
			$(this).css({
				color:"white",
				backgroundColor:"black"
				});
				
			});

		$("#like").click(function(){
			var cnt = Number$(("#count").text());
			cnt+=1;
			$("#cnt").text(cnt);
			})

		$('span').click(function(){
			$('#like').trigger('click');
			})
		});

	/*
		$('span').click(raiseLike);
		
		function raiseLike(){
	
		} 
	*/
</script>
</head>
<body>

	<button id = "btn1">Click</button>
	<br>
	<br>
	<span>❤</span>
	<span id="count">0</span>
	<button id="like">좋아요!</button>
</body>
</html>