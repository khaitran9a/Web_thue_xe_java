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
					<h1 class="m-0">Menu</h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
						<li class="breadcrumb-item active">Menu</li>
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
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h3 class="card-title">Danh sách Menu</h3>
					
				</div>
				<div class="card-header">					
					<a href="<c:url value ="/quan-tri/add-menu"/>" class="btn btn-success btn-sm">Thêm Menu</a>
				</div>
				<!-- ./card-header -->
				<div class="card-body">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>Số thứ tự</th>
								<th>Tên menu</th>
								<th>Url</th>
								<th>Chức năng</th>
							</tr>
						</thead>
						<tbody>
						
							<c:forEach var="item" items="${ menus }"
								varStatus="loop" >
								
								<tr data-widget="expandable-table" aria-expanded="false">
									<td>${loop.index + 1 }</td>
									<td>${ item.title }</td>
									<td>${ item.alias }</td>
									
									
									<td><a href="<c:url value = "/edit-menu/${ item.menuId }"/>" class="btn btn-primary btn-sm">Sửa</a> <a
										href="<c:url value = "/DeleteMenu/${ item.menuId }"/>" class="btn btn-danger btn-sm">Xóa</a></td>
								</tr>

							</c:forEach>

						</tbody>	
					</table>
				</div>
				<!-- /.card-body -->
			</div>
			<!-- /.card -->
		</div>
	</div>
</body>