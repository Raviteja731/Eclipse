<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>X-Workz</title>
<style >

body {
  background-color:black;
  background-repeat: no-repeat;
  background-size: cover;
  
}

}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

#wrapper {
  width: 500px;
  height: 60%;
  overflow: hidden;
  border-radius: 25px
  border: 0px solid #000;
  margin: -70px auto;
  padding: 20px;
}

.main-content {
  width: 300px;
  height: 40%;
  margin: 50px auto;
  border-radius: 25px;
  background-color: #fff;
  border: 5px solid #e6e6e6;
  padding: 80px 50px;





/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
       border-radius: 20px
  
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
       border-radius: 20px
  
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
     border-radius: 20px
  
}

.registerbtn:hover {
  opacity: 1;
  
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
  
}
</style>
</head>

<body style="background-image:url('https://img.freepik.com/free-photo/social-media-background-facebook_135149-67.jpg?w=360');  background-size=cover; ">

<marquee width="60%" direction="left" height="100px">
This is a sample scrolling text that has scrolls texts to left.
</marquee>

<div id="wrapper">
  <div class="main-content">
<form action="/action_page.php">
  <div class="container">
<h3 style="color: blue;">Facebook Login page</h3>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
<br>
<br>

	      
	       <a class="btn btn-outline-primary"
						href="sucesspage.jsp">Login</a>
					
	


     
     
					
    
  </div>
</form>
</div>
</div>


</body>
</html>