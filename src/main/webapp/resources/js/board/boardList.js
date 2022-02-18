/*** Global Variable **************************************************/


	let searchType 	= getParameterByName("searchType")	// 검색 조건
	let searchText 	= getParameterByName("searchText")	// 검색 단어
	let pageNO 		= getParameterByName("pageNO")		// 페이지 번호
	let pagePer		= 10	// 한 페이지당 보여줄 게시물 수
	let naviBtn		= 5		// 하단에 보여줄 네비게이션 버튼 수


/*** Event ************************************************************/


	// 기타상담 검색하기 버튼 클릭
	$('#BTN_searchList').on('click', searchList)
	
	// 기타상담 클릭
	$('.js_bdOne').click(goView)
	
	// 기타상담 상담하기 버튼 클릭
	$('#BTN_goWrite').on('click', () => { location.href = "/board/write" })


/*** Function *********************************************************/


	// 페이지 로딩시
	$(document).ready(function() {
		// 검색 조건 객체화
		setBoardNavi()
	})


	// 네비게이션 설정
	function setBoardNavi() {
		let bdCount		= $('#bdCount').val()
		let pageTotal 	= Math.ceil(bdCount/pagePer)
		let pageStart 	= Math.floor((pageNO-1)/naviBtn)*naviBtn + 1
		let pageEnd 	= Math.min(pageTotal, pageStart + naviBtn - 1)

		let listNavis 	= document.querySelectorAll('.bd_list_navi > div')
		let url = '/board/list?searchType=' + searchType + '&searchText=' + searchText + '&pageNO='

		// 게시물이 있는 페이지
		for(let i=0; i<=pageEnd-pageStart; i++) {
			listNavis[i+1].innerHTML = pageStart + i
			listNavis[i+1].addEventListener('click', () => { location.href = url + (pageStart + i) })
			
			// 현재 페이지
			if(pageNO == pageStart + i) {
				listNavis[i+1].setAttribute( 'class', 'bd_list_naviAct')
			}
		}
		
		// 게시물이 없는 페이지
		for(let i=pageEnd-pageStart+1; i<naviBtn; i++) {
			listNavis[i + 1].style.backgroundColor = '#EEEEEE'
		}

		// < 표시
		if(pageStart != 1) {
			listNavis[0].addEventListener('click', () => { location.href = url + (pageStart - naviBtn) })
		}
		
		// > 표시
		if(pageEnd == pageStart + naviBtn - 1) {
			listNavis[6].addEventListener('click', () => { location.href = url + (pageStart + naviBtn) })
		}
	}


	// 검색조건을 통한 BoardList 조회
	function searchList() {
		location.href = '/board/list?searchType='+$('#searchType').val()+'&searchText='+$('#searchText').val()+'&pageNO=1'
	}


	// BoardView 로 이동
	function goView() {
		location.href = '/board/view?TB_PK="'+$(this).find('.js_bdOne_TB_PK').text()+'"'
	}