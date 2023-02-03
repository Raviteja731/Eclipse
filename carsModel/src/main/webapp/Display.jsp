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
<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/front-left-side-47.jpg "
					class="img-fluid" alt="..." hight="90px" width="100px">

				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						href="index.jsp">Home</a>
						
				</form>
			</div>
		</nav>
	</div>


<h1>This Car Details Displayed</h1>
<h2>Name :${Name}</h2>
<h2>Model :${model}</h2>
<h2>Colour :${colour}</h2>
<h2>Milage :${milage}</h2>
<h2>Price :${price}</h2>

</body>
</html>