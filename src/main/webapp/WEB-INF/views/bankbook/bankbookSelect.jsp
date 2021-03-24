<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bankbookSelect</title>
</head>
<body>
	<h1>Bankbook Select Page</h1>
	<h3>NAME : ${DTO.bookName}</h3>
	<h3>NUMBER : ${DTO.bookNumber}</h3>
	
	<a href="./bankbookDelete?bookNumber=${DTO.bookNumber}">Delete</a>
	<a href="./bankbookUpdate?bookNumber=${DTO.bookNumber}">Update</a>
</body>
</html>