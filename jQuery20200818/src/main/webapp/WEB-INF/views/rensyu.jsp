<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js"></script>

<script type="text/javascript">
$(function(){

/* 
	document.getElementById('div1').onclick = function(){
		alert('world');
		} */
	$('div').on('mouseenter',function(){
		$(this).html('world');
		$(this).css('color','white');
		$(this).css('background-color','black');
		});
	$('div').on('mouseleave',function(){
		$(this).html('Hello');
		$(this).css({
			color: 'black',
			backgroundColor: 'white'
			})
		});

	$('input[type=text]').on('keyup',function(){
		var txt = $(this).val();
		$('#div2').html(txt);
		})
	$('input[type=radio]').on('change',function(){
		var val = $(this).val();
		$('#div2').html(val);
		})

	$('input[type=text]').on('keyup',function(){
		var val = $(this).val();
		$('#div2').html(val);

		})
});

</script>
</head>
<body>
<div id="div1">Hello</div>
<div id="div2"></div>
<input type="text">
<input type="radio" name = "r" value="first">
<input type="radio" name = "r" value="second">
<input type="radio" name = "r" value="third">
</body>
</html>