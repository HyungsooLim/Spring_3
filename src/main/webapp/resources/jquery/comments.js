/**
 * 
 */


//commentsList 가져오기
let num = $("#comments").attr("title");

$.get("../comments/commentsList?num=" + num, function(data) {
	console.log(data);
	data = data.trim();
	$("#comments").html(data);
});

$("#write").click(function() {
	let writer = $("#writer").val();
	let contents = $("#contents").val();

	$.post("../comments/commentsInsert", 
	{ 
		writer: writer, 
		contents: contents 
	}, function(data){
		alert(data);
	});
});









