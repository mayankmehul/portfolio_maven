<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Sign Up</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="resources/css/htmlfivedesigner.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
	
	<link rel="stylesheet" type="text/css"href="resources/css/datepicker.css">
	<script src="resources/js/bootstrap-datepicker.js"></script>
	<script src="resources/js/jquery-1.12.1.min.js"></script>
	<script>
		$(document).ready(function(){
			$(window).load(function() {
				$("#${displayForm}-body").show().siblings('section').hide();
				//$("#form1-body").show().siblings('section').hide();
			});
			$("#addDoingRow").click(function() {
				$("#doing").append($("#doingRow").clone());
			});
			$("#addWorkProcessRow").click(function() {
				$("#workProcess").append($("#workProcessRow").clone());
			});
			$("#addFunFactRow").click(function() {
				$("#funFact").append($("#funFactRow").clone());
			});
			$("#addSchoolInfoRow").click(function() {
				$("#schoolInfo").append($("#schoolInfoRow").clone());
			});
			$("#addCompanyInfoRow").click(function() {
				$("#companyInfo").append($("#companyInfoRow").clone());
			});
			$(document).on("click", ".addSillRow", function() {
				$("#skill").append($("#skillRow").clone());
			});
			$(".dp").focus(function() {
				$(".dp").datepicker();
			});
		});
		</script>
	
  </head>
  
  <body>
		<div class="content">
			<!-- .layout-medium -->
			<div class="layout-medium">
				<!-- page-title -->
				<h1 class="page-title">
					<i class="fa fa-pencil"></i>create profile
				</h1>
				<!--
				<c:if test="${isRegistrationSuccessful == true}">
					<div>
						<h3>
							You have successfully Registered. Acess ID : ${acessId} }
						</h3>
					</div>
				</c:if>
				-->
				
				<section id="form1-body">
				<div id="form1">
					<form:form id="signUpForm1" action="signUpForm1Validation" method="post" modelAttribute="signUpForm1" enctype="multipart/form-data">
						<div class="row">
							<div class="col-lg-12">
								<div class="section-title text-center">
									<h2>
										<i>Home page info</i>
									</h2>
								</div>
								<div class="singup-form">
									<div class="form-group">
										<div class="list-group-info mbtom">
											<div class="span-4">
												<label>
													Email Address
												</label>
												<form:input path="emailAddress" />
												<div class="has-error">
													<form:errors path="emailAddress" class="help-inline" />
												</div>
											</div>
											<div class="span-4">
												<label>
													Contact Number
												</label>
												<form:input path="phoneNumber" />
												<div class="has-error">
													<form:errors path="phoneNumber" class="help-inline" />
												</div>
											</div>
											<div class="span-4">
												<form:radiobutton path="sex" value="M" id="male" />
												Male
												<form:radiobutton path="sex" value="F" id="female" />
												Female
												<div class="has-error">
													<form:errors path="sex" class="help-inline" />
												</div>
												<!-- 
													<div class="radio-check">
														<form:radiobutton path="sex" value="M" id="male" />
														<label for="male">
															Male
														</label>
													</div>
													<div class="radio-check">
														<form:radiobutton path="sex" value="F" id="female" />
														<label for="female">
															Female
														</label>
													</div>
												 -->
											</div>
											<div class="span-4">
												<label>
													Password
												</label>
												<form:password path="password" />
												<div class="has-error">
													<form:errors path="password" class="help-inline" />
												</div>
											</div>
											<div class="span-4">
												<label>
													Confirm Password
												</label>
												<form:password path="confirmPassword" />
												<div class="has-error">
													<form:errors path="confirmPassword" class="help-inline" />
												</div>
											</div>
											<div class="form-group">

												<div class="list-group-info mbtom">
													<div class="span-4">
														<label>
															User Name
														</label>
														<form:input path="userName" />
														<div class="has-error">
															<form:errors path="userName" class="help-inline" />
														</div>
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															First Name
														</label>
														<form:input path="firstName" />
														<div class="has-error">
															<form:errors path="firstName" class="help-inline" />
														</div>
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Last Name
														</label>
														<form:input path="lastName" />
														<div class="has-error">
															<form:errors path="lastName" class="help-inline" />
														</div>
														<!-- required="required" -->
													</div>
												</div>
												<div class="list-group-info">
													<div class="span-4">
														<label>
															Tag Line
														</label>
														<form:input path="tagLine" />
														<div class="has-error">
															<form:errors path="tagLine" class="help-inline" />
														</div>
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Profile Image
														</label>
														<input type="file" name="profileImage">
														<div class="has-error">
															<form:errors path="profileImage" class="help-inline" />
														</div>
													</div>
													<div class="span-4">
														<label>
															Background Image
														</label>
														<input type="file" name="bgImage">
														<div class="has-error">
															<form:errors path="bgImage" class="help-inline" />
														</div>
													</div>
													<div class="span-4 span-full">
														<label>
															Current Address
														</label>
														<form:input path="currentAddress" />
														<div class="has-error">
															<form:errors path="currentAddress" class="help-inline" />
														</div>
														<!-- required="required" -->
													</div>
													<div class="span-4 span-full">
														<label>
															Say something
														</label>
														<div>
															<form:textarea path="saySomething" style="width: 100%;" />
															<!-- required="required" -->
															<!-- <textarea style="width: 100%;" name="saySomething"></textarea> -->
														</div>
														<div class="has-error">
															<form:errors path="saySomething" class="help-inline" />
														</div>
													</div>
													<div class="col-lg-12">
														<div class="sv-c">
															<input type="submit" value="Save and Continue">
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form:form>
				</div>
				</section>

				<section id="form2-body">
				<div id="form2">
					<form:form action="signUpForm2Validation" method="post" modelAttribute="signUpForm2" enctype="multipart/form-data">
						<div class="row">
							<div class="col-lg-12">
								<div class="section-title text-center">
									<h2>
										<i>About You</i>
									</h2>
								</div>
								<div class="create-info">
									<div class="form-group">
										<div class="list-group-info mbtom">
											<div class="span-4 span-full">
												<label>
													About Me
												</label>
												<div>
													<form:textarea path="aboutMe" style="width: 100%;" />
												</div>
											</div>
										</div>
										<div id="doing">
											<div id="doingRow">
												<div class="list-group-info mbtom">
													<div class="span-12">
														<form:label path="">Doing</form:label>
													</div>
													<div class="span-4">
														<label>
															Heading
														</label>
														<form:input path="headingAboutMe" />
														<!-- required="required" -->
														<!-- <input type="text" name="heading"> -->
													</div>
													<div class="span-4">
														<label>
															Description
														</label>
														<form:input path="descriptionAboutMe" />
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Add image
														</label>
														<input type="file" name="imageAboutMe">
													</div>
												</div>
											</div>
										</div>
										<div class="span-4 span-full">
											<div class="add-more">
												<input type="button" value="add more" id="addDoingRow">
											</div>
										</div>
										<div id="workProcess">
											<div id="workProcessRow">
												<div class="list-group-info mbtom">
													<div class="span-12">
														<form:label path="">Work Proccess</form:label>
													</div>
													<div class="span-4">
														<label>
															Heading
														</label>
														<form:input path="headingWorkProcess" />
														<!-- required="required" -->
														<!-- <input type="text" name="heading"> -->
													</div>
													<div class="span-4">
														<label>
															Description
														</label>
														<form:input path="descriptionWorkProcess" />
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Add image
														</label>
														<input type="file" name="imageWorkProcess">
													</div>
												</div>
											</div>
										</div>
										<div class="span-4 span-full">
											<div class="add-more">
												<input type="button" value="add more" id="addWorkProcessRow">
											</div>
										</div>
										<div id="funFact">
											<div id="funFactRow">
												<div class="list-group-info mbtom">
													<div class="span-12">
														<form:label path="">Fun Fact</form:label>
													</div>
													<div class="span-4">
														<label>
															Heading
														</label>
														<form:input path="headingFunFact" />
														<!-- required="required" -->
														<!-- <input type="text" name="heading"> -->
													</div>
													<div class="span-4">
														<label>
															Description
														</label>
														<form:input path="descriptionFunFact" />
														<!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Add image
														</label>
														<input type="file" name="imageFunFact">
													</div>
												</div>
											</div>
										</div>
										<div class="span-4 span-full">
											<div class="add-more">
												<input type="button" value="add more" id="addFunFactRow">
											</div>
										</div>
										<div class="col-lg-12">
											<div class="sv-c">
												<input type="submit" value="Save and Continue">
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form:form>
				</div>
				</section>

				<section id="form3-body">
				<div id="form3">
					<form:form action="signUpForm3Validation" method="post" modelAttribute="signUpForm3" enctype="multipart/form-data">
						<div class="row">
							<div class="col-lg-12">
								<div class="section-title text-center">
									<h2>
										<i>Resume page info</i>
									</h2>
								</div>
								<div class="create-info">
									<div class="form-group">
										<div id="schoolInfo">
											<div id="schoolInfoRow">
												<div class="list-group-info mbtom">
													<div class="span-4">
														<label>
															School/University Name
														</label>
														<form:input path="schoolUniversityName" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Subject
														</label>
														<form:input path="subject" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Percentage
														</label>
														<form:input path="percentage" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Passing Year
														</label>
														<form:input path="passingYear" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Discription
														</label>
														<form:input path="discriptionSubject" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Address
														</label>
														<form:input path="schoolUniversityAddress"
															/><!-- required="required" -->
													</div>
												</div>
											</div>
										</div>
										<div class="span-4 span-full">
											<div class="add-more">
												<input type="button" value="add more" id="addSchoolInfoRow">
											</div>
										</div>
										<div id="companyInfo">
											<div id="companyInfoRow">
												<div class="list-group-info mbtom">
													<div class="span-4">
														<label>
															Company Name
														</label>
														<form:input path="companyName" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Your Designation
														</label>
														<form:input path="designation" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Skills
														</label>
														<form:input path="skills" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Company Address
														</label>
														<form:input path="companyAddress" />
													</div>
													<div class="span-4">
														<label>
															Discription
														</label>
														<form:input path="descriptionCompany" />
													</div>
													<div class="span-4">
														<div class="input-append date">
															<label>
																Start date
															</label>
															<form:input path="startDate" class="dp" /><!-- required="required" -->
														</div>
													</div>
													<div class="span-4">
														<label>
															End Date
														</label>
														<form:input path="endDate" class="dp" /><!-- required="required" -->
													</div>
												</div>
											</div>
										</div>
										<div class="span-4 span-full">
											<div class="add-more">
												<input type="button" value="add more" id="addCompanyInfoRow">
											</div>
										</div>
										<div id="skill">
											<div id="skillRow">
												<div class="list-group-info mbtom">
													<div class="span-4">
														<label>
															Your Skill
														</label>
														<form:input path="yourSkill" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															Out of 100
														</label>
														<form:input path="skillWeightage" /><!-- required="required" -->
													</div>
													<div class="span-4">
														<label>
															ADD MORE
														</label>
														<div class="add-more float-left">
															<input type="button" value="Add more" class="addSillRow" >
														</div>
													</div>
													
												</div>
											</div>
										</div>
										<div class="col-lg-12">
											<div class="sv-c">
												<input type="submit" value="Save and Continue">
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form:form>
				</div>
				</section>

			</div>
		</div>
	</body>
</html>
