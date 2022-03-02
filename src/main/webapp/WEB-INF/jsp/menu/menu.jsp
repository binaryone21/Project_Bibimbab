<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 	uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 메뉴 안내 -->
<section class="bs_body">

	<!-- 상단 배너 -->
	<article class="bs_banner">
		<img src="/img/menu/mainBanner.jpg">
	</article>
	
	<!-- 메뉴 안내 -->
	<article class="bs_info">
		<div class="bs_infoIcon">
			<img src="/img/base/infoIcon.png">
		</div>
		<div class="bs_infoText">
			<span>메뉴안내</span>
		</div>
	</article>

	<!-- 레시피 -->	
	<article class="mn_recipe">
		<img src="/img/menu/recipe.png">
		<div class="mn_recipeText">
			<b><span style="color:#BA131A">특별한 레시피</span>로 만든</b><br>맛있는 밥상, 꼬기비빔밥 전문점입니다.
		</div>
	</article>
	
	<!-- 나중에라도 DB에 저장해서 menu 이름과 이미지 주소 불러오게 해보자 -->
	<!-- 비빔밥 -->
	<article class="mn_menuList">
		<div class="mn_menuListTitle">비빔밥</div>
		<div class="mn_menuLists">
			<c:forEach var="TM_One_KIND_1" items="${TM_List_KIND_1}">
				<div class="mn_menuItem">
					<div><img src="${TM_One_KIND_1.TM_IMG}"></div>
					<div>${TM_One_KIND_1.TM_NAME}</div>
				</div>
			</c:forEach>
		</div>
	</article>
	
	<!-- 정식 도시락 -->
	<article class="mn_menuList">
		<div class="mn_menuListTitle">정식 도시락</div>
		<div class="mn_menuLists">
			<c:forEach var="TM_One_KIND_2" items="${TM_List_KIND_2}">
				<div class="mn_menuItem">
					<div><img src="${TM_One_KIND_2.TM_IMG}"></div>
					<div>${TM_One_KIND_2.TM_NAME}</div>
				</div>
			</c:forEach>
		</div>
	</article>
	
	<!-- 덮밥 도시락 -->
	<article class="mn_menuList">
		<div class="mn_menuListTitle">덮밥 도시락</div>
		<div class="mn_menuLists">
			<c:forEach var="TM_One_KIND_3" items="${TM_List_KIND_3}">
				<div class="mn_menuItem">
					<div><img src="${TM_One_KIND_3.TM_IMG}"></div>
					<div>${TM_One_KIND_3.TM_NAME}</div>
				</div>
			</c:forEach>				
		</div>
	</article>
	
	<!-- 돈카츠 도시락 -->
	<article class="mn_menuList">
		<div class="mn_menuListTitle">돈카츠 도시락</div>
		<div class="mn_menuLists">
			<c:forEach var="TM_One_KIND_4" items="${TM_List_KIND_4}">
				<div class="mn_menuItem">
					<div><img src="${TM_One_KIND_4.TM_IMG}"></div>
					<div>${TM_One_KIND_4.TM_NAME}</div>
				</div>
			</c:forEach>	
		</div>
	</article>
</section>