<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function formCheck() {
	var id = document.getElementById('id');
	var pw = document.getElementById('password');

	if (id.value == ''||id.length==0) {
		alert("id 입력하세요.");

		return false;
	}
	if (id.value.length < 3 || id.value.length > 8) {
		alert("ID는 3~8자로 입력하세요.");

		return false;
	}
	
	if (pw.value == ''||pw.length==0) {
		alert("pw 입력하세요.");

		return false;
	}
	if (pw.value.length < 5 || pw.value.length > 10) {
		alert("비밀번호는 5~10자로 입력하세요.");

		return false;
	}


	return true;
}
</script>
</head>
<body>

<h1>[로그인]</h1>

<form action="/member/login" method="post" onsubmit="formCheck();">	

	아이디<input type="text" name="acc_id" id="id"><br>
	비밀번호<input type="password" name="acc_pw"id="password"><br>
	
	<input type="submit" value="로그인" >
</form>

</body>
</html>