<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

function formCheck(){

	if($('#member_id').length() < 4){

		alert('틀림1');
		return false;
		}	
	if($('#member_pw').length < 4){

		alert('틀림2');
		return false;
		}
	if($('#member_nm').length == 0 || $('.name').isEmpty){

		alert('틀림3');
		return false;
		}
	if($('#member_birth').length == 0 || $('.birth').isEmpty){

		alert('틀림4');
		return false;
		}

	return true;
	
}	
function formCheck(){
	 
 	var id = document.getElementById('user_id').value;
 	var psw = document.getElementById('user_psw').value;
 	var psw2 = document.getElementById('user_psw_check').value;
 	//배열로 같은 name을 가진 객체들을 받아와서 elements
 	var gender=  document.getElementsByName('성별');
 	
 	//성별을 선택했는 지 판단.
 	//체크가 됐는 지 확인하기 위한 변수
 	var cnt = 0;
 	
	if(id==''){
		
		alert('id는 필수 입력사항입니다.');
		return false;
		
	}else if(id.length<3||id.length>8){
		
		alert('id는 3글자에서 8글자 사이입니다.');
		
		return false;
	}
	
	//아이디에 숫자 불가
	
	for(var i =0; i<id.length;i++){
		
		var ch = id.chatAt(i);
		if(!isNaN(ch)){
		
			alert('id에는 숫자를 입력할 수 없음.');
			break;
		}
		return	false;
	}
	
	if(psw ==''){
		alert("비밀번호는 필수");
		return false;
		
	}else if(psw !=psw2){
		
		alert('일치하지 않음');
		return false;
		
	}else if(psw.length<4||psw.length>10){
		
		alert('글자수는 4이상 10이하');
		return false;
	}

	for(var i =0;i<gender.length;i++){
		
		if(gender[i].checked == true){
			cnt++;
		}
	}
	if(cnt==0){
		alert('성별을 입력해주세요');
		return false;
	}
	return true;
}
</script>

</script>

</head>
<body>
	
	<form action="/member/join" method="post" onsubmit="return formCheck();">
		ID<input type="text" name="member_id">
		PW<input type="password" name="member_pw">
		NAME<input type="text" name="member_nm">
		생일<input type="text" name="member_birth">
		
		<input type="submit" value="전송">	
		
	</form>
	

	
</body>
</html>