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
				src="https://content.jdmagicbox.com/comp/mysore/u4/0821px821.x821.200219150929.v1u4/catalogue/preethi-bakery-and-sweets-mysore-msydyocqbo-250.jpg"
				class="img-fluid" alt="..." hight="150px" width="170px">

			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search"> <a class="btn btn-outline-primary"
					href="index.jsp">Home</a>
			</form>
		</div>
	</nav>
	</div>
	
		<form action="Send" method="post">
		<div>
			<div class="mb-1">
				<label for="exampleFormControlInput1" class="form-label">Casino
					Name</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Casino Name"
					name="CasinoName">
			</div>
			<div class="mb-2">
				<label for="exampleFormControlInput1" class="form-label">
					OwnerName</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Casino Owner Name"
					name="ownerName">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					 WifeName</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Owner Wife Name"
					name="WifeName">
			</div>
			<div class="mb-4">
				Free Food Yes:<input type="radio" value="true" name="freeFood">NO:<input
					type="radio" value="false" name="freeFood">
			</div>
			<div class="mb-4">
				freeAlchocal YES:<input type="radio" value="true" name="freeAlchocal">No: <input
					type="radio" value="false" name="freeAlchocal">
			</div>
			
			<div class="mb-6">
				<label for="exampleFormControlInput1" class="form-label">
					since</label> <input type=text " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Established"
					name="since">
			</div>
			<input type="submit" class="btn btn-dark" value="Send"  />

</body>
</html>