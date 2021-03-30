<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<link rel="stylesheet" href="./resources/css/test.css">
<c:import url="./template/bootStrap.jsp"></c:import>
<title>home</title>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>

	<div>
		<button id="btn" onclick="go()">CLICK</button>
		<button onclick="go2()">CLICK 2</button>
	</div>
	<div class="b1" id="c1">
		<h1 id="t1">Welcome Home Page</h1>
	</div>

	<script type="text/javascript" src="./resources/js/test.js"></script>
</body>
</html>