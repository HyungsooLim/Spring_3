/**
 * 
 */

$("#btn").click(function(){
	/*let title = $("#title").val() != "";
	let writer = $("#writer").val().length != 0;
	let contents = $("#contents").val().length != 0;*/
	
	let result = true;
	
	
	$(".check").each(function(s1, s2){
		console.log(s1);
		console.log($(s2).val());
		console.log($(this).val());
		if($(this).val()==""){
			result = false;
		}
	});
	
	if(result){		
		$("#frm").submit();
	} else {
		alert("필수입력 필요");
	}
	
});