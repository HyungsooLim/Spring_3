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

	<button onclick="go()">BUTTON</button>
	<button id="btn">CLICK</button>
	<button id="btn2">CLICK2</button>

	<script type="text/javascript">
		let btn = document.getElementById("btn");
		let btn2 = document.getElementById("btn2");
		
		//btn2.addEventListener("click", go);
		btn2.addEventListener("click", function(){
			alert("hello2");
		});
		
		
		//btn.onclick = go;
		btn.onclick = function() {
			alert("hello");
		}
		
		function go() {
			alert("hello");
			
		}
		
	</script>
<!-- 	<script type="text/javascript">
	
		function go() {
			alert("hello");
			let s = sum(f1);
			alert(s);
			
		}

		function sum(num1, num2=1) {
			return num1()+num2;
		}

		let f1 = function() {
			alert("익명함수");
			return 3;
		}
	</script> -->

</body>
</html>