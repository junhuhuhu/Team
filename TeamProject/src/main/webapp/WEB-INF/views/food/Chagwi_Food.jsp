<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>차귀도(4)</title>
<meta charset="utf-8" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css" />
</head>
<body class="no-sidebar is-preload">


	<!-- Header -->
	<div id="header">

		<!-- Inner -->
		<div class="inner">
			<header>
				<h1>
					<a href= "../food/Food_Map" id="logo">차 귀 도</a>
				</h1>
			</header>
		</div>

		<%@include file="../include/nav.jsp"%>

		<!-- Main -->
		<div class="wrapper style1">
			<div class="container">
				<article id="main" class="special">
					<div class="col-8 col-12-mobile" id = "content">
						<section>
							<hr size="50" style="top: 30px; margin-bottom: 30px">
							<c:choose>
								<c:when test="${sessionScope.user_admin == 1}">
									<button type="button" style="margin-top:30px; margin-left: 1200px" class = 'btn btn-default' onclick="location.href='/admin/adRegister'">게시물 등록</button>
								</c:when>
							</c:choose>
							<div class="row gtr-50" style="align-items: center">
								<c:forEach var="admin" items="${fa_list }">
								<c:choose>
								<c:when test="${admin.lnum == 4 && admin.fanum == 2}">
								<div class="col-4">
									<a  class="image fit"><img src="${admin.ilink }"
										alt="" /></a>
								</div>
								<div class="col-8">
									<h4><a href="${admin.link }"><strong>${admin.name }</strong></a></h4>
									<p align="center"><a href="${admin.link }">${admin.addr }</a></p>
								</div>
								</c:when>
								</c:choose>
								</c:forEach>
								
							<hr size="50" style="top: 10px; margin: 70px">
						</section>
					</div>
				</article>
			</div>

		</div>
	</div>

	<%@include file="../include/footer.jsp"%>