/**
 * 
 */


//commentsList 가져오기
let num = $("#comments").attr("title");

getList();

function getList() {
	$.get("../comments/commentsList?num=" + num, function(data) {
		data = data.trim();
		$("#comments").html(data);
	});
} //------------------------------


$("#write").click(function() {
	let writer = $("#writer").val();
	let contents = $("#contents").val();

	$.post("../comments/commentsInsert",
		{
			num: num,
			writer: writer,
			contents: contents
		}, function(data) {
			data = data.trim();
			if (data == 1) {
				alert("등록성공");
				$("#writer").val("");
				$("#contents").val("");
				getList();
			} else {
				alert("등록실패");
			}
		});
}); //-------------------------------

$("#comments").on("click", "#remove", function(){
	const ar = []; //빈 배열
	
	$(".del").each(function(){
		let ch = $(this).prop("checked");
		if(ch){
			length = ar.push($(this).val());
		}
		
	}); // each END
	
	$.ajax({
		type: "POST",
		url: "../comments/commentsDelete",
		traditional: true,
		data: {commentNum:ar},
		success: function(data){
			alert(data);
		}
	});
	
}); // click END









