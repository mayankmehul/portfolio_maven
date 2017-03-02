<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <div class="mypage">
      <!--left header-->
      <header>
        <div class="left-side">
          <img src=${avatar} alt="Avtar" class="img-responsive">
          <h3 class="name-title">ANIL <span>CHANDOLA</span></h3>
          <!--Left menu-->
          <nav class="left-menu" >
            <ul id="toggle">
              <li><a class="toggler active" id="one" ><i class="fa fa-home"></i>HOME</a></li>
              <li><a class="toggler" id="two" ><i class="fa fa-user"></i>ABOUT ME</a></li>
              <li><a class="toggler" id="three" ><i class="fa fa-pencil-square-o"></i>Resume</a></li>
              <li><a class="toggler" id="four" ><i class="fa fa-picture-o"></i>PORTFOLIO</a></li>
              <!--<li><a class="toggler" id="five" ><i class="fa fa-book"></i>BLOG</a></li>-->
              <li><a class="toggler" id="six" ><i class="fa fa-phone"></i>CONTACT ME</a></li>
              <li><a class="toggler" id="seven" ><i class="fa fa-pencil"></i>Create Profile</a></li>
            </ul>
          </nav>
          <!--Left menu-->
          <!--soical icon-->
          <div class="header-bottom">
            <ul class="social-icon">
              <li><a href=""><i class="fa fa-whatsapp fa-1x"></i></a></li>
              <li><a href=""><i class="fa fa-facebook-square fa-1x"></i></a></li>
              <li><a href=""><i class="fa fa-linkedin-square fa-1x"></i></a></li>
              <li><a href=""><i class="fa fa-twitter-square fa-1x"></i></a></li>
              <li><a href=""><i class="fa fa-google-plus-square fa-1x"></i></a></li>
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
              <h4>Hi, I am</h4>
              <h2>Anil Chandola</h2>
              <div id="typer">I am </div>
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
              	<p>${aboutMe}</p>
              </div>
              <div class="section-title center">
                <h4>
                  <i>What I'm Doing</i>
                </h4>
              </div>
              <!-- section-title -->
              <!-- row -->			
              <div class="row">
                <!-- col -->	
                <!--<i class="pe-7s-glasses"></i>-->
                   <c:forEach var="aboutMeSub" items="${aboutMeSubMaster}">
                   		<div class="col-sm-6 col-md-3">
                  			<!-- service -->
                 			 <div class="service">
                   					<h4>${aboutMeSub.heading}</h4>
                   					<p>${aboutMeSub.description}</p>
   									<img src=${aboutMeSub.imageName} alt="image">
   							 </div>
                  <!-- service -->
                		</div>
					</c:forEach>
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
                <!-- col -->
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-comment"></i>
                    <!--<img src="images/site/icon-03.png" alt="image"/>-->
                    <h4>DISCOVER</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
                <!-- col -->    
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-lightbulb-o"></i>
                    <h4>IDEA</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
                <!-- col -->
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-pencil"></i>
                    <h4>DESIGN</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
                <!-- col -->    
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-object-group"></i>
                    <h4>DEVELOP</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
                <!-- col -->    
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-bug"></i>
                    <h4>TEST</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
                <!-- col -->    
                <div class="col-xs-4 col-sm-2">
                  <!-- process -->
                  <div class="process">
                    <i class="fa fa-rocket"></i>
                    <h4>LAUNCH</h4>
                  </div>
                  <!-- process -->
                </div>
                <!-- col -->
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
              <!-- section-title -->
              <!-- row -->
              <div class="row">
                <!-- col -->
                <div class="col-xs-6 col-sm-4">
                  <!-- fun-fact -->
                  <div class="fun-fact">
                    <i class="fa fa-paper-plane"></i>
                    <!--<img src="images/site/icon-03.png" alt="image"/>-->
                    <h4>200 PROJECTS</h4>
                  </div>
                  <!-- fun-fact -->
                </div>
                <!-- col -->
                <!-- col -->
                <div class="col-xs-6 col-sm-4">
                  <!-- fun-fact -->
                  <div class="fun-fact">
                    <i class="fa fa-coffee"></i>
                    <h4>2 Cups Of Coffee daily</h4>
                  </div>
                  <!-- fun-fact -->
                </div>
                <!-- col -->
                <!-- col -->
                <div class="col-xs-6 col-sm-4">
                  <!-- fun-fact -->
                  <div class="fun-fact">
                    <i class="fa fa-clock-o"></i>
                    <h4>Daily Spand 10 Hours</h4>
                  </div>
                  <!-- fun-fact -->
                </div>
                <!-- col -->
              </div>
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
                           <h2>WORK HISTORY</h2>
                           <p>
                              <i class="fa fa-bookmark-o"></i>
                              <!--<img src="images/site/icon-03.png" alt="image"/>-->
                           </p>
                        </div>
                        <c:forEach var="workexpMaster" items="${workexpMasterList}">
                 			 <div class="event">
                   					<h3>${workexpMaster.joiningDate}</h3>
                   					<h4>${workexpMaster.designation}</h4>
   									<h5>${workexpMaster.companyName}</h5>
   									<p>${workexpMaster.description}</p>
   							 </div>
						</c:forEach>
                        <div class="event">
                           <h2>EDUCATION</h2>
                           <p>
                              <i class="fa fa-graduation-cap"></i>
                              <!--<img src="images/site/icon-03.png" alt="image"/>-->
                           </p>
                        </div>
                        <c:forEach var="educationMaster" items="${educationMasterList}">
                 			 <div class="event">
                   					<h3>${educationMaster.yearOfPassing}</h3>
                   					<h4>${educationMaster.domain}</h4>
   									<h5>${educationMaster.schoolName}</h5>
   									<p>${educationMaster.description}</p>
   							 </div>
						</c:forEach>
                        <p><a href="http://www.webcrayons.net/resume.doc" class="button"><i class="fa fa-download"></i></i>&nbsp;Download CV</a></p>
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
                        
                        
                          <c:forEach var="portfolioSkillMaster" items="${portfolioSkillMasterList}">
                 			 <div class="skill-unit">
                 			 <h4>${portfolioSkillMaster.skillCategory}</h4>
                           <div class="bar" data-percent=${portfolioSkillMaster.marks}%>
                              <div class="progress" style="width: ${portfolioSkillMaster.marks}%;"><span>${portfolioSkillMaster.marks}</span></div>
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
                                     <div class="cv-table-left"><i class="cv-icon fa fa-phone-square"></i>Phone</div>
                                     <div class="cv-table-right">${phnNo}</div>
                                  </li>
                                  <li>
                                     <div class="cv-table-left"><i class="cv-icon fa fa-envelope"></i>E-mail</div>
                                     <div class="cv-table-right">${emailAddress}</div>
                                  </li>
                                  <li>
                                     <div class="cv-table-left"><i class="cv-icon fa fa-map"></i>Address</div>
                                     <div class="cv-table-right">${address}</div>
                                  </li>
                               </ul>
                               <p>Quibusdam noster aut laborum despicationes. Malis appellat o enim tamen. O amet quibusdam. Magna occaecat ex coniunctione, quis in mentitum, multos excepteur offendit, id a dolore illum.</p>
                               <hr>
                               <h2 class="border">Get in Touch</h2>
                               <div class="contact-form">
                               <!--form-->
                                <form>
                                 <!--input field -->
                                    <div class="form-div">
                                    <label>Your Name (required)</label>
                                    <span class="wpcf7-form-control-wrap your-name">
                                    <input type="text" name="your-name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false">
                                    </span>
                                    </div>
                                     <!--input field -->
                                     <!--input field -->
                                    <div class="form-div">
                                    <label>Your Email (required)</label>
                                    <span class="wpcf7-form-control-wrap your-name">
                                    <input type="text" name="your-name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false">
                                    </span>
                                    </div>
                                     <!--input field -->
                                     <!--input field -->
                                    <div class="form-div">
                                    <label>Subject</label>
                                    <span class="wpcf7-form-control-wrap your-name">
                                    <input type="text" name="your-name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false">
                                    </span>
                                    </div>
                                     <!--input field -->
                                     <!--input field -->
                                    <div class="form-div">
                                    <label>Contact No.</label>
                                    <span class="wpcf7-form-control-wrap your-name">
                                    <input type="text" name="your-name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false">
                                    </span>
                                    </div>
                                     <!--input field -->
                                     <!--input field -->
                                    <div class="form-div">
                                    <label>Your Message</label>
                                    <span class="wpcf7-form-control-wrap your-name">
                                   <textarea name="your-message" cols="40" rows="10" class="wpcf7-form-control wpcf7-textarea" aria-invalid="false"></textarea>
                                    </span>
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
                       <div style="overflow:hidden;width:500px;height:600px;resize:none;max-width:100%;">
                        <div id="my-map-display" style="height:100%; width:100%;max-width:100%;">
                        <iframe style="height:100%;width:100%;border:0;" frameborder="0" src="https://www.google.com/maps/embed/v1/place?q=DLF+Phase+2,+DLF+Cyber+City,+Gurgaon,+Haryana,+India&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU">
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
                      <!--Signup-->
                      <div class="row">
                      	<div class="col-lg-12">
                        <div class="section-title text-center">
                               <h2>
                                  <i>Sign Up</i>
                               </h2>
                            </div>
                        	<div class="singup-form">
                        
                            	<form method="post" action="addContact">
                                	<div class="form-group">
                                    	<div class="list-group-info mbtom">
                                    		<div class="span-4">
                                             <label>User Name</label>
                                            	<input type="text" name="userName" value="User Name">
                                            </div>
                                            <div class="span-4">
                                             <label>First Name</label>
                                            	<input type="text" name="firstName" value="First Name">
                                            </div>
                                            <div class="span-4">
                                             <label>Last Name</label>
                                            	<input type="text" name="lastName" value="Last Name">
                                            </div>
                                            <div class="span-4">
                                             <label>Email Address</label>
                                            	<input type="text" name="emailAddress" value="emailAddress">
                                            </div>
                                            <div class="span-4">
                                             <label>Phone Number</label>
                                            	<input type="text" name="phoneNo" value="phoneNo">
                                            </div>
                                            <div class="span-4">
                                                 <div class="radio-check">
                                                 <span>Male</span><input type="radio" name="sex" value="M">
                                                 </div>
                                                 <div class="radio-check">
                                                 <span>Female</span><input type="radio" name="sex" value="F" >
                                                 </div>
                                            </div>
                                            <div class="span-4">
                                             <label>Password</label>
                                            	<input type="text" name="password" value="password">
                                            </div>
                                            <div class="span-4">
                                             <label>Confirm Password</label>
                                            	<input type="text" name="confirmPassword" value="confirmPassword">
                                            </div>
                                            <div class="span-4">
                                            <div class="add-more float-left mtop25">
                                            <input type="submit" value="Sign Up" name="submit">
                                            </div>
                                            </div>
                                        </div>
                                        
                                     </div>
                                </form>
                            </div>
                        </div>
                      </div>
                      <!--Signup-->
                      <!-- page-title -->
               </div>
        </section>
        <!--blog page-->
      </div>
      <!--right side-->
    </div>
    <script src="resources/js/custem.js" type="text/javascript" ></script>
    <script type="text/javascript" >
   var tagLine = "${tagLine}";
