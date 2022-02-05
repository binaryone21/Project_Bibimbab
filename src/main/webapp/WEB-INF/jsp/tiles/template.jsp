<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/layout.css">
    <link rel="stylesheet" href="resources/css/base.css">
    <link rel="stylesheet" href="resources/css/main.css">
    <link rel="stylesheet" href="resources/css/brand.css">
    <link rel="stylesheet" href="resources/css/menu.css">
    <link rel="stylesheet" href="resources/css/company.css">
    <link rel="stylesheet" href="resources/css/store.css">
    <link rel="stylesheet" href="resources/css/board.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="resources/js/base.js"></script>
    <title>씅's 꼬기가득비빔밥</title>
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <tiles:insertAttribute name="footer"/>
	<script src="resources/js/layout.js"></script>
	<!-- <script src="resources/js/main.js"></script> -->
	<!-- <script src="resources/js/company.js"></script> -->
	<!-- <script src="resources/js/board.js"></script> -->
</body>
</html>