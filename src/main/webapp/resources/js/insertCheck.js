/**
 * 
 */

let btn = document.getElementById("btn");
let frm = document.getElementById("form");
let writer = document.getElementById("writer");
let title = document.getElementById("title");

btn.addEventListener("click", function() {
	let check1 = writer.value.length != 0;
	let check2 = title.value != "";

	if (check1 && check2) {
		frm.submit();
	} else {
		alert("입력 항목 확인");
	}

});

