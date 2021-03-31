/**
 * 
 */

function check() {
	let all = document.getElementById("all");
	let cs = document.getElementsByClassName("c1");
	
	all.checked=true;
	for (let c of cs) {
		if (c.checked == false) {
			all.checked = false;
		}
	}





}