<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	$(function(){
		$("input[type=text]").keyup(function(e){
			var data = $(this).val();

			if(data.length<4){
				$('#idCheck').css("color","red");
				$("#idCheck").text("아이디는 4자리 이상 입력하세요");
			}else{	
				$('#idCheck').css("color","green");
				$("#idCheck").text("사용할 수 있는 아이디입니다.");


				}

				if(e.keyCode == 13)
					formCheck();
					
			})

		$('input[type=password]').keyup(function(e){
			var data = $(this).val();

			if(data.length<4 ){
				$('#pwCheck').css("color","red");
				$("#pwCheck").text("비밀번호는 4자리 이상 입력하세요");
				}else{
					$('#pwCheck').css("color","green");
					$("#pwCheck").text("비밀번호 잘 입력했습니다");

					}
			if(e.keyCode == 13){
				formCheck();
				}
			})

			
	

	$('input[type=button]').click(formCheck);
	
	});

	function formCheck(){
		var userId =$("input[type=text]").val();
		var userPw =$("input[type=password]").val();
		var gender =$('input[type=radio]:checked');
		var hobby = $('input[type=checkbox]:checked');

		var flag = true;
		
		if(userId.length < 4){
			$('#idCheck').css("color","red");
			$("#idCheck").text("아이디는 4자리 이상 입력하세요");		
			flag = false;
			
			}else{
				$('#idCheck').css("color","green");
				$("#idCheck").text("");	
				}
		if(userPw.length < 4){
			$('#pwCheck').css("color","red");
			$("#pwCheck").text("비밀번호는 4자리 이상 입력하세요");		
			flag = false;
			}else{
				$('#pwCheck').css("color","green");
				$("#pwCheck").text("");	
				}
		if(gender.length <1){
			$("#genderCheck").css("color","red");
			$("#genderCheck").text("성별을 입력하세요");	
			flag = false;
			}else{
				$('#genderCheck').css("color","green");
				$("#genderCheck").text("");	
				}
		if(hobby.length <1){
			$("#boxCheck").css("color","red");
			$("#boxCheck").text("취미를 한 개 이상 입력하세요");
			flag = false;	
			}else{
				$('#boxCheck').css("color","green");
				$("#boxCheck").text("");	
				}
		if(flag){
			$('form').submit();

			}
		}
</script>
</head>
<body>
	<form action="/join" method="get">
		
		<table>
			<tr>
				<td>아이디</td> 
				<td><input type ="text" name="user_id"></td>
				<td><div id="idCheck"></div></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type ="password" name="user_pw"></td>
				<td><div id="pwCheck"></div></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					남자:<input type ="radio" name="gender" value="male">
					여자:<input type ="radio"name="gender" value="female">
				</td>
				<td><div id="genderCheck"></div></td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
				독서<input type ="checkbox" name="hobby"value="reading">
				음악감상<input type ="checkbox" name="hobby" value="listening">
				게임<input type ="checkbox" name="hobby"  value="game">
				</td>
				<td><div id="boxCheck"></div></td>
			</tr>
		</table>
		
		<input type="button" value="가입하기" >
		
	</form>
</body>
</html>