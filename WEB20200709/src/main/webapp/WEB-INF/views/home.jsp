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
	<form action="/login" method="post">
		ID:<input type="text" name="id"><br>
		PW:<input type="password" name="pw"><br>
		NAME:<input type="text" name="name"><br>
		AGE:<input type="text" name="age"><br>
		<input type="submit" value="전송">
	</form>
	
</body>
</html>
