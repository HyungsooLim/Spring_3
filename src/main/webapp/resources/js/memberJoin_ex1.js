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

pw2.addEventListener("change", function(){
	
});




//=== Name ====================================================================



//=== Phone ====================================================================



//=== Email ====================================================================