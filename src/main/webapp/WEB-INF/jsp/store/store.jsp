<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 	uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 매장 안내 -->
<section class="bs_body">
	
	<!-- 상단 배너 -->
	<article class="bs_banner">
		<img src="resources/img/store/mainBanner.jpg">
	</article>
	
	<!-- 매장 안내 -->
	<article class="bs_info">
		<div class="bs_infoIcon">
			<img src="resources/img/base/infoIcon.png">
		</div>
		<div class="bs_infoText">
			<span>매장안내</span>
		</div>
	</article>
	
	<article class="st_store">
		<div>
			"씅's 꼬기가득비빔밥"<br>본사직영점 운영, 배달앱 고객리뷰로 이미 각 지역에서 검증된 브랜드 입니다.<br>현재 운영중인 가맹점의 배달앱에서<br>리뷰, 콜수, 찜수를 확인해보세요!
		</div>
		<img src="resources/img/store/map.jpg">
	</article>
	
	<!-- 배달의 민족  -->
	<article class="st_baemin">
		<div class="st_baeminIcon">
			<img src="resources/img/store/baemin.png"><br>
			(배달앱 바로가기는 모바일에서만 가능합니다)
		</div>
		<div class="st_baeminStore">
			<c:forEach var="stOneBM" items="${stListBM}">
				<div class="st_baeminItem">
					<img src="resources/img/store/baeminIcon.png">
					<span>${stOneBM.AREA}</span>
				</div>
			</c:forEach>
		</div>
	</article>

	<!-- 요기요 -->
	<article class="st_yogiyo">
		<div class="st_yogiyoIcon">
			<img src="resources/img/store/yogiyo.png"><br>
			(배달앱 바로가기는 모바일에서만 가능합니다)
		</div>
		
		<div class="st_yogiyoStore">
		<c:forEach var="stOneYGY" items="${stListYGY}">
			<div class="st_yogiyoItem">
				<img src="resources/img/store/yogiyoIcon.png">
				<span>${stOneYGY.AREA}</span>
			</div>
		</c:forEach>
		</div>
	</article>
</section>