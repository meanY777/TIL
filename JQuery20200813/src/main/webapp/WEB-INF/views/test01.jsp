<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST01</title>

<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<script type="text/javascript">
	
	/* document는 이 페이지를 의미한다. 
	이 객체를 호출한다 -> $(document)
	.ready는 그 안에 함수인데.
	
	인수로 함수를 보내는 것.
	페이지 로딩이 끝나면 이 함수를 실행해라 라는 것.
	
	 
	 [ js고유 문법으로 하면 이런 형태 ]
	 
	 window.onload = function(){alert("Hello world!")} 

	
	 $(대상 이름)
	 
	 문법이 대략 이런 식임.
	 */
	 
		$(document).ready(function(){
			
				alert("Hello world!");

			});

		$(function(){
			alert("Hello World!");
			});
		
	</script>

</body>
</html>