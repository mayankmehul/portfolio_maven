<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'signUp.jsp' starting page</title>
		<link rel="stylesheet" type="text/css" href="resources/css/htmlfivedesigner.css">
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap-theme.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
		
		<script src="resources/js/jquery-1.12.1.min.js"></script>
		
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<script>
		
		$(document).ready(function(){
		    $("#seven").click(function(){
		        window.open("signMeUp", "_self");
		    });
		});
		/*
			$(document).on("click", "#validateForm1",function() {
				$('#signUpForm').html("");
				var str = $("#signUpForm1").serialize();
				var action="signUpForm1Validation";
				$.ajax( {
					type : "POST",
					data : str,
					url : action,
					async : false,
					success : function(result, arguments, text) {
						$('#signUpForm').html(result);
					}
				});
				
				//$("#signUpForm").load("signUpForm1Validation");
			});
			
			$(document).on("click", "#seven",function(){
				var action="signUpForm-${signUpFormNumber}";
				$.ajax( {
					type : "POST",
					url : action,
					async : false,
					success : function(result, arguments, text) {
						$('#signUpForm').html(result);
					}
				});
			});
			*/
		</script>
	</head>

	<body>
		<div class="mypage">
			<!--left header-->
			<header>
			<div class="left-side">
				<img src=${userBasicInfoDetail.avatarImage } alt="Avtar"
					class="img-responsive">
				<h3 class="name-title">
					<!--	ANIL	-->
					${userBasicInfoDetail.firstName}
					<span> <!-- CHANDOLA --> ${userBasicInfoDetail.lastName} </span>
				</h3>
				<!--Left menu-->
				<nav class="left-menu">
				<ul id="toggle">
				
					<li> <a class="toggler active" id="one"><i class="fa fa-home"></i>HOME</a> </li>
					<li> <a class="toggler" id="two"><i class="fa fa-user"></i>ABOUT ME</a> </li>
					<li> <a class="toggler" id="three"><i class="fa fa-pencil-square-o"></i>Resume</a> </li>
					<li> <a class="toggler" id="four"><i class="fa fa-picture-o"></i>PORTFOLIO</a> </li>
					<!--<li><a class="toggler" id="five" ><i class="fa fa-book"></i>BLOG</a></li>-->
					<li> <a class="toggler" id="six"><i class="fa fa-phone"></i>CONTACT ME</a> </li>
					
					<c:if test="${userBasicInfoDetail.isAdmin == true}">
						<li> <a class="toggler" id="seven"><i class="fa fa-pencil"></i>Create Profile</a> </li>
					</c:if>
					
					<c:if test="${userBasicInfoDetail.isAdmin == false}">
						<li> <a class="toggler" id="eight"><i class="fa fa-pencil"></i>Edit Profile</a> </li>
					</c:if>
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
			</header>
			<!--left header-->
			<!--right side-->
			<div class="main-page">
				<!--home page-->
				<div class="my-right-side" id="one-info">
					<div class="my-content">
						<div class="layout-medium">
							<h4>
								Hi, I am
							</h4>
							<h2>
								${userBasicInfoDetail.userName}
							</h2>
							<div id="typer">
								I am
							</div>
						</div>
					</div>
				</div>
				<!--home page-->
				<!--about page-->
				<section class="about-me" id="two-info">
				<div class="content">
					<div class="layout-medium">
						<!-- page-title -->
						<h1 class="page-title">
							<i class="fa fa-user"></i>about me
						</h1>
						<!-- page-title -->
						<!-- SERVICES -->
						<!-- section-title -->
						<div class="aboutme">
							<p>
								${userBasicInfoDetail.aboutMe}
							</p>
						</div>
						<div class="section-title center">
							<h4>
								<i>What I'm Doing</i>
							</h4>
						</div>
						<!-- section-title -->
						<!-- row -->
						<div class="row">
							<!-- service -->
							<!-- col -->
							<!--<i class="pe-7s-glasses"></i>-->
							<c:forEach var="aboutMeSubMasterDetail" items="${aboutMeSubMasterDetailList}">
							<c:if test="${aboutMeSubMasterDetail.menu == 'Doing'}">
								<div class="col-sm-6 col-md-3">
									<div class="service">
										<h4>
											${aboutMeSubMasterDetail.heading}
										</h4>
										<p>
											${aboutMeSubMasterDetail.description}
										</p>
										<img src=${aboutMeSubMasterDetail.image } alt="image">
									</div>
								</div>
								</c:if>
							</c:forEach>
							<!-- service -->
						</div>
						<!-- row -->
						<!-- SERVICES -->
						<!-- PROCESS -->
						<!-- section-title -->
						<div class="section-title center">
							<h4>
								<i>work procces</i>
							</h4>
						</div>
						<!-- section-title -->
						<!-- row -->
						<div class="row">
							<!-- service -->
							<c:forEach var="aboutMeSubMasterDetail"
								items="${aboutMeSubMasterDetailList}">
								<c:if test="${aboutMeSubMasterDetail.menu == 'WorkProgress'}">
									<div class="col-sm-6 col-md-3">
										<div class="service">
											<h4>
												${aboutMeSubMasterDetail.heading}
											</h4>
											<p>
												${aboutMeSubMasterDetail.description}
											</p>
											<img src=${aboutMeSubMasterDetail.image } alt="image">
										</div>
									</div>
								</c:if>
							</c:forEach>
							<!-- service -->
						</div>
						<!-- row -->
						<!-- PROCESS -->
						<!-- FUN FACT -->
						<!-- section-title -->
						<div class="section-title center">
							<h4>
								<i>fun fact</i>
							</h4>
						</div>
						<div class="row">
						<!-- service -->
							<c:forEach var="aboutMeSubMasterDetail"
								items="${aboutMeSubMasterDetailList}">
								<c:if test="${aboutMeSubMasterDetail.menu == 'FunFact'}">
									<div class="col-sm-6 col-md-3">
										
										<div class="service">
											<h4>
												${aboutMeSubMasterDetail.heading}
											</h4>
											<p>
												${aboutMeSubMasterDetail.description}
											</p>
											<img src=${aboutMeSubMasterDetail.image } alt="image">
										</div>
									</div>
								</c:if>
							</c:forEach>
							<!-- service -->
						</div>
						<!-- section-title -->
						<!-- row -->
						<!-- row -->
						<!-- FUN FACT -->
						<!-- section-title -->
						<!--<div class="section-title center">
                <h4>
                  <i>other pages</i>
                </h4>
              </div>-->
						<!-- section-title -->
						<!--<p class="btn-center">
                <a class="button" href="404.html">404</a>
                <a class="button" href="blog.html">Blog</a>
                <a class="button" href="blog-single.html">Blog Single</a>
                <a class="button" href="form-elements.html">Form Elements</a>
                <a class="button" href="grid.html">Grid</a>
                <a class="button" href="shortcodes.html">Shortcodes</a>
                <a class="button" href="typography.html">Typography</a>
              </p>-->
					</div>
				</div>
				</section>
				<!--about page-->
				<!--Resume page-->
				<section class="resume" id="three-info">
				<div class="content">
					<!-- .layout-medium -->
					<div class="layout-medium">
						<!-- page-title -->
						<h1 class="page-title">
							<i class="fa fa-pencil-square-o"></i>resume
						</h1>
						<!-- page-title -->
						<!-- row -->
						<div class="row">
							<!-- col -->
							<div class="col-sm-7">
								<div class="event">
									<h2>
										WORK HISTORY
									</h2>
									<p>
										<i class="fa fa-bookmark-o"></i>
										<!--<img src="images/site/icon-03.png" alt="image"/>-->
									</p>
								</div>
								<c:forEach var="workExperienceDetail"
									items="${workExperienceDetailList}">
									<div class="event">
										<h3>
											${workExperienceDetail.joiningDate}
										</h3>
										<h4>
											${workExperienceDetail.designation}
										</h4>
										<h5>
											${workExperienceDetail.companyDetail}
										</h5>
										<p>
											${workExperienceDetail.description}
										</p>
									</div>
								</c:forEach>
								<div class="event">
									<h2>
										EDUCATION
									</h2>
									<p>
										<i class="fa fa-graduation-cap"></i>
										<!--<img src="images/site/icon-03.png" alt="image"/>-->
									</p>
								</div>
								<c:forEach var="educationDetail" items="${educationDetailList}">
									<div class="event">
										<h3>
											${educationDetail.passingYear}
										</h3>
										<h4>
											${educationDetail.domain}
										</h4>
										<h5>
											${educationDetail.schoolName}
										</h5>
										<p>
											${educationDetail.description}
										</p>
									</div>
								</c:forEach>
								<p>
									<a href="http://www.webcrayons.net/resume.doc" class="button"><i
										class="fa fa-download"></i></i>&nbsp;Download CV</a>
								</p>
							</div>
							<!-- col -->
							<!-- col -->
							<div class="col-sm-5">
								<!-- section-title -->
								<div class="section-title center">
									<h2>
										<i>coding skills</i>
									</h2>
								</div>
								<!-- section-title -->
								<!-- .skill-unit -->


								<c:forEach var="skillDetail" items="${skillDetailList}">
									<div class="skill-unit">
										<h4>
											${skillDetail.skillCategory}
										</h4>
										<div class="bar" data-percent=${skillDetail.marks}%>
											<div class="progress" style="width: ${skillDetail.marks}%;">
												<span>${skillDetail.marks}</span>
											</div>
										</div>
									</div>
								</c:forEach>

								<!-- .skill-unit -->
							</div>
							<!-- col -->
						</div>
						<!-- row -->
					</div>
					<!-- .layout-medium -->
				</div>
				</section>
				<!--resume page-->
				<!--portfolio page-->
				<section class="portfolio" id="four-info">

				</section>
				<!--portfolio page-->
				<!--blog page-->
				<section class="blog" id="five-info">

				</section>
				<!--blog page-->
				<!--contact page-->
				<section class="contact" id="six-info">
				<div class="content">
					<div class="layout-medium-1">
						<div class="col-md-6">
							<div class="cv-page-content">
								<h1 class="page-title">
									<i class="fa fa-user"></i>contact
								</h1>
								<ul class="cv-table">
									<li>
										<div class="cv-table-left">
											<i class="cv-icon fa fa-phone-square"></i>Phone
										</div>
										<div class="cv-table-right">
											${userBasicInfoDetail.mobileNumber}
										</div>
									</li>
									<li>
										<div class="cv-table-left">
											<i class="cv-icon fa fa-envelope"></i>E-mail
										</div>
										<div class="cv-table-right">
											${userBasicInfoDetail.email}
										</div>
									</li>
									<li>
										<div class="cv-table-left">
											<i class="cv-icon fa fa-map"></i>Address
										</div>
										<div class="cv-table-right">
											${userBasicInfoDetail.address}
										</div>
									</li>
								</ul>
								<p>
									Quibusdam noster aut laborum despicationes. Malis appellat o
									enim tamen. O amet quibusdam. Magna occaecat ex coniunctione,
									quis in mentitum, multos excepteur offendit, id a dolore illum.
								</p>
								<hr>
								<h2 class="border">
									Get in Touch
								</h2>
								<div class="contact-form">
									<!--form-->
									<form>
										<!--input field -->
										<div class="form-div">
											<label>
												Your Name (required)
											</label>
											<span class="wpcf7-form-control-wrap your-name"> <input
													type="text" name="your-name" value="" size="40"
													class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required"
													aria-required="true" aria-invalid="false"> </span>
										</div>
										<!--input field -->
										<!--input field -->
										<div class="form-div">
											<label>
												Your Email (required)
											</label>
											<span class="wpcf7-form-control-wrap your-name"> <input
													type="text" name="your-name" value="" size="40"
													class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required"
													aria-required="true" aria-invalid="false"> </span>
										</div>
										<!--input field -->
										<!--input field -->
										<div class="form-div">
											<label>
												Subject
											</label>
											<span class="wpcf7-form-control-wrap your-name"> <input
													type="text" name="your-name" value="" size="40"
													class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required"
													aria-required="true" aria-invalid="false"> </span>
										</div>
										<!--input field -->
										<!--input field -->
										<div class="form-div">
											<label>
												Contact No.
											</label>
											<span class="wpcf7-form-control-wrap your-name"> <input
													type="text" name="your-name" value="" size="40"
													class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required"
													aria-required="true" aria-invalid="false"> </span>
										</div>
										<!--input field -->
										<!--input field -->
										<div class="form-div">
											<label>
												Your Message
											</label>
											<span class="wpcf7-form-control-wrap your-name"> <textarea
													name="your-message" cols="40" rows="10"
													class="wpcf7-form-control wpcf7-textarea"
													aria-invalid="false"></textarea> </span>
										</div>
										<!--input field -->
										<!--input field -->
										<div class="form-div">
											<input type="submit" value="Send">
										</div>
										<!--input field -->
									</form>
									<!--form-->
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div
								style="overflow: hidden; width: 500px; height: 600px; resize: none; max-width: 100%;">
								<div id="my-map-display"
									style="height: 100%; width: 100%; max-width: 100%;">
									<iframe style="height: 100%; width: 100%; border: 0;"
										frameborder="0"
										src="https://www.google.com/maps/embed/v1/place?q=${userBasicInfoDetail.address} }&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU">
										<!-- src="https://www.google.com/maps/embed/v1/place?q=DLF+Phase+2,+DLF+Cyber+City,+Gurgaon,+Haryana,+India&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU"> -->
									</iframe>
								</div>
							</div>
						</div>
					</div>
				</div>
				</section>
				<!--contact page-->
				<!--blog page-->
				<section class="create-profile" id="seven-info">
				<div class="content">
					<!-- .layout-medium -->
					<div class="layout-medium">
						<!-- page-title -->
						<h1 class="page-title">
							<i class="fa fa-pencil"></i>create profile
						</h1>
						<!--Signup
						<c:if test="${isRegistrationSuccessful == true}">
							<div>
								<h3>
									You have successfully Registered. Acess ID : ${acessId} }
								</h3>
							</div>
						</c:if>
						

						<!--Signup-->
						<!-- page-title -->
						</div>
					</div>
					</section>
					<!--blog page-->
				</div>
				<!--right side-->
			</div>
			<script src="resources/js/custem.js" type="text/javascript"></script>
			<script type="text/javascript">
	var tagLine = "${userBasicInfoDetail.tagLine}";
	(function($) {
		$.fn.typer = function(text, options) {
			options = $.extend( {}, {
				char : '',
				delay : 2000,
				duration : 600,
				endless : true,
				onType : $.noop,
				afterAll : $.noop,
				afterPhrase : $.noop
			}, options || text);

			text = $.isPlainObject(text) ? options.text : text;
			text = $.isArray(text) ? text : text.split(" ");

			return this.each(function() {
				var elem = $(this), isVal = {
					input : 1,
					textarea : 1
				}[this.tagName.toLowerCase()], isTag = false, timer, c = 0;

				(function typetext(i) {
					var e = ( {
						string : 1,
						number : 1
					}[typeof text] ? text : text[i]) + '', char = e.substr(c++,
							1);

					if (char === '<') {
						isTag = true;
					}
					if (char === '>') {
						isTag = false;
					}
					elem[isVal ? "val" : "html"](e.substr(0, c)
							+ ($.isFunction(options.char) ? options.char()
									: options.char || ' '));
					if (c <= e.length) {
						if (isTag) {
							typetext(i);
						} else {
							timer = setTimeout(typetext, options.duration / 10,
									i);
						}
						options.onType(timer);
					} else {
						c = 0;
						i++;

						if (i === text.length && !options.endless) {
							return;
						} else if (i === text.length) {
							i = 0;
						}
						timer = setTimeout(typetext, options.delay, i);
						if (i === text.length - 1)
							options.afterAll(timer);
						options.afterPhrase(timer);
					}
				})(0);
			});
		};
		///menu js///
		//<![CDATA[
		$(window).load(function() {
		// Optional code to hide all divs
			$("section").hide();
			// Show chosen div, and hide all others
			$(".toggler").click(function() {
				$("#" + $(this).attr("id") + "-info").show().siblings('section').hide();
			});
		});//]]> 
		///menu js///

	}(jQuery));

	var win = $(window), foo = $('#typer');
	foo.typer( [ tagLine ]);
	// unneeded...
	win.resize(
			function() {
				var fontSize = Math.max(Math.min(win.width() / (1 * 10),
						parseFloat(Number.POSITIVE_INFINITY)),
						parseFloat(Number.NEGATIVE_INFINITY));
				foo.css( {
					fontSize : fontSize * .2 + 'px'
				});
			}).resize();
</script>
		
	</body>
</html>
