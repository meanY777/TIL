<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<script type="text/javascript">
		function formCheck(){
				var id = document.getElementById('id').value;
				var pw = document.getElementById('pw').value;
				var phone0 = document.getElementById('phone0').value;
				var phone1 = document.getElementById('phone1').value;
				var phone2 = document.getElementById('phone2').value;
				
				var phone3 = phone0+"-"+phone1+"-"+phone2;
				document.getElementById('phone').value =phone3;
				
				if(id==''||pw==''|phone0==''||phone1==''||phone2==''){
					alert('모든 항목을 입력해야합니다.');
					return false;
					}
				if(id.length<4||id.length>12){
					alert('id는 4자 이상 12자 이하입니다.');
					return false;
				}
				if(pw.length<4||pw.length>12){
					alert('pw는 4자 이상 12자 이하입니다.');
					return false;
				}
				if(isNaN(phone0)){
					alert("phone은 숫자만 입력하세요");
					return false;
					
				}
				if(isNaN(phone1)){
					alert("phone은 숫자만 입력하세요");
					return false;
				}
				if(isNaN(phone2)){
					alert("phone은 숫자만 입력하세요");
					return false;
				}


					
			
				return true;
			}
		
	</script>
</head>
<body>
	<form action="/loginvalue" onsubmit="return formCheck();"  method="post">
		ID:<input type="text" id="id" name="id"><br>
		PW:<input type="password" id="pw" name ="pw"><br>
		Phone:<input type="text" id="phone0" name="phone0">-<input type="text"id="phone1"name="phone1">-<input type="text" id="phone2"name="phone2">
		<br><input type="hidden" id="phone" name="phone" >
		
		<input type="submit"  value="가입" >
	</form>
</body>
</html>