(function($){
    $.fn.typer = function(text, options){
        options = $.extend({}, {
            char: '',
            delay: 2000,
            duration: 600,
            endless: true,
            onType: $.noop,
            afterAll: $.noop,
            afterPhrase: $.noop
        }, options || text);

        text = $.isPlainObject(text) ? options.text : text;
        text = $.isArray(text) ? text : text.split(" ");

        return this.each(function(){
            var elem = $(this),
                isVal = {input:1, textarea:1}[this.tagName.toLowerCase()],
                isTag = false,
                timer,
                c = 0;

            (function typetext(i) {
                var e = ({string:1, number:1}[typeof text] ? text : text[i]) + '',
                    char = e.substr(c++, 1);

                if( char === '<' ){ isTag = true; }
                if( char === '>' ){ isTag = false; }
                elem[isVal ? "val" : "html"](e.substr(0, c) + ($.isFunction(options.char) ? options.char() : options.char || ' '));
                if(c <= e.length){
                    if( isTag ){
                        typetext(i);
                    } else {
                        timer = setTimeout(typetext, options.duration/10, i);
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
                    if(i === text.length - 1) options.afterAll(timer);
                    options.afterPhrase(timer);
                }
            })(0);
        });
    };
	///menu js///
	//<![CDATA[
$(window).load(function(){
              // Optional code to hide all divs
            $("section").hide();
              // Show chosen div, and hide all others
            $(".toggler").click(function () 
            {
                $("#" + $(this).attr("id") + "-info").show().siblings('section').hide();
            });

});//]]> 
///menu js///

}(jQuery));

 var win = $(window),
          foo = $('#typer');
      foo.typer([tagLine]);
      // unneeded...
      win.resize(function(){
          var fontSize = Math.max(Math.min(win.width() / (1 * 10), parseFloat(Number.POSITIVE_INFINITY)), parseFloat(Number.NEGATIVE_INFINITY));
          foo.css({
              fontSize: fontSize * .2 + 'px'
          });
      }).resize();
	  
	  
    </script>
  </body>
</html>
