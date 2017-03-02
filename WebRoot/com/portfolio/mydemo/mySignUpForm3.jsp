<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Sign Up 3</title>
	<link rel="stylesheet" type="text/css" href="resources/css/htmlfivedesigner.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
		
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css"href="resources/css/datepicker.css">
	<script src="resources/js/bootstrap-datepicker.js"></script>
		
	<script>
		$(document).ready(function() {
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
	</body>
</html>
