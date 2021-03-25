<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberUpdate</title>
</head>
<body>
	<h1>Member Update Form</h1>
	<form action="./memberUpdate" method="post">
		<input type="text" hidden="" name="id" value="${member.id }">
		PW : <input type="password" name="pw" value="${member.pw }"> 
		NAME : <input type="text" name="name" value="${member.name }">
		PHONE : <input type="tel" name="phone" value="${member.phone }">
		EMAIL : <input type="email" name="email" value="${member.email }">
		<button>수정</button>
	</form>
</body>
</html>