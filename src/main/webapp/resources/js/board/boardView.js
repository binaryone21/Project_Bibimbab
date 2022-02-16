/*** Global Variable **************************************************/


	let state = getParameterByName("state")


/*** Event ************************************************************/


	// 기타상담 수정하기
	$('#updateBtn').on('click', boardUpdate)

	// 기타상담 삭제하기
	$('#deleteBtn').on('click', boardDelete)


/*** Function *********************************************************/

	// 페이지 로딩시
	$(document).ready(function() {
		// 업로드 에러 메시지 출력
		if(state === "errorUpdate") { alert("업로드 실패") }
	});

	// 기타상담 수정하기
	function boardUpdate() {
		if($('#bd_secretNo').val() === $('#bd_userNo').val()) {
			location.href = "/board/update?SEQNO=" + $('#bd_SEQNO').val()
		} else {
			alert("비밀번호를 다시 확인해주세요")
		}
	}

	// 기타상담 삭제하기
	function boardDelete() {
		if($('#bd_secretNo').val() === $('#bd_userNo').val()) {
			location.href = "/board/delete?SEQNO=" + boardNo
		} else {
			alert("비밀번호를 다시 확인해주세요")
		}
	}