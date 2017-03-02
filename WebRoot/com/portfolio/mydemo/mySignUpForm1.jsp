<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<body>
		<div id = "formBody">
			<div class="content">
				<form:form id="signUpForm1" method="post" modelAttribute="signUpForm1" enctype="multipart/form-data">
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
											<form:radiobutton path="sex" value="M" id="male" />Male
											<form:radiobutton path="sex" value="F" id="female"/>Female
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
		</div>
	</body>
</html>
