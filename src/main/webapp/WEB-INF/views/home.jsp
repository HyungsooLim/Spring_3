<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<link rel="stylesheet" href="./resources/css/test.css">
<c:import url="./template/bootStrap.jsp"></c:import>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=92330137c1a1fe9c7a9b42b0d56ee2f8"></script>
<style type="text/css">
#d1 {
	width: 200px;
	height: 200px;
	background-color: firebrick;
	overflow: hidden;
}

#d2 {
	width: 50px;
	height: 50px;
	background-color: gold;
	margin: 75px auto;
}
</style>
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

	<div id="d1">
		<div id="d2"></div>
	</div>
	<div id="map" style="width: 500px; height: 400px;"></div>



	<!-------------------------------JS ---------------------------------->
	<script type="text/javascript">
		$("#btn2").click(function(){
			$.get("./test?num=3", function(data){
				console.log(data);
				$("#d2").html(data);
			});
		});
	</script>
	<script type="text/javascript">
	var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
	var options = { //지도를 생성할 때 필요한 기본 옵션
		center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
		level: 3 //지도의 레벨(확대, 축소 정도)
	};

	var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
	</script>

	<!-- <script type="text/javascript">
		$("#btn2").click(function(){
			$("#result").prepend('<li>GO</li>');
		});
		
		$("#btn").click(function(){
			for(let i=1;i<13;i++){
				$("#mon").append("<option>"+i+"</option>");
			}				
		});
		
		
		$("#d1").click(function(){
			console.log("parent");
		});
		
		$("#d2").click(function(){
			console.log("child");
		});
		
	</script> -->
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