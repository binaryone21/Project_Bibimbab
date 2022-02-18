/*** Global Variable **************************************************/


	let state = getParameterByName("state")	// 현재 상태를 나타내는 변수


/*** Event ************************************************************/


	// 기타상담 수정완료
	$('#updateOkBtn').on('click', boardUpdateOk)


/*** Function *********************************************************/
	
	
	// 페이지 로딩시
	$(document).ready(function() {
		// 업로드 에러 메시지 출력
		if(state === "errorUpdate") { alert("업로드 실패") }
	});


	// 기타상담 수정완료
	function boardUpdateOk() {
		if(!checkBoardData()) { return }	// 유효성 검사

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
