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
			var phone1 = document.getElementById("phone1").value;
			var phone2 = document.getElementById("phone2").value;
			var phone3 = document.getElementById("phone3").value;
			var phone = phone1+'-'+phone2+'-'+phone3;
			document.getElementById('phone').value=phone;

			if(id==''||pw==''|phone1==''||phone2==''||phone3==''){
				alert('모든 항목 작성이 필수입니다.');
				return false;
			}
			if(id.length<4||id.length>12){
				alert('아이디는 4자 이상 12자 이하입니다.');
				return false;
			}
			if(pw.length<4||pw.length>12){
				alert('비밀번호는 4자 이상 12자 이하입니다.');
				return false;
						
			}
			if(isNaN(phone1)||isNaN(phone2)||isNaN(phone3)){
				alert('phone은 숫자만 입력가능합니다.');
				return false;
			}
			return true;
			
			}
	</script>
</head>
<body>
	<h1>[회원 가입 폼]</h1>
	<form  action="/formclear" onsubmit="return formCheck();"method="post">
		ID:<input type="text" id="id" name="id"><br>
		PW:<input type="password" id="pw" name="pw"><br>
		Phone:<input type="text" id="phone1">-<input type="text" id="phone2">
		 -<input type="text" id="phone3"><br>
		
		<input type="hidden" id="phone" name="phone">
		<input type="submit" value="가입">
		
	
	</form>
</body>
</html>