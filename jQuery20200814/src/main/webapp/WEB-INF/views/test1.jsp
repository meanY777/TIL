<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>

<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(){

		/*$(대상).작업(); */
		/* $('*').css('color','red'); */

		$('div').css('font-size','200%');
		
		});
	$(function(){


		});

	/* 
	$는 변수명임
	
		[대락 문법]
	$(대상을 먼저 선택).무슨행동
	
	 */
	 function changeColor(){
		/* $('#Hello').css('color','blue'); */

		$('.hi').css('color','green');
		 }
</script>
</head>
<body>

<div  id = "Hello" class ="hi" onclick ="changeColor();">안녕하세요?</div>
<div  class ="hi" >반갑습니다.</div>
</body>
</html>