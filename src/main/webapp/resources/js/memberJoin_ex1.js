/**
 * 
 */
let id = document.getElementById("id");
let idResult = document.getElementById("idResult");

let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");
let pwResult = document.getElementById("pwResult");

let name = document.getElementById("name");
let nameResult = document.getElementById("nameResult");

let email = document.getElementById("email");
let emailResult = document.getElementById("emailResult");

let btn = document.getElementById("btn");

let etc = document.getElementsByClassName("etc");

let idCheckResult = false; // id check 결과
let pwCheckResult = false; // pw check 결과
let pwEqualResult = false; // pw equal 결과
let etcResult = true; // name, phone, email check 결과

//=== ID ====================================================================

id.addEventListener("blur", function() {
	let message = "6글자 미만";
	let color = "r1";
	if (id.value.length > 5)  {
		message = "6글자 이상";
		color = "r2";
		idCheckResult = true;
	}
	idResult.innerHTML = message;
	idResult.setAttribute("class", color);

}); // --- event END ---

//=== PW ====================================================================

pw.addEventListener("blur", function() {
	let message = "8글자 미만";
	let color = "r1";
	if (pw.value.length > 7)  {
		message = "8글자 이상";
		color = "r2";
		pwCheckResult = true;
	}
	pwResult.innerHTML = message;
	pwResult.setAttribute("class", color);
}); // --- 글자 수 event END ----------------------------

pw2.addEventListener("blur", function() {
	if (pw.value != pw2.value ){ 
		pw2.value = "";
	} else {
		pwEqualResult = true;
	}
}); // --- pw 불일치 시 pw확인 비우기 -------------------

pw.addEventListener("change", function() {
	pw2.value = "";
}); // --- pw 수정 시 pw확인 비우기 ---------------------


//=== Name ====================================================================

name.addEventListener("blur", function() {
	let message = "";
	let color = "";
	if (name.value.length == 0) {
		message = "필수입력사항";
		color = "r1";
	}
	nameResult.innerHTML = message;
	nameResult.setAttribute("class", color);
}); // --- event END ---


//=== Phone ====================================================================
let phone = document.getElementById("phone");
let phoneResult = document.getElementById("phoneResult");

phone.addEventListener("blur", function() {
	let message = "";
	let color = "";
	if (phone.value.length == 0) {
		message  = "필수입력사항";
		color = "r1";
	}
	phoneResult.innerHTML = message;
	phoneResult.setAttribute("class", color);
}); // --- event END ---

//=== Email ====================================================================

email.addEventListener("blur", function() {
	let message = "";
	let color = "";
	if (email.value.length == 0)  {
		message = "필수입력사항";
		color = "r1";
	}
	emailResult.innerHTML = message;
	emailResult.setAttribute("class", color);
}); // --- event END ---


//=== submit ===================================================================
btn.addEventListener("click", function() {
	for (let e of etc) {
		if (e.value == "") {
			etcResult = false;
			break;
		}
	}
});

btn.addEventListener("click", function() {
	if (idCheckResult && pwCheckResult && pwEqualResult && etcResult) {
		let frm = document.getElementById("frm");
		//frm.submit();
		alert("회원가입 성공");
	} else {
		alert("필수항목 입력");
	}
});



