<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src ="/resources/jquery-3.5.1.min.js">
</script>

<script type="text/javascript">

$(function(){

	var arr = ["https://naver.com","https://daum.net","https://google.co.kr"]
	
	$('a').each(function(index,item){
			$(item).attr('href',arr[index]);
			
		});
	
});

function removeLink(){
		/*  $('a').each(function(index,item){

		if($(item).attr("href") == 'https://naver.com')
			
			$(item).removeAttr('href'); 

		$("#daum").removeAttr('href');
		
		}); */

	var txt = $("input[type=text]").val();

	$('a').each(function(index,item){
		if($(item).attr('href') == txt)
			$(item).removeAttr('href');
		})

}
</script>
</head>
<body>
<a >네이버로 이동</a><br>
<a id="daum">다음으로 이동</a><br>
<a >구글으로 이동</a>
<input type="text">
<button onclick="removeLink();">링크삭제</button>
</body>
</html>