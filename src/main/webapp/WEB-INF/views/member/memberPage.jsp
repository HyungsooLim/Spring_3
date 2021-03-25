<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberPage</title>
</head>
<body>
<h1>Member Page</h1>
<h3>ID : ${member.id }</h3>
<h3>PW : ${member.pw }</h3>
<h3>NAME : ${member.name }</h3>
<h3>PHONE : ${member.phone }</h3>
<h3>EMAIL : ${member.email }</h3><br>
<a href="./memberUpdate">수정</a><br>
<a href="./memberDelete">탈퇴</a><br>
<a href="">계좌관리</a>
</body>
</html>