<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>memberJoin</title>
<style type="text/css">
	.r1 {
		color: red;
	}
	
	.r2 {
		color: blue;
	}
</style>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h2>Member Join Page</h2>
		<form id="frm" action="./memberJoin" method="post">
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" aria-describedby="idHelp" name="id">
				<h4 id="idResult">test</h4>
				<!-- ID는 6글자 이상 -->
			</div>
			<div class="form-group">
				<label for="pw">Password</label>
				<input type="password" class="form-control" id="pw" name="pw">
				<h4 id="pwResult">test</h4>
				<!-- PW는 8글자 이상 -->
			</div>
			<div class="form-group">
				<label for="pw">Password Check</label> 
				<input type="password" class="form-control" id="pw2" name="pw">
				<!-- PW 두개는 일치 -->
			</div>
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control" id="name" name="name">
				<!-- 비어있으면 안됨 -->
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="tel" class="form-control" id="phone" name="phone">
				<!-- 비어있으면 안됨 -->
			</div>
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="email" class="form-control" id="email" name="email">
				<!-- 비어있으면 안됨 -->
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1"> <label class="form-check-label" for="exampleCheck1">Check me out</label>
			</div>
			
			<input type="button" id="btn" value="JOIN" class="btn btn-primary">
			
			<!-- 조건에 모두 맞으면 OK 아니면 NO -->
		</form>
	</div>
	<script type="text/javascript" src="../resources/js/memberJoin_ex1.js"></script>
</body>
</html>