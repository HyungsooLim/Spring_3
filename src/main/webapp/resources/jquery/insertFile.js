/**
 * ADD 버튼 클릭하면 files 내부에 sample 내부의 것들을 추가

	한번 더 누르면 하나 더 생기게

	최대 5개까지만 생성

	5개 넘어가면 alert 창으로 경고
 */
let count = 0;

$("#add").click(function() {
	let sample = $("#sample").html();
	if (count < 5) {
		$("#files").append(sample);
		count++;
	}else{
		alert("5개 이상 추가할 수 없습니다.");
	}

});