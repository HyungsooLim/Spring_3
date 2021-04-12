/**
 * 
 */

$(".fileDelete").click(function(){
	let check = confirm("Delete?");
	if(check){
		let fileNum=$(this).attr("title");
		let obj = $(this);
		$.ajax({
			type: "GET",
			url: "./fileDelete",
			data: {fileNum:fileNum},
			success: function(result){
				result=result.trim();
				if(result>0) {
					alert("삭제성공");
					$(obj).parent().remove();
					count--;
				} else {
					alert("삭제실패");
				}
			}
		});
	}
});

