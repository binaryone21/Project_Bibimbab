/*** Global Variable **************************************************/


	let boardNo = getParameterByName("SEQNO")
	let state = getParameterByName("state")


/*** Event ************************************************************/


	// 기타상담 수정완료
	$('#updateOkBtn').on('click', setBoardData)


/*** Function *********************************************************/
	
	
	// 페이지 로딩시
	$(document).ready(function() {
		// 게시물 번호 저장
		$('#bd_update_SEQNO').val(boardNo)
		
		// 업로드 에러 메시지 출력
		if(state === "error") { alert("업로드 실패") }
	});

	// 기타상담 수정완료
	function setBoardData() {
		// 유효성 검사
		if(!checkBoardData()) { return }

		$('#bd_update_form').attr('action', '/board/updateOK')
		$('#bd_update_form').attr('method', 'post')
		$('#bd_update_form').submit()
	}

	// 기타상담 유효성 검사
	function checkBoardData() {
		let inform = ''
		
		// 제목 유효성 검사
		if($('#bd_update_title').val()) {
			inform += '제목을 확인해주세요\n'
		}
		
		// 내용 유효성 검사
		if($('#bd_update_content').val()) {
			inform += '내용을 확인해주세요\n'
		}
		
		// 유효성 실패 메세지
		if(inform) {
			alert(inform)
			return false
		}
		return true
	}
