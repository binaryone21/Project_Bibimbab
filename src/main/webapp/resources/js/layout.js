/*** Global Variable **************************************************/





/*** Event ************************************************************/


	// 메인 페이지로 이동
	$('#mainLog').on('click', () => { location.href = "/" })
	
	// 브랜드 스토리로 이동
	$('#naviBrand').on('click', () => { location.href = "/brand" })
	
	// 메뉴 안내로 이동
	$('#naviMenu').on('click', () => { location.href = "/menu" })
	
	// 창업 안내로 이동
	$('#naviCompany').on('click', () => { location.href = "/company" })
	
	// 매장 안내로 이동
	$('#naviStore').on('click', () => { location.href = "/store" })
	
	// 기타 상담으로 이동
	$('#naviBoard').on('click', () => {	location.href = '/board/list?pageNO=1' })


/*** Function *********************************************************/
