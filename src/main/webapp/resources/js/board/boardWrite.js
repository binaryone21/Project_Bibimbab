/*** Global Variable **************************************************/


	let state = getParameterByName("state")	// 현재 상태를 나타내는 변수


/*** Event ************************************************************/


	// 기타상담 수정완료
	$('#writeOkBtn').on('click', boardWriteOk)


/*** Function *********************************************************/
	
	
	// 페이지 로딩시
	$(document).ready(function() {
		// 업로드 에러 메시지 출력
		if(state === "errorWrite") { alert("업로드 실패") }
	});


	// 기타상담 수정완료
	function boardWriteOk() {
		if(!checkBoardData()) { return }	// 유효성 검사

		$('#bd_write_form').attr('action', '/board/writeOK')
		$('#bd_write_form').attr('method', 'post')
		$('#bd_write_form').submit()
	}


	// 기타상담 유효성 검사
	function checkBoardData() {
		let inform = ''
		
		// 제목 유효성 검사
		if(!$('#bd_write_title').val()) {
			inform += '제목을 확인해주세요\n'
		}

		// 작성자 유효성 검사
		if(!$('#bd_write_writer').val()) {
			inform += '작성자를 확인해주세요\n'
		}

		// 비밀번호 유효성 검사
		if(!$('#bd_write_password').val()) {
			inform += '비밀번호를 확인해주세요\n'
		}

		// 내용 유효성 검사
		if(!$('#bd_write_content').val()) {
			inform += '내용을 확인해주세요\n'
		}
		
		// 유효성 실패 메세지
		if(inform) {
			alert(inform)
			return false
		}
		return true
	}
