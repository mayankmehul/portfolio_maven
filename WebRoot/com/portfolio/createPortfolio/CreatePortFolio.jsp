<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<div class="content">
   <div class="row">
                      	<div class="col-lg-12">
                        	<div class="section-title text-center">
                               <h2>
                                  <i>Home page info</i>
                               </h2>
                            </div>
                            <div class="create-info">
                            	<form action="uploadImg" enctype="multipart/form-data" method="post">
                                	<div class="form-group">
                                    	<div class="list-group-info mbtom">
                                            <div class="span-4">
                                            <label>Username</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>First Name</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Last Name</label>
                                            <input type="text" name="" >
                                            </div>
                                        </div>
                                        <div class="list-group-info">
                                            <div class="span-4">
                                            <label>Tagline</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Profile Image</label>
                                            <input type="file" name="file" >
                                            </div>
                                            <div class="span-4">
                                            <label>Background Image</label>
                                            <input type="file" name="" >
                                            </div>
                                        </div>
                                    </div>
                                    <input type="submit" value="submit">
                                </form>
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
                            	<form>
                                	<div class="form-group">
                                    	<div class="list-group-info mbtom">
                                            <div class="span-4 span-full">
                                            <label>About me</label>
                                            <div><textarea style="width:100%;"></textarea></div>
                                            </div>
                                            <div class="span-4">
                                            <label>Heading</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Description</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Add image</label>
                                            <input type="file" name="" >
                                            </div>
                                        </div>
                                        <div class="list-group-info mbtom">
                                            <div class="span-4 span-full">
                                            <label>Work Proccess skills</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4 span-full">
                                            <label>Fun Fect</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Description</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Add image</label>
                                            <input type="file" name="" >
                                            </div>
                                        </div>
                                        
                                    </div>
                                </form>
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
                            	<form>
                                	<div class="form-group">
                                    	<div class="list-group-info mbtom">
                                            <div class="span-4">
                                            <label>School/University Name</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Subject</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Passing Year with percentage</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4 span-full">
                                            <div class="add-more"><input type="button" value="add more"></div>
                                            </div>
                                        </div>
                                        <div class="list-group-info mbtom">
                                            <div class="span-4">
                                            <label>Company Name</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Your Designation</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Skills</label>
                                            <input type="text" name="" >
                                            </div>
                                             <div class="span-4">
                                            <label>Company Address</label>
                                            <input type="text" name="" >
                                            </div>
                                             <div class="span-4">
                                            <label>Discription</label>
                                            <input type="text" name="" >
                                            </div>
                                             <div class="span-4">
                                            <label>Start date - End Date</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4 span-full">
                                            <div class="add-more"><input type="button" value="add more"></div>
                                            </div>
                                        </div>
                                        <div class="list-group-info mbtom">
                                            <div class="span-4">
                                            <label>Your Skill</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Out of 100</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Save and Continue</label>
                                            <div class="add-more float-left">
                                            <input type="button" value="Save">
                                            </div>
                                            <div class="add-more float-left">
                                            <input type="button" value="Add more">
                                            </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
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
                            	<form>
                                	<div class="form-group">
                                        <div class="list-group-info mbtom">
                                            <div class="span-4">
                                            <label>Contact Number</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Email Address</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4">
                                            <label>Current Address</label>
                                            <input type="text" name="" >
                                            </div>
                                            <div class="span-4 span-full">
                                            <label>Say something</label>
                                            <div><textarea style="width:100%;"></textarea></div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
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
                    </div>
                     </div>
