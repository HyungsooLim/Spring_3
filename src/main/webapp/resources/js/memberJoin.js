/**
 * 
 */

let idResult = document.getElementById("idResult");
let id = document.getElementById("id");

id.addEventListener("blur", function() {
	let message = "6글자 미만입니다";
	let c = "r1";
	if (id.value.length > 5) {
		message = "6글자 이상 입니다";
		c = "r2";
	}

	idResult.innerText =  message;

	idResult.setAttribute("class", c);
});
//-----------------------------------------------------------
let pw = document.getElementById("pw");
let pwResult = document.getElementById("pwResult");

pw.addEventListener("change", function(){
	pw2.value="";
});


pw.addEventListener("blur", function() {
	let message = "8글자 이상입니다.";
	let c = "r2";
	if (pw.value.length < 8) {
		message = "8글자 미만입니다.";
		c = "r1";
	}
	pwResult.innerHTML = message;
	pwResult.setAttribute("class", c);
});

//-------------------------------------------------------------
let pw2 = document.getElementById("pw2");

pw2.addEventListener("blur", function() {
	if (pw2.value != pw.value) {
		pw2.value="";
	}
});

//-------------------------------------------------------------
let btn = document.getElementById("btn");

btn.addEventListener("click", function(){
	//조건이 만족되면 submit
	let frm = document.getElementById("frm");
	frm.submit();
});

//----------------------------------------------------------------
let check = document.getElementById("check");

check.addEventListener("click", function(){
	alert("test");
	return false;
});


