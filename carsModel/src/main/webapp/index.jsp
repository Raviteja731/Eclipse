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
</head>
<body>
<h3  style="color: blue;">This is Selection page</h3>
<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/front-left-side-47.jpg "
					class="img-fluid" alt="..." hight="90px" width="100px">

				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						href="index.jsp">Home</a>
						<br>
						 <a class="btn btn-outline-primary"
						href="index.jsp">Login</a>
			
				</form>
			</div>
		</nav>
	</div>
	<div class="container-xxl">
	<form action="send" method="post">
		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Brand
					Name</label> <input type="text" " class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your brand Name" name="name">
			</div>
		</div>
		<div>Model
			<select class="form-select" aria-label="Default select example" name="model">
				<option selected  >Select Model Type</option>
				<option value="4*4 Thar">4*4 Thar</option>
				<option value="Modified Thar">Modified Thar</option>
				<option value="4*8 Thar">4*8 Thar</option>
			</select>
		</div>
		
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Milage
					</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter milage" name="milage">
			</div>
			<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Colour
			
			</label> <input type="text" " class="form-control"
				id="exampleFormControlInput1" placeholder="Enter Car colour" name="colour">
		</div>
			
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Price
			
			</label> <input type="text" " class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your Car price" name="price">
		</div>
		<div>
			<input type="submit" class="btn btn-dark" value="Send" name="send" />

		</div>
		
</div>
	
</form>

</body>
</html>