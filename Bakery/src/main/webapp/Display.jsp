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
<h3 style="font-family: fantasy; color: blue;">Sucessfully Uploaded Bakery Details</h3>
Name.: ${Bakery.bakeryName}
<br>
OwnerName.: ${Bakery.ownerName}
<br>
WifeName.: ${Bakery.ownerWifeName}
<br>
Married.: ${Bakery.married}
<br>
FamousItem.: ${Bakery.famousFor}
<br>
since.: ${Bakery.since}

</body>
</html>