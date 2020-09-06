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
		var name = document.getElementById('name').value;
		var fun = document.getElementsByName('fun');

		if(id.length>10||id.length<4){

			alert('아이디는 4자 이상 10자 이하입니다.');
			return false;
			}
		if(pw.length>10||pw.length<4){

			alert('비밀번호는 4자 이상 10자 이하입니다.');
			return false;
			}
		if(name==''||name.length==0){
			alert('아이디는 필수입니다.')
			}

		var cnt =0;
		for(var i=1; i<fun.length;i++){

			if(fun[i].checked){
				cnt++;
				}
			}
		if(cnt<2){
			alert('취미는 2개 이상 입력해주세요');
			return false;
			}
		
		return true;
		}
</script>

</head>
<body>


	<form action="/member/checkForm" method="post" onsubmit="return formCheck();">
	 	ID:<input type="text" id="id" name="id"><br>
	 	PW:<input type="password" id="pw" name="pw"><br>
	 	PW_CHECK<input type="password" id="pw_check" name="pw_check"><br>
	 	NAME<input type="text" id="name" name="name"><br>
	 	취미<input type="checkbox" name="fun" value="독서">독서
	 	<input type="checkbox" name="fun" value="운동"> 운동
	 	<input type="checkbox" name="fun" value="노래감상">노래감상
	 	<input type="checkbox" name="fun" value="영화보기">영화보기
	 	<input type="checkbox" name="fun" value="노래부르기">노래부르기
	 	남:<input type="radio" name = "gender" value="m" checked="checked">
	 	여: <input type="radio" name ="gender" value="f">
	 	<br>자기소개: <textarea rows="20" cols="20" name="introduce"></textarea><br>
	 	<input type="submit" value="가입하기">
	 	
	 	
	</form>
</body>
</html>