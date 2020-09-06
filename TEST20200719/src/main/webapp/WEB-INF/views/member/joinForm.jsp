<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function formCheck(){
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		var pw_check = document.getElementById('pw_check').value;
		var name = document.getElementById('name').value;
		var hobby = document.getElementsByName('hobby');

		alert('1');
		if(id.length>10||id.length<4){
			alert('아이디는 4자 이상 10자 이하입니다.');
			return false;
			}
		var cnt = 0;

		for(var i=0;i<hobby.length;i++){
			if(hobby[i].checked){
				cnt++;
				}
			}

		if(cnt<2){
			alert('취미는 2개 이상 선택하세요');
			return false;
			}
		
		return true;

		}
</script>
</head>
<body>
	<form action="/member/checkJoin" method="post" onsubmit="return formCheck();">
		ID:<input type="text" name="id" id="id"><br>
		PW:<input type="password" name ="pw" id="pw"><br>
		PW_CHECK:<input type="password" id="pw_check"><br>
		NAME:<input type="text" name="name" id="name"><br>
		HOBBY: 달리기:<input type="checkbox" name="hobby" value="달리기" >
		걷기:<input type="checkbox" name="hobby" value="걷기" >
		노래듣기:<input type="checkbox" name="hobby" value="노래듣기" >
		춤추기:<input type="checkbox" name="hobby" value="춤추기" >
		독서:<input type="checkbox" name="hobby" value="독서" >
		<br>
		자기소개:<textarea rows="10" cols="50" name="introduce"></textarea>
		<input type="submit" value="가입">
		
	</form>
</body>
</html>