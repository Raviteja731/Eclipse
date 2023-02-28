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
<title>X-Workz</title></head></head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
	<a class="navbar-brand" href="#" style="color: Orange"><b>X-workz</b></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"
				style="color: Blue">Home <span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#"
				style="color: Blue">Link</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" style="color: Blue"
				id="navbarDropdown" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Dropdown </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#"
				style="color: Blue">Disabled</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0" action="se" method="get">
			<input class="form-control mr-sm-2" type="text" placeholder="Search"
				aria-label="Search" name="id"> <input type="submit"
				class="
				btn btn-primary" value="search" />

		</form>
	</div>
</nav>

<h1 style="text-align: center; color: blue">
		<b>Welcome to search page.....</b>
	</h1>

	<h4><b>awardName:- </b></h4><h4 style="color: red">${AwardDTO.awardName}</h4><br>
	<h4><b>firstReciverName</b></h4><h4 style="color: red">${AwardDTO.firstReciverName}</h4><br>
	<h4><b>recivedDate:- </b></h4><h4 style="color: blue">${AwardDTO.recivedDate}</h4><br>
	<h4><b>givenBy:- </b></h4><h4 style="color: red">${AwardDTO.givenBy}</h4><br>
	<h4><b>Recived:- </b></h4><h4 style="color: red">${AwardDTO.isRecived()}</h4><br>
	<h4><b>Not_Recived:- </b></h4><h4 style="color: red">${AwardDTO.isNot_Recived()}</h4><br>
	<h4><b>awardMadeBy:- </b></h4><h4 style="color: blue">${AwardDTO.awardMadeBy}</h4><br>
	



</body>
</html>