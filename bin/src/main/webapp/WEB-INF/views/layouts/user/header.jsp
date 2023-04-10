<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<header class="">
	<nav class="navbar navbar-expand-lg">
		<div class="container">
			<a class="navbar-brand" href="index.html"><h2>
					Car Rental <em>Website</em>
				</h2></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					
					<c:forEach var="item" items="${menu }">

						<li class="nav-item"><a class="nav-link" href="offers.html">${ item.title }</a></li>


					</c:forEach>
						 
				</ul>
			</div>
		</div>
	</nav>
</header>


