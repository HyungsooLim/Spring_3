/**
 * 
 */

$("#add").click(function() {
	let sample = $("#sample").html();
	let i = 0;
	for (let i = 0; 5; i++) {
		if (i < 5) {
			$("#files").append(sample);
		}else {
			break;
		}
	}

});