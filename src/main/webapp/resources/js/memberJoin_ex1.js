/**
 * 
 */

//=== ID ====================================================================
let id = document.getElementById("id");
let idResult = document.getElementById("idResult");

id.addEventListener("blur", function(){
	let message = "6글자 이상";
	let color = "r2";
	if(id.value.length<6){
		message = "6글자 미만";
		color = "r1";
	}
	idResult.innerHTML=message;
	idResult.setAttribute("class", color);
	
}); // --- event END ---

//=== PW ====================================================================
let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");
let pwResult = document.getElementById("pwResult");

pw.addEventListener("blur", function(){
	let message = "8글자 이상";
	let color = "r2";
	if(pw.value.length<8){
		message="8글자 미만";
		color = "r1";
	}
	pwResult.innerHTML=message;
	pwResult.setAttribute("class", color);
}); // --- 글자 수 event END ----------------------------

pw2.addEventListener("blur", function(){
	if(pw.value!=pw2.value){
		pw2.value="";
	}
}); // --- pw 불일치 시 pw확인 비우기 -------------------

pw.addEventListener("change", function(){
	pw2.value="";
}); // --- pw 수정 시 pw확인 비우기 ---------------------


//=== Name ====================================================================
let name = document.getElementById("name");
let nameResult = document.getElementById("nameResult");

name.addEventListener("blur", function(){
	let message = "";
	let color = "";
	if(name.value.length==0){
		message = "필수입력사항";
		color = "r1";
	}
	nameResult.innerHTML=message;
	nameResult.setAttribute("class", color);
}); // --- event END ---


//=== Phone ====================================================================
let phone = document.getElementById("phone");
let phoneResult = document.getElementById("phoneResult");

phone.addEventListener("blur", function(){
	let message = "";
	let color = "";
	if(phone.value.length==0){
		message="필수입력사항";
		color = "r1";
	}
	phoneResult.innerHTML=message;
	phoneResult.setAttribute("class", color);
}); // --- event END ---

//=== Email ====================================================================
let email = document.getElementById("email");
let emailResult = document.getElementById("emailResult");

email.addEventListener("blur", function(){
	let message = "";
	let color = "";
	if(email.value.length==0){
		message="필수입력사항";
		color = "r1";
	}
	emailResult.innerHTML=message;
	emailResult.setAttribute("class", color);
}); // --- event END ---


//=== submit ===================================================================
