<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.cls{
		background-color :orange;
	}
	.cls2{
		font-size:200%;
	}
</style>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

$(function(){

	$('div').each(function(index,item){

		var itemss =$(item).attr('class','cls3');
		console.log(itemss);

		});
});

		
</script>
</head>
<body>

<div class="cls cl2">1</div>
<div>2</div>
<div>3</div>
</body>
</html>