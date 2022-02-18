/*** Global Variable **************************************************/


	let state = getParameterByName("state")	// 현재 상태를 나타내는 변수


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
		if(!checkPassWord()) { return }		// 비밀번호 체크하기
		location.href = "/board/update?TB_PK=" + $('#TB_PK').val()
	}


	// 기타상담 삭제하기
	function boardDelete() {
		if(!checkPassWord()) { return }		// 비밀번호 체크하기
		location.href = "/board/delete?TB_PK=" + $('#TB_PK').val()
	}


	// 비밀번호 체크하기
	function checkPassWord() {
		if($('#TB_PASSWD').val() === $('#bd_view_passwd').val()) {
			return true
		} else {
			alert("비밀번호를 다시 확인해주세요")
			return false
		}
	}