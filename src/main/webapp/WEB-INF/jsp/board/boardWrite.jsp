<%@ page pageEncoding="UTF-8" %>

<!-- BoardWrite 페이지 JavaScript 설정 -->
<script src="/js/board/boardWrite.js" defer></script>

<!-- 기타 상담 추가 -->
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
		<form id="bd_write_form">
			<table class="bd_view_table">
				<colgroup>
					<col style="width:100px">
					<col style="width:470px">
					<col style="width:100px">
					<col style="width:150px">
					<col style="width:240px">
					<col style="width:80px">
					<col style="width:60px">
				</colgroup>
				<tbody>
					<tr class="bd_view_header">
						<th>Title</th>
						<td><input type="text" name="TB_TITLE" id="bd_write_title" style="width:450px"></td>
						<th>Writer</th>
						<td><input type="text" name="TB_REG_ID" id="bd_write_writer" style="width:130px"></td>
						<th>Pass Word (4자리)</th>
						<td><input type="text" name="TB_PASSWD" id="bd_write_password" style="width:60px; text-align:center" placeholder="0000"></td>
						<td></td>
					</tr>
					<tr class="bd_view_content">
						<td></td>
						<td colspan="5">
							<textarea name="TB_CONTENTS" id="bd_write_content"></textarea>
						</td>
						<td></td>
					</tr>		 
				</tbody>
			</table>
		</form>
		
		<!-- 상담 업데이트 버튼 -->
		<div class="bd_base_right">
			<span><input type="text" class="bd_write_insertId" id="bd_write_passwd"></span>
			<span><button type="button" class="bd_base_btns bs_focusNone" id="writeOkBtn">등록하기</button></span>
		</div>
	</article>
</section>
