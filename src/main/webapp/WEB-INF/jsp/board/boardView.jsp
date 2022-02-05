<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 	uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- BoardView 페이지 JavaScript 설정 -->
<script src="/js/board/boardView.js" defer></script>

<!-- 기타 상담 상세 -->
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
	
	<!-- 상담 상세보기 -->
	<article class="bd_view">
		
		<!-- 상담 상세보기 테이블 -->		
		<div>
			<table class="bd_view_table">
				<colgroup>
					<col style="width:100px">
					<col style="width:470px">
					<col style="width:100px">
					<col style="width:150px">
					<col style="width:100px">
					<col style="width:120px">
					<col style="width:100px">
					<col style="width:60px">
				</colgroup>
				<tbody>
					<tr class="bd_view_header">
						<th>Title</th>
						<td>${bdOne.TITLE}</td>
						<th>Writer</th>
						<td>${bdOne.REG_ID}</td>
						<th>Date</th>
						<td>${bdOne.REG_DATE}</td>
						<th>Visit</th>
						<td>${bdOne.VISIT}</td>
					</tr>
					<tr class="bd_view_content">
						<td></td>
						<td colspan="6" id="content">${bdOne.CONTENTS}</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
		
		<!-- 상담 상세보기 버튼 -->
		<div class="bd_base_right">
			<span><button type="button" class="bd_base_btns bs_focusNone" id="boardUpdate">수정하기</button></span>
			<span><button type="button" class="bd_base_btns bs_focusNone" id="boardDelete">삭제하기</button></span>
		</div>
	</article>
</section>

<!-- Board View 페이지 js 설정 -->
<script src="/js/board/boardView.js" defer></script>