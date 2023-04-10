<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="assets/images/favicon.ico">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&display=swap"
	rel="stylesheet">

<title>Web Thue Xe</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="assets/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">

<!-- Additional CSS Files -->
<link rel="stylesheet" href="<c:url value="assets/css/fontawesome.css" />">
<link rel="stylesheet" href="<c:url value="assets/css/style.css" />">
<link rel="stylesheet" href="<c:url value="assets/css/owl.css" />">

</head>

<body>

	<!-- ***** Preloader Start ***** -->
	<div id="preloader">
		<div class="jumper">
			<div></div>
			<div></div>
			<div></div>
		</div>
	</div>
	<!-- ***** Preloader End ***** -->

	<!-- Header -->
	
	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>
		<!-- /.navbar -->
	
		<decorator:body />


		<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>


	

	<!-- Bootstrap core JavaScript -->
	<script src=" <c:url value="assets/vendor/jquery/jquery.min.js" /> "></script>
	<script src="<c:url value="assets/vendor/bootstrap/js/bootstrap.bundle.min.js" /> "></script>


	<!-- Additional Scripts -->
	<script src="<c:url value="assets/js/custom.js" /> "></script>
	<script src="<c:url value="assets/js/owl.js" />"></script>
</body>
</html>

