<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js"></script>

<script type="text/javascript">

function clickFunc(){
	$('input[type="text"]').val('클릭!');
	}
	$(function(){
		/* 자손 선택자 */
		$('div > h1').css('color','red');
		
		/* 후손 선택자 */
		$('div h1').css('background-color','green');

		/* 속성 선택자 */
		$('input[type="button"]').css('background-color','yellow');

		var val = $('input[type="submit"]').val();
		alert(val);

		alert('당신이 좋아하는 동물을 5초 안에 선택하세요 !');
		

		setTimeout(function(){
			var sel = $('#pet option:selected').val();
			
			alert('당신이 선택한 동물은'+sel+'입니다.');
			
			},5000);
	});
</script>
</head>
<body>
	<select id = "pet">
		<option>강아지</option>
		<option>고양이</option>
	</select>
	<div>
		<h1>안녕?</h1>
		<span>
			<h1>하세요?</h1>
		</span>
	</div>
	<input type="text">
	<input type="button" value="버튼" onclick = "clickFunc();">
	<input type="submit" value="전송">
	<input type="reset" value="초기화">
	
	
</body>
</html>