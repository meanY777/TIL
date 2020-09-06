<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">

function formCheck() {
	var id = document.getElementById('id');
	var pw = document.getElementById('password');
	var pw2 = document.getElementById('password2');
	var name = document.getElementById('name');
	
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

	if (pw.value != pw2.value) {
		alert("비밀번호를 정확하게 입력하세요.");

		return false;
	}
	if (name.value == '') {
		alert("이름을 입력하세요.");

		return false;
	}
	document.getElementById('searchForm').submit();
}
</script>
<body>



<h1>[회원가입]</h1>

<form action="/member/join" method="post" id="searchForm" >	
	아이디<input type="text" name="acc_id" id="id"><br>
	비밀번호<input type="password" name="acc_pw"id="password"><br>
	비밀번호확인<input type="password" id="password2"><br>
	이름<input type="text" name="acc_nm"id="name"><br>
	<input type="button" value="가입하기" onclick="formCheck();">
</form>
</body>
</html>