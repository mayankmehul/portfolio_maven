<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>Create Portfolio</title>
		<link rel="stylesheet" type="text/css"
			href="resources/css/htmlfivedesigner.css">
		<link rel="stylesheet" type="text/css"
			href="resources/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css"
			href="resources/css/bootstrap-theme.min.css">
		<link rel="stylesheet" type="text/css"
			href="resources/css/font-awesome.min.css">

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link rel="stylesheet" type="text/css"
			href="resources/css/datepicker.css">
		<script src="resources/js/bootstrap-datepicker.js"></script>

		<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->

		<script>
	$(document).ready(function() {
	//window.alert("WTF");
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
		$(document).on("click",".addSillRow", function(){
			$("#skill").append($("#skillRow").clone());
		});
		/*
		$("#addskills").click(function() {
			$("#skill").append($("#skillRow").clone());
		});
		*/
		$(".dp").focus(function() {
			$(".dp").datepicker();
		});
	});
</script>
	</head>

	<body>
		<!--left header-->
		<!-- <header> -->
		<!-- </header> -->
		<!--left header-->
		<div class="content">
			<form:form action="createProfile" method="post"
				modelAttribute="createProfileBean" enctype="multipart/form-data">
				<div class="row">
					<div class="col-lg-12">
						<div class="section-title text-center">
							<h2>
								<i>Sign Up</i>
							</h2>
						</div>
						<div class="singup-form">
							<!-- 
						<form method="post" action="addContact">
					 -->
							<div class="form-group">
								<div class="list-group-info mbtom">
									<div class="span-4">
										<label>
											Email Address
										</label>
										<form:input path="emailAddress" /><!-- required="required" -->
										<div class="has-error">
											<form:errors path="emailAddress" class="help-inline" />
										</div>
										<!-- 
										<input type="text" name="emailAddress"
											placeholder="emailAddress" required>
										 -->
									</div>
									<div class="span-4">
										<label>
											Phone Number
										</label>
										<form:input path="phoneNumber" /><!-- required="required" -->
										<div class="has-error">
											<form:errors path="phoneNumber" class="help-inline" />
										</div>
										<!-- 
										<input type="text" name="phoneNo" placeholder="phoneNo"
											required>
										 -->
									</div>
									<div class="span-4">
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
										<!-- 
										<div class="radio-check">
											<span>Male</span>
											<input type="radio" name="sex" value="M">
										</div>
										<div class="radio-check">
											<span>Female</span>
											<input type="radio" name="sex" value="F">
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
										<!-- 
										<input type="text" name="password" placeholder="password"
											required>
										 -->
									</div>
									<div class="span-4">
										<label>
											Confirm Password
										</label>
										<form:password path="confirmPassword" />
										<div class="has-error">
											<form:errors path="confirmPassword" class="help-inline" />
										</div>
										<!-- 
										<input type="text" name="confirmPassword"
											placeholder="confirmPassword" required>
										 -->
									</div>
									<!-- 
									<div class="span-4">
										<div class="add-more float-left mtop25">
											<input type="submit" value="Sign Up" name="submit">
										</div>
									</div>
									 -->
								</div>
							</div>
							<!-- 
						</form>
						 -->
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12">
						<div class="section-title text-center">
							<h2>
								<br>
							</h2>
							<h2>
								<i>Home page info</i>
							</h2>
						</div>
						<div class="create-info">
							<div class="form-group">
								<div class="list-group-info mbtom">
									<div class="span-4">
										<label>
											User Name
										</label>
										<form:input path="userName" /><!-- required="required" -->
									</div>
									<div class="span-4">
										<label>
											First Name
										</label>
										<form:input path="firstName" /><!-- required="required" -->
									</div>
									<div class="span-4">
										<label>
											Last Name
										</label>
										<form:input path="lastName" /><!-- required="required" -->
									</div>
								</div>
								<div class="list-group-info">
									<div class="span-4">
										<label>
											Tag Line
										</label>
										<form:input path="tagLine" /><!-- required="required" -->
									</div>
									<div class="span-4">
										<label>
											Profile Image
										</label>
										<input type="file" name="profileImage">
									</div>
									<div class="span-4">
										<label>
											Background Image
										</label>
										<input type="file" name="bgImage">
									</div>
								</div>
							</div>
							<!-- 
							<input type="submit" value="submit">
							 -->
						</div>
					</div>
				</div>
				<!---->
				<div class="row">
					<div class="col-lg-12">
						<div class="section-title text-center">
							<h2>
								<i>About page info</i>
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
											<form:textarea path="aboutMe" style="width: 100%;"
												/><!-- required="required" -->
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
												<form:input path="headingAboutMe" /><!-- required="required" -->
												<!-- <input type="text" name="heading"> -->
											</div>
											<div class="span-4">
												<label>
													Description
												</label>
												<form:input path="descriptionAboutMe" /><!-- required="required" -->
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
												<form:input path="headingWorkProcess" /><!-- required="required" -->
												<!-- <input type="text" name="heading"> -->
											</div>
											<div class="span-4">
												<label>
													Description
												</label>
												<form:input path="descriptionWorkProcess"
													/><!-- required="required" -->
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
												<form:input path="headingFunFact" /><!-- required="required" -->
												<!-- <input type="text" name="heading"> -->
											</div>
											<div class="span-4">
												<label>
													Description
												</label>
												<form:input path="descriptionFunFact" /><!-- required="required" -->
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
							</div>
						</div>
					</div>
				</div>
				<!---->
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
							</div>
						</div>
					</div>
				</div>
				<!---->
				<div class="row">
					<div class="col-lg-12">
						<div class="section-title text-center">
							<h2>
								<i>Contact page info</i>
							</h2>
						</div>
						<div class="create-info">
							<div class="form-group">
								<div class="list-group-info mbtom">
									<div class="span-4">
										<label>
											Contact Number
										</label>
										<form:input path="contactNumber" /><!-- required="required" -->
									</div>
									<div class="span-4">
										<label>
											Email Address
										</label>
										<form:input path="contactEmail" /><!-- required="required" -->
									</div>
									<div class="span-4">
										<label>
											Current Address
										</label>
										<form:input path="currentAddress" /><!-- required="required" -->
									</div>
									<div class="span-4 span-full">
										<label>
											Say something
										</label>
										<div>
											<form:textarea path="saySomething" style="width: 100%;"
												/><!-- required="required" -->
											<!-- <textarea style="width: 100%;" name="saySomething"></textarea> -->
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!---->
				<div class="row">
					<div class="col-lg-12">
						<div class="sv-c">
							<input type="submit" value="Save and Continue">
							<input type="button" value="Live Preview">
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</body>
</html>
