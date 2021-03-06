<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 	uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- BoardUpdate 페이지 JavaScript 설정 -->
<script src="/js/board/boardUpdate.js" defer></script>

<!-- 기타 상담 수정 -->
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
	
	<!-- 상담 업데이트 -->
	<article class="bd_view">
	
		<!-- 상담 상세보기 테이블 -->
		<form id="bd_update_form">
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
						<td><input type="text" name="TB_TITLE" value="${TB_One.TB_TITLE}" style="width:450px"></td>
						<th>Writer</th>
						<td>${TB_One.TB_REG_ID}</td>
						<th>Date</th>
						<td>${TB_One.TB_REG_DATE}</td>
						<th>Visit</th>
						<td>${TB_One.TB_VISIT}</td>
					</tr>
					<tr class="bd_view_content">
						<td></td>
						<td colspan="6">
							<textarea name="TB_CONTENTS" cols="136" rows="19">${TB_One.TB_CONTENTS}</textarea>
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
			<input type="hidden" name="TB_PK" value=${TB_One.TB_PK}>
		</form>
		
		<!-- 상담 업데이트 버튼 -->
		<div class="bd_base_right">
			<span><button type="button" class="bd_base_btns bs_focusNone" id="updateOkBtn">수정완료</button></span>
		</div>
	</article>
</section>
