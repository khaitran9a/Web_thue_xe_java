<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Danh sách Menu</title>
<style type="text/css">
.pagination {
	display: flex;
	justify-content: center;
}
.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}
.pagination a.active {
	background-color: #F89406;
	color: white;
	border: 1px solid #F89406;
}
.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>

</head>

<body>

	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">Thêm Menu</h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
						<li class="breadcrumb-item active">Thêm Menu</li>
					</ol>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /.content-header -->
	<div class="row">
	<spring:url value="/save" var="saveURL" />
		<form:form action="saveURL" method="POST"
			modelAttribute="menu" class="col-md-10 card m-auto">
			

			<div
				class="form-group d-flex justify-content-between align-items-start mt-3 col-10 m-auto"
				style="margin-top: 15px !important">
				<div class="control-group col-md-4">
					<label class="control-label"il">Tên Menu</label>
					<div class="controls">
						<form:input class="col-md-10 form-control" type="text" value=""
							required="required" placeholder="nhập tên" path="title" />
					</div>
				</div>
				
			</div>
			<div
				class="form-group d-flex justify-content-between align-items-start mt-3 col-10 m-auto"
				style="margin-top: 15px !important">
				<div class="control-group col-md-12">
					<label class="control-label" for="inputTitle">Đường dẫn</label>
					<div class="controls">
						<form:input class="col-md-11 form-control" type="text"
							placeholder="Nhập đường dẫn " path="alias" />
					</div>
				</div>
				<div style="diplay: none;" class="control-group col-md-7"></div>
			</div>
			
			
			<div
				class="form-group d-flex justify-content-between align-items-start mt-3 col-10 m-auto"
				style="margin-top: 15px !important">
				<div class="control-group col-md-4">
					<label class="control-label"il">Vị trí</label>
					<div class="controls">
						<form:input class="col-md-10 form-control" type="number" value="" min = "0"
							required="required" placeholder="nhập vị trí" path="position" />
					</div>
				</div>
				
			</div>
			
			
			<div
				class="form-group d-flex justify-content-between align-items-start mt-3 col-10 m-auto"
				style="margin-top: 15px !important">
				<div class="control-group col-md-4">
					<label class="control-label"il">Is active</label>
					<div class="controls">
						<form:checkbox class="col-md-10 form-control" value=""
							required="required"  path="isActive" />
					</div>
				</div>
				
			</div>
			
			<div
				class="form-group d-flex justify-content-end align-items-start mt-3 col-10 m-auto"
				style="margin-top: 15px !important; margin-bottom: 20px !important; margin-right: 155px !important">
				<a href="<c:url value="/quan-tri/danh-sach-menu"/>"
					class="btn  btn-primary">Quay lại</a>


				<button type="submit" style="margin-left: 15px"
					class=" btn btn-success">Thêm mới</button>

			</div>
		</form:form>
		<!-- /.card -->
	</div>

</body>