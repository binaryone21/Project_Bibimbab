<%@ page pageEncoding="UTF-8" %>
<!-- 기타 상담 수정 -->
<section class="bs_body">

	<!-- 상단 배너 -->
	<article class="bs_banner">
		<img src="resources/img/board/mainBanner.jpg">
	</article>
	
	<!-- 기타 상담 -->
	<article class="bs_info">
		<div class="bs_infoIcon">
			<img src="resources/img/base/infoIcon.png">
		</div>
		<div class="bs_infoText">
			<span>기타상담</span>
		</div>
	</article>
	
	<!-- 상담 업데이트 -->
	<article class="bd_view">
	
		<!-- 상담 상세보기 테이블 -->
		<div>
			<table class="bd_view_table">
				<colgroup>
					<col style="width:100px">
					<col style="width:610px">
					<col style="width:100px">
					<col style="width:150px">
					<col style="width:180px">
					<col style="width:60px">
				</colgroup>
				<tbody>
					<tr class="bd_view_header">
						<th>Title</th>
						<td><input type="text" id="TITLE"/></td>
						<th>Writer</th>
						<td><input type="text" id="REG_ID"/></td>
						<th>Secret NO.</th>
						<td><input type="text" id="SECRET_NO"/></td>
					</tr>
					<tr class="bd_view_content">
						<td></td>
						<td colspan="4" id="content">
							<input type="text" id="" style="width:100%; height:480px;"/>
							<!-- <textarea rows="10"></textarea> -->
						</td>
						<td></td>
					</tr>		 
				</tbody>
			</table>
		</div>
		
		<!-- 상담 업데이트 버튼 -->
		<div class="bd_base_right">
			<span><input type="text" class="bd_write_insertId" id="SECRET_NO"></span>
			<span><button type="button" class="bd_base_btns bs_focusNone" id="boardWriteOK">등록하기</button></span>
		</div>
	</article>
</section>
