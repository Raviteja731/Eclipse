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
				src="data:image/jpeg;base64,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"
				class="img-fluid" alt="..." hight="150px" width="170px">

			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search"> <a class="btn btn-outline-primary"
					href="abc">Home</a> <a  class="btn btn-outline-primary" href="findByAwardName.jsp">FindByName</a>
			</form>
		</div>
	</nav>
	<h1>Award Details</h1>

	<form action="abc" method="post">



		<div>
			<div class="mb-1">
				<label for="exampleFormControlInput1" class="form-label">Award
					Name</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Award Name"
					name="awardName" />
			</div>
			<div class="mb-2">
				<label for="exampleFormControlInput1" class="form-label">Award
					MadeBy</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Award MadeBy"
					name="awardMadeBy" />
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">First
					Recived</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1"
					placeholder="Enter First Reciver Name" name="firstReciverName" />
			</div>
			<div class="mb-4">
				<input type="radio" value="true" name="Recived">Recived <input
					type="radio" value="false" name="Recived">Not-Recived
			</div>
			<div class="mb-5">
				<label for="exampleFormControlInput1" class="form-label">Recived
					Date</label> <input type=text " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Recived Date"
					name="recivedDate">
			</div>
			<div>
				<label for="exampleFormControlInput1" class="form-label">Given
					By</label> <input type=text " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Given By"
					name="givenBy"> <input type="submit" value="submit" />
	</form>
</body>
</html>