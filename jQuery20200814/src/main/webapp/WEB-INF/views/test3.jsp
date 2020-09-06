<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 배열 관리 </title>
<style type="text/css">
	.cls{
		background-color : orange;
		
	}
	.cls2{
		font-size : 200%;
	}
</style>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">



	
	
	$(function(){
		var arr = ['red','blue','green'];
		
		//자바스크립트 이용한 반복
		for(var i =0;i<arr.length;i++){
			console.log(i+", "+arr[i]);
			}
		//제이쿼리 사용한 반복문
		/* $ 객에서 each 함수를 사용한다. */
		$.each(arr,function(index,item){
			console.log(index+", "+item);
			});
		//JQ
		$('div').each(function(index,item){
			$(item).css('color',arr[index]);
		/* 	$(item).addClass('cls');
			$(item).removeClass('cls'); */

			//여러개 클래스 전부 지우려면 인자 전달 안하면 된다.
			/* $(item).removeClass() */

			//속성이 attr
			//클래스 속성에 있는 값을 저장하고 보여
			
		
		
			var attr =$(item).attr('class');
			console.log(attr);
			$(item).attr('class','cls3');

			$(data).attr('data-value','test'+index);
			})

			
	
	});
	
</script>
</head>
<body>
	<div class="cls cls2">첫 번째 줄</div>
	<div class="cls cls2">두 번째 줄</div>
	<div class="cls cls2">세 번째 줄</div>
</body>
</html>