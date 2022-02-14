/*** Global Variable **************************************************/


	let boardNo = getParameterByName("SEQNO")


/*** Event ************************************************************/


	// 기타상담 수정하기
	$('#updateBtn').on('click', boardUpdate)

	// 기타상담 삭제하기
	$('#deleteBtn').on('click', boardDelete)


/*** Function *********************************************************/


	// 기타상담 수정하기
	function boardUpdate() {
		if($('#bd_secretNo').val() === $('#bd_userNo').val()) {
			location.href = "/board/update?SEQNO=" + boardNo
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