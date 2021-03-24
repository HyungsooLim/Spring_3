<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bankbookUpdate</title>
</head>
<body>
	<h1>Bankbook Update Form</h1>
	<form action="./bankbookUpdate" method="post">
	<input type="hidden" name="bookNumber" value="${DTO.bookNumber}">
	<!--  NUMBER : <input type="text" readonly="readonly" name="bookNumber" value="${DTO.bookNumber}"><br> -->
	NAME : <input type="text" name="bookName" value="${DTO.bookName}"><br>
	RATE : <input type="text" name="bookRate" value="${DTO.bookRate}"><br>
	SALE : <input type="text" name="bookSale" value="${DTO.bookSale}"><br>
	<button>Update</button>
	</form>
</body>
</html>