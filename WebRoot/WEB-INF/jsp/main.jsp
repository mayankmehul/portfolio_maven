<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title></title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<!-- <header> -->
		<div class="left-side">
			<img src=${avatar } alt="Avtar" class="img-responsive">
			<h3 class="name-title">
				ANIL
				<span>CHANDOLA</span>
			</h3>
			<!--Left menu-->
			<nav class="left-menu">
			<ul id="toggle">
				<li>
					<a class="toggler active" id="one"><i class="fa fa-home"></i>HOME</a>
				</li>
				<li>
					<a class="toggler" id="two"><i class="fa fa-user"></i>ABOUT ME</a>
				</li>
				<li>
					<a class="toggler" id="three"><i class="fa fa-pencil-square-o"></i>Resume</a>
				</li>
				<li>
					<a class="toggler" id="four"><i class="fa fa-picture-o"></i>PORTFOLIO</a>
				</li>
				<!--<li><a class="toggler" id="five" ><i class="fa fa-book"></i>BLOG</a></li>-->
				<li>
					<a class="toggler" id="six"><i class="fa fa-phone"></i>Contact
						Me</a>
				</li>
				<li>
					<a class="toggler" id="seven"><i class="fa fa-pencil"></i>Create
						Profile</a>
				</li>
			</ul>
			</nav>
			<!--Left menu-->
			<!--soical icon-->
			<div class="header-bottom">
				<ul class="social-icon">
					<li>
						<a href=""><i class="fa fa-whatsapp fa-1x"></i> </a>
					</li>
					<li>
						<a href=""><i class="fa fa-facebook-square fa-1x"></i> </a>
					</li>
					<li>
						<a href=""><i class="fa fa-linkedin-square fa-1x"></i> </a>
					</li>
					<li>
						<a href=""><i class="fa fa-twitter-square fa-1x"></i> </a>
					</li>
					<li>
						<a href=""><i class="fa fa-google-plus-square fa-1x"></i> </a>
					</li>
				</ul>
			</div>
			<!--soical icon-->
		</div>
		<!-- </header> -->
	</body>
</html>
