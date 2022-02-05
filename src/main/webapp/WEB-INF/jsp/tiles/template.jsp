<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>씅's 꼬기가득비빔밥</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/layout.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/brand.css">
    <link rel="stylesheet" href="/css/menu.css">
    <link rel="stylesheet" href="/css/company.css">
    <link rel="stylesheet" href="/css/store.css">
    <link rel="stylesheet" href="/css/board.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="/js/base.js" defer></script>
	<script src="/js/layout.js" defer></script>
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <tiles:insertAttribute name="footer"/>
</body>
</html>