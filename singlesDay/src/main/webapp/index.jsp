<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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
</head>
<body>
<nav class="navbar navbar-green bg-dark">
		<div class="container-fluid">
			<img
				src="https://cdn.dribbble.com/users/3154158/screenshots/15966450/media/b321bf8f97b021519c148ea0de89faef.jpg?compress=1&resize=768x576&vertical=top"
				class="img-fluid" alt="..." hight="150px" width="170px">

			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search"> <a class="btn btn-outline-primary"
					href="index.jsp">Home</a>
			</form>
		</div>
	</nav>
	
	<h1>Welcome to Singles Login Page</h1>
	
	<form action="send" method="post">
		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Name</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your Name" name="name">
			</div>
		</div>
		<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Age</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your Age" name="age">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					MobileNo</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your MobileNo" name="mobileNo">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Gender</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your gender" name="gender">
			</div>
		
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Location
			</label> <input type="text" " class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your location" name="location">
		</div>
		<div>
			<input type="submit" class="btn btn-dark" value="Send" name="send" />

		</div>
</form>
	
</body>
</html>