/**
 * 
 */
let all = document.getElementById("all");
let check = document.getElementsByClassName("check");

all.addEventListener("click", function() {
	for (let ch of check) {
		ch.checked = all.checked;
	}
});


for (let ch of check) {
	ch.addEventListener("click", function() {
		let result = true;
		for (let c of check) {
			if (!c.checked) {
				result = false;
				check;
			}
		}
		all.checked=result;
	});
}







/*
function check() {
	alert("check");
	let check = document.getElementsByClassName("check");
	let all = document.getElementById("all");

	let result = true;

	for (ch of check) {
		if (!ch.checked) {
			result = false;
			break;
		}
	}
	console.log(result);
	all.checked = result;

}
*/


