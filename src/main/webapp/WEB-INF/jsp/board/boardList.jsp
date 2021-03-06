<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 	uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- BoardList 페이지 JavaScript 설정 -->
<script src="/js/board/boardList.js" defer></script>

<!-- BoardList 페이지 변수 설정 -->
<input type="hidden" id="bdCount" value="${TB_PK_Count}">

<!-- 기타 상담 목록 -->
<section class="bs_body">

	<!-- 상단 배너 -->
	<article class="bs_banner">
		<img src="/img/board/mainBanner.jpg">
	</article>

	<!-- 기타 상담 -->
	<article class="bs_info">
		<div class="bs_infoIcon">
			<img src="/img/base/infoIcon.png">
		</div>
		<div class="bs_infoText">
			<span>기타상담</span>
		</div>
	</article>

	<!-- 상담 리스트 -->
	<article class="bd_list">
	
		<!-- 상담 리스트 검색 -->
		<div class="bd_list_search">
			<span class="bd_list_searchTotal">Total. ${TB_PK_Count}</span>
			<div class="bd_base_right">
				<span>
					<select id="searchType" class="bd_list_searchType bs_focusNone">
						<option value="TITLE">Title</option>
						<option value="CONTENTS">Contents</option>
						<option value="ALL">ALL</option>
					</select>
				</span>
				<span><input type="text" id="searchText" class="bd_list_searchText bs_focusNone"></span>
				<span><button type="button" id="BTN_searchList" class="bd_base_btns bs_focusNone">Search</button></span>
			</div>
		</div>
		
		<!-- 상담 리스트 테이블 -->
		<div class="bd_list_table">
			<table>
				<colgroup>
					<col style="width:60px">
					<col style="width:720px">
					<col style="width:200px">
					<col style="width:130px">
					<col style="width:90px">
				</colgroup>
				<tbody>
					<tr>
						<th>No.</th>
						<th>Title</th>
						<th>Writer</th>
						<th>Date</th>
						<th>Visit</th>
					</tr>
					<c:forEach var="TB_One" items="${TB_List}">
						<tr class="js_bdOne">
							<td class="js_bdOne_TB_PK">${TB_One.TB_PK}</td>
							<td>${TB_One.TB_TITLE}</td>
							<td>${TB_One.TB_REG_ID}</td>
							<td>${TB_One.TB_REG_DATE}</td>
							<td>${TB_One.TB_VISIT}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<!-- 상담 리스트 버튼 -->
		<div class="bd_base_right">
			<span><button type="button" class="bd_base_btns bs_focusNone" id="BTN_goWrite">Write</button></span>
		</div>
		
		<!-- 상담 리스트 네비게이션 -->
		<div class="bd_list_navi">
			<div><</div>
			<div></div>
			<div></div>
			<div></div>
			<div></div>
			<div></div>
			<div>></div>
		</div>
	</article>
</section>