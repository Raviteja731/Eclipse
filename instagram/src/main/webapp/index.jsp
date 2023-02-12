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
<style>

* {
  margin: 0px;
  padding: 0px;
}

body {
  background-color:black;
  background-repeat: no-repeat;
  background-size: cover;
  
}

#wrapper {
  width: 500px;
  height: 50%;
  overflow: hidden;
  border-radius: 25px
  border: 0px solid #000;
  margin: 50px auto;
  padding: 10px;
}

.main-content {
  width: 300px;
  height: 40%;
  margin: 50px auto;
  border-radius: 25px;
  background-color: #fff;
  border: 5px solid #e6e6e6;
  padding: 80px 50px;
  
}

.header {
  border: 0px solid #000;
  margin-bottom: 5px;
}

.header img {
  height: 50px;
  width: 175px;
  margin: auto;
  position: relative;
  left: 40px;
}

.input-1,
.input-2 {
  width: 100%;
  margin-bottom: 5px;
  padding: 8px 12px;
  border: 1px solid #dbdbdb;
  box-sizing: border-box;
  border-radius: 3px;
}

.overlap-text {
  position: relative;
}

.overlap-text a {
  position: absolute;
  top: 8px;
  right: 10px;
  color: #003569;
  font-size: 14px;
  text-decoration: none;
  font-family: 'Overpass Mono', monospace;
  letter-spacing: -1px;
}

.btn {
  width: 100%;
  background-color: #3897f0;
  border: 1px solid #3897f0;
  padding: 5px 12px;
  color: #fff;
  font-weight: bold;
  cursor: pointer;
  border-radius: 3px;
}

.sub-content {
  width: 250px;
  height: 40%;
  margin: -30px auto;
  border: 3px green;
  padding: 20px 50px;
  background-color: #fff;
}

.s-part {
  text-align: center;
  font-family: 'Overpass Mono', monospace;
  word-spacing: -3px;
  letter-spacing: -2px;
  font-weight: normal;
}

.s-part a {
  text-decoration: none;
  cursor: pointer;
  color: #3897f0;
  font-family: 'Overpass Mono', monospace;
  word-spacing: -3px;
  letter-spacing: -2px;
  font-weight: normal;
}
.insta {
	background-position: center;
	background-size: 20px 20px;
}



</style>
</head>
<body style="background-image: url('https://img.freepik.com/free-photo/black-abstract-background-wallpaper-image_53876-110775.jpg?w=2000'); background-size=cover;">


<form action="send" method="post">
<div id="wrapper">
  <div class="main-content">
    <div class="header">
<img class="insta" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJTMXKDa-8tDhXyxwLEeVn5_ud4wksuIR4_yIqcV8-_KeHEtXOsIm_bEXXCcGfLqpGzJY&usqp=CAU" alt="Stickman" width="24" height="39">
      <img src="https://i.imgur.com/zqpwkLQ.png"  style="position: inherit;"/>
    </div>
    <div class="l-part">
      <input type="text" placeholder="Username" class="input-1" name="name" />
      <div class="overlap-text">
        <input type="password" placeholder="Password" class="input-2" name="password"/>
        <a href="#">Forgot?</a>
      </div>
      <input type="radio" name="rememberpassword">Remember
      <br>
      
       <a class="btn btn-outline-primary"
						href="sucesspage.jsp">Login</a>
						<input type="submit" value ="Login"/>
      
      <div class="s-part">
      ------------or------------
    </div>
    <br>
      
      <div class="s-part">
      Don't have an account? <a href="#"> Sign up</a>
    </div>
    <br>
          <a class="btn btn-outline-primary"
						href="facebookpage.jsp">Login with facebook</a>
					
    
    </div>
  </div>
 
</div>
</form>

</body>
</html>