<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<!-- 
		form 태그 안에 submit 버튼이 action에 "" 안으로 보냄 
		action = 폼 tag 안에 있는 데이터가 전달될 주소
		method = 폼 tag 안에 있는 데이터를 전달할 때 사용할 http method 방식을 지정
					대표적으로 get, post 방식이 있음. 
					get :데이터가 노출되면서 전달
					post 데이터가 숨겨져서 전달
	-->
	<!-- 
						[규칙]
						
			name의 값을 자바의 변수명을 일치시켜야함.
			
			
		 -->
<!-- 	<form action="/join" method="post">
		
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		이름: <input type="text" name ="name"><br>
		나이: <input type="number" name="age"><br>
		<input type="submit" value="가입">
	</form> -->
	
		<form action="/join2" method="post">
		
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		이름: <input type="text" name ="name"><br>
		나이: <input type="number" name="age"><br>
		<input type="submit" value="가입">
		
		</form>
	
</body>
</html>
