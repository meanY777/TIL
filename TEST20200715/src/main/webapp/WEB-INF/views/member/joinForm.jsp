<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script type="text/javascript">
		function formCheck(){

			var id = document.getElementById("id").value;
			var pw = document.getElementById("pw").value;
			var pw_check = document.getElementById("pw_check").value;
			var age = document.getElementById("age").value;

			if(id  == ''||id.length ==0){
				alert("아이디를 입력해주세요");
				return false;
				}
			if(pw  == ''||pw.length ==0){
				alert("비밀번호를 입력해주세요");
				return false;
				}
			if(pw != pw_check){
				alert("동일한 비밀번호를 입력해주세요");
				return false;
				}
			if(age ==''||age.length ==0){
				alert("나이를 입력해주세요");
				return false;
				}
			
			return true;

			}
	</script>
</head>
<body>

	<form action="/member/join" method="post" onsubmit="return formCheck();">
		ID:<input type="text" id="id" name="id"><br>
		PW:<input type="password" id="pw" name="pw"><br>
		PW_CHECK:<input type="password" id ="pw_check"><br>
		AGE:<input type="text" id="age" name="age"><br>
		남:<input type="radio" name="gender" value="m" checked="checked">
		여:<input type="radio" name="gender" value="f"><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>