/*** Global Variable **************************************************/

	let searchType 	= getParameterByName("searchType");
	let searchText 	= getParameterByName("searchText");
	let pageNO 		= getParameterByName("pageNO");

	var boardSearch = { };	// 검색 조건 객체


/*** Event ************************************************************/


	// 기타상담 검색하기 버튼 클릭
	$('#BTN_searchList').on('click', searchList);
	
	// 기타상담 클릭
	$('.js_bdOne').click(goView);
	
	// 기타상담 상담하기 버튼 클릭
	$('#BTN_goWrite').on('click', goWrite);

/*** Function *********************************************************/


	// 페이지 로딩시
	$(document).ready(function() {
		// 검색 조건 객체화
		setBoardNavi();
		
	});

	// 네비게이션 설정
	function setBoardNavi() {
		let bdCount		= $('#bdCount').val();
		let pagePer		= 10;
		let naviBtn		= 5;
		let pageTotal 	= Math.ceil(bdCount/pagePer);
		let pageStart 	= Math.floor((pageNO-1)/naviBtn)*naviBtn + 1;
		let pageEnd 	= (pageTotal >= pageStart + naviBtn - 1) ? pageStart + naviBtn - 1 : pageTotal;
		let listNavis 	= document.querySelectorAll('.bd_list_navi > div')
		let url = '/board/list?searchType=' + searchType + '&searchText=' + searchText + '&pageNO='

		for(let i=0; i<=pageEnd-pageStart; i++) {
			listNavis[i+1].innerHTML = pageStart + i
			listNavis[i+1].addEventListener('click', () => { location.href = url + (pageStart + i) })
			if(pageNO == pageStart + i) {
				listNavis[i+1].setAttribute( 'class', 'bd_list_naviAct')
			}
		}
		for(let i=pageEnd-pageStart + 1; i<naviBtn; i++) {
			listNavis[i + 1].style.backgroundColor = '#EEEEEE'
		}

		if(pageStart != 1) {
			listNavis[0].addEventListener('click', () => { location.href = url + (pageStart - naviBtn)})
		}
		if(pageStart + naviBtn -1 == pageEnd) {
			listNavis[6].addEventListener('click', () => { location.href = url + (pageStart + naviBtn)})
		}


		console.log(listNavis)
	}
	
	// 검색조건을 통한 BoardList 조회
	function searchList() {
		location.href = '/board/list?searchType='+$('#searchType').val()+'&searchText='+$('#searchText').val()+'&pageNO=1'
	}
	
	// BoardView 로 이동
	function goView() {
		location.href = '/board/view?TOC_PK="'+$(this).find('.js_bdOne_TOC_PK').text()+'"';
	}
	
	// BoardWrite 로 이동
	function goWrite() {
		location.href = "/board/write";
	}