<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>

	<script type="text/javascript">
		function formCheck(){
			var user_id = document.getElementById("user_id").value;
			var user_pw = document.getElementById("user_pw").value;
			var user_pw_check = document.getElementById("user_pw_check").value;
			var user_nm = document.getElementById("user_nm").value;
			/* 성별은 이미 checked가 되어있으니까 검사할 필요가 없음 */

			if(user_id==''||user_id.length ==0){
				alert("아이디입력해야함.");
				return false;
				}
			if(user_pw==''||user_pw.length ==0){
				alert("비밀번호 입력해야함.");
				return false;
				}
			if(user_pw != user_pw_check){
				alert("비밀번호 동일하게 입력해야함.");
				return false;
				}
			if(user_nm==''||user_nm.length ==0){
				alert("이름입력해야함.");
				return false;
				}

			return true;
			}
	</script>
</head>
<body>
	<h1>[회원 가입 폼]</h1>
	<form action="/member/join" method="post" onsubmit="return formCheck();">
		ID:<input type="text" name="user_id" id="user_id"><br>
		PW:<input type="password" name ="user_pw" id="user_pw"><br>
		PW_CHECK:<input type="password" id ="user_pw_check"><br>
		NAME:<input type="text" name="user_nm" id="user_nm"><br>
		GENDER<br>
		<!-- radio랑 checkbox는 전달되야하는 값을 value에  -->
		남:<input type="radio" name="user_gender" value="m" checked="checked">
		여:<input type="radio" name="user_gender" value="f" >
		<input type="submit" value="회원가입">
		
	</form>
</body>
</html>