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
	<div class="row">
		
		
		<div class="col-10 m-auto" style ="padding-top: 90px">
			<ul class="breadcrumb">
				<li><a href="./">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Đăng Nhập</li>
			</ul>
			<hr class="soft" />

			<div class="row ">
				<div class="col-10 m-auto">
					<div class="well">
						<h3>Đăng Nhập</h3>
						<h1>${ statusLogin }</h1>
						<br />
						<form:form action="dang-nhap" method ="POST" modelAttribute="user">  
							<div class="control-group">
								<label class="control-label mt-3" for="inputEmail">Tài khoản </label>
								<div class="controls">
									<form:input  class="col-10 form-control" type="email" required="required"  placeholder="email" path="user"  />  
								</div>
							</div>

							<div class="control-group">
								<label class="control-label mt-3" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input  class="col-10 form-control" type="password" required="required"  placeholder="password" path="password"  />  
								</div>
							</div>
							
							<div class="controls mt-3">
								
								<a href="#">Forget password?</a>
							</div>
							<br />
							
							<div class="controls d-flex col-10">
								<a href="<c:url value="./dang-ky"/>" class="btn mr-3  btn-primary">Đăng Ký</a>
								<button style="margin-left: 195px" type="submit" class=" btn btn-success">Đăng Nhập</button>
							</div>
						</form:form>
					</div>
				</div>

			</div>

		</div>
	</div>
</body>
