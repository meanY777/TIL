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
		/* JS 문법 */
		document.getElementById('div1').onclick = function(){
			alert('world');
			}
		/* jQuery 문법 */
		$('div').on('click',function(){
			alert('world');
			});

		$('div').on('mouseenter',function(){
			/* 이때 this는 이벤트의 주체인 div를 의미 */
			$(this).html('world!');
			$(this).css('color','white');
			$(this).css('background-color','black');
/* 			$(this).css({
					color:'white';
					backgroundColor:'black';
				}); */
			});

		$('div').on('mouseleave',function(){
			$(this).html('hello');
			$(this).css({
				color: "black",
				backgroundColor: "white"
				});
			})
		$('input[type=text]').on('keyup',function(e){
				/* if(e.keyCode == 13){
					//로그인 진행
					} */
				var txt = $(this).val();
				$('#div2').html(txt);
			});


		$('input[type=radio]').on('change',function(){
			var val = $(this).val();
			$('#div2').html(val);
			})
		});
</script>
</head>
<body>
	<div id="div1">Hello</div>
	<input type="text">
	<div id="div2"></div>
	
	<input type="radio" name="r" value="first">
	<input type="radio" name="r" value="second">
	<input type="radio" name="r" value="third">
</body>
</html>