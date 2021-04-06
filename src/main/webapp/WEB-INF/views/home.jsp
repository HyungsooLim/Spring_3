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

	<button class="b">BUTTON</button>
	<button id="btn" class="b">CLICK</button>
	<button id="btn2" class="b">CLICK2</button>
	<h1 id="t">version</h1>
	<ol id="result">
		<li>A</li>
	</ol>

	<select id="mon">

	</select>

	<script type="text/javascript">
		$("#btn2").click(function(){
			$("#result").prepend('<li>GO</li>');
		});
		
		$("#btn").click(function(){
			for(let i=1;i<13;i++){
				$("#mon").append("<option>"+i+"</option>");
			}				
		});
		
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