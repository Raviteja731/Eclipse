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

<form action="email" method="get">
<pre>
<label>Email is :${Email}</label>
<input type="submit" value="Email">
</pre>
</form>

<form action="mobile" method="get">
<pre>
<label>MobileNo. :${MobileNo}</label>
<input type="submit" value="MobileNo">
</pre>
</form>

<form action="adhar" method="get">
<pre>
<label>AdharNo. :${Adhar}</label>
<input type="submit" value="AdharNo">
</pre>
</form>

<form action="age" method="get">
<pre>
<label>Age. :${Age}</label>
<input type="submit" value="Age">
</pre>
</form>

<form action="desiredSal" method="get">
<pre>
<label>Salary. :${salaryy}</label>
<input type="submit" value="Salary">
</pre>
</form>

<form action="DOB" method="get">
<pre>
<label>DateOfBirth. :${dateOfBirth}</label>
<input type="submit" value="DOB">
</pre>
</form>

<form action="BestFriends" method="get">
<pre>
<label>BestFriends . :${friends}</label>
<input type="submit" value="Friends">
</pre>
</form>

<form action="Places" method="get">
<pre>
<label>visitedPlaces . :${places}</label>
<input type="submit" value="places">
</pre>
</form>

<form action="skills" method="get">
<pre>
<label>Skills . :${skills}</label>
<input type="submit" value="Skills">
</pre>
</form>

<form action="mobilee" method="get">

<input type="submit" value="Mobile">
        <h6>brand :${mobile.brand}</h6>
		<h6>price :${mobile.price}</h6>
		<h6>weight :${mobile.weight}</h6>
		<h6>colour :${mobile.colour}</h6>
		<h6>country :${mobile.country}</h6>

</form>

<form action="beverages" method="get">

<input type="submit" value="juice">
        <h6>brand :${juice.brand}</h6>
		<h6>price :${juice.price}</h6>
		<h6>weight :${juice.weight}</h6>
		<h6>tastey :${juice.tastey}</h6>
		<h6>bottleColor :${juice.bottleColor}</h6>
		<h6>manufaCompany :${juice.manufaCompany}</h6>
		<h6>localdate :${juice.localdate}</h6>
		
		<h6>manufaYear :${juice.manufaYear}</h6>

</form>

<form action="Chats" method="get">

<input type="submit" value="juice">
        <h6>shopName :${Chats.shopName}</h6>
		<h6>since :${Chats.since}</h6>
		<h6>ownerName :${Chats.ownerName}</h6>
		<h6>ownerWifeName :${Chats.ownerWifeName}</h6>
		<h6>location :${Chats.location}</h6>
		<h6>incomePerDay :${Chats.incomePerDay}</h6>
		<h6>time :${Chats.time}</h6>
		<h6>peice :${Chats.peice}</h6>
		<h6>costlychat :${Chats.costlychat}</h6>
		<h6>lowCostChat :${Chats.lowCostChat}</h6>
		

</form>

<form action="Surya" method="get">

<input type="submit" value="family">
        <h6>fatherName :${teja.fatherName}</h6>
		<h6>motherName :${teja.motherName}</h6>
		<h6>name :${teja.Names}</h6>
		<h6>age :${teja.age}</h6>
		<h6>height :${teja.height}</h6>
		<h6>weight :${teja.weight}</h6>
		<h6>mobileNo :${teja.mobileNo}</h6>
		<h6>wifeName :${teja.wifeName}</h6>
		<h6>noFoMembers :${teja.noFoMembers}</h6>
		<h6>noOfPeoples :${teja.noOfPeoples}</h6>
		

</form>

</body>
</html>