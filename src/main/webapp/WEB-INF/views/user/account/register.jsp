<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<title>Đăng ký</title>

</head>
<body>
	<!-- 
Body Section 
-->
	

		</div>
		<div class="col-10 m-auto" style="padding-top: 90px">
			<ul class="breadcrumb">
				<li><a href="./">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Đăng ký</li>
			</ul>
			<hr class="soft" />

			<div class="row ">
				<div class="col-10" style="transform: translateX(25%);">
					<div class="well">
						<h3>Đăng ký tài khoản</h3>
						
						<br />
						<form:form action="dang-ky" method ="POST" modelAttribute="user">  
							<div class="control-group">
								<label class="control-label" for="inputEmail">E-mail </label>
								<div class="controls">
									<form:input class="col-10 form-control" type="email" required="required"   placeholder="email" path="user" />  
									<p class="text-error ml-3"> ${ status }</p>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input  class="col-10 form-control" type="text" required="required" placeholder="password" path="password"  />  
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputEmail">Họ và tên</label>
								<div class="controls">
									<form:input  class="col-10 form-control" type="text" required="required" placeholder="name" path="display_name"  />  
								</div>
							</div>

							<div class="control-group">
								<label class="control-label mt-3" for="inputEmail">Địa chỉ</label>
								<div class="controls">
									<form:input  class="col-10 form-control" type="text" placeholder="address" path="address"  />  
								</div>
							</div>
							<div class="controls mt-3">
								<a href="<c:url value="./dang-nhap"/>" class="btn  btn-primary">Đăng Nhập</a>
								<button type="submit" style="margin-left: 195px" class=" btn btn-success">Đăng Ký</button>
							</div>
						</form:form>
					</div>
				</div>

			</div>

		</div>
	</div>
</body>
