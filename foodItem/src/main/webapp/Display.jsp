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

<h3>This is display page...</h3>


	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="30" height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Dropdown </a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>
			<a href="#">Home</a>
		</div>
	</nav>
	Page Send to Food item

	<form action="send" method="post">
		<div>
			<div class="form-group">
				<label for="formGroupExampleInput">Food name</label> 
				<input	type="text" class="form-control" id="formGroupExampleInput"
					placeholder="enter food name here" name="name">
			</div>
			<form class="form-inline">
				<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Type</label>
				<select class="custom-select my-1 mr-sm-2"
					id="inlineFormCustomSelectPref" name="type">
					<option selected>Choose...</option>
					<option value="Veg">Veg</option>
					<option value="Non-Veg">Non-Veg</option>
					<option value="Both">Both</option>
				</select>
			</form>

			<div class="form-group">
				<label for="formGroupExampleInput">price</label> <input
					type="number" class="form-control" id="formGroupExampleInput"
					placeholder="price" name="price">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">Food quantity</label> <input
					type="number" class="form-control" id="formGroupExampleInput"
					 name="range">
			</div>

			<input type="submit" value="send" class="btn btn-success">
	</form>

</body>
</html>