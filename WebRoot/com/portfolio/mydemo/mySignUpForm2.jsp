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
    
    <title>Sign Up 2</title>
	<link rel="stylesheet" type="text/css" href="resources/css/htmlfivedesigner.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
		
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<script>
		$(document).ready(function() {
			$("#addDoingRow").click(function() {
				$("#doing").append($("#doingRow").clone());
			});
			$("#addWorkProcessRow").click(function() {
				$("#workProcess").append($("#workProcessRow").clone());
			});
			$("#addFunFactRow").click(function() {
				$("#funFact").append($("#funFactRow").clone());
			});
		});
	</script>

	</head>

	<body>

		<div class="content">
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
	</body>
</html>
