/**
 * 
 */
/*
btn.addEventListener("click", function(){
	if(all.checked){
		location.href = "./memberJoin"; // GET
	}else {
		alert(" 약관 동의는 필수");
	}
});
*/


$("#all").click(function() {
	let boolean = $(this).prop("checked");
	$(".check").prop("checked", boolean);
});

$(".check").click(function() {
	let result = true;
	$(".check").each(function() {
		if (!$(this).prop("checked")) {
			result = false;
		};
	});
	$("#all").prop("checked", result);
});

$("#btn").click(function(){
	if($("#all").prop("checked")){
		location.href="./memberJoin";
	}else{
		alert("약관에 동의하세요");
	}
});




