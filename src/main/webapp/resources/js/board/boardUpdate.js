/*** Global Variable **************************************************/

	let boardSearch = { };	// 검색 조건 객체
	let boardNo = getParameterByName("SEQNO")


/*** Event ************************************************************/

	// 기타상담 수정하기
	$('#boardUpdateOK').on('click', () => { location.href = "/BoardUpdateOk?SEQNO=" + boardNo })
	

/*** Function *********************************************************/
	
	
	// 페이지 로딩시
	$(document).ready(function() {
		// 검색 조건 객체화
		setBoardSearch();
	});
	
	// 검색 조건 객체 선언
	function setBoardSearch() {
		
		let searchType 	= getParameterByName("searchType");
		let searchText 	= getParameterByName("searchText");
		let bdCount		= $('#bdCount').val();
		let pagePer		= 10;
		let pageNO 		= getParameterByName("pageNO");
		let pageTotal 	= Math.ceil(bdCount/pagePer);
		let pageStart 	= ((pageNO-1)/pagePer)*10 + 1;
		let pageEnd 		= (pageTotal >= pageStart + 9) ? pageStart + 9 : pageTotal;
	
		boardSearch.searchType 	= searchType;	// 검색 조건
		boardSearch.searchText 	= searchText; 	// 검색 내용
		boardSearch.bdCount 	= bdCount;		// 검색 조건에 해당하는 게시물 수
		boardSearch.pagePer		= pagePer;		// 현재 페이지
		boardSearch.pageNO		= pageNO; 		// 검색 조건에 해당하는 페이지 수
		boardSearch.pageTotal	= pageTotal; 	// 페이지당 보여줄 게시물
		boardSearch.pageStart	= pageStart; 	// 페이지 네비게이션 첫 숫자
		boardSearch.pageEnd 	= pageEnd; 		// 페이지 네비게이션 마지막 숫자
		
		console.log("검색조건 객체생성 boardSearch : ", boardSearch);
	}
	