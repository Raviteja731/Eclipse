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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRv7jBAOTypqMASM7IFu_VE1qKIs9nFOFqVkg&usqp=CAU" alt="" height="90px" width="150px"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#" style=" color: white;">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" style=" color: white">Link</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link disabled" href="#" style=" color: white">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" action="aeroplane">
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="search">
     
    </form>
  </div>
</nav>




<form action="aeroplane" method="post">
<div class="formbold-main-wrapper">
    <div class="formbold-form-wrapper">
       

<h1>
    <b style="color: Purple" >Welcome to Air-lines Data Saving...</b>
</h1>
<br>
<br>

<c:forEach items="${error}" var="e">
<span style="color: red;">${e.message}</span><br>
</c:forEach>	

        <form action="bigBasket" method="post">

            <div class="formbold-input-flex">
                <div>
                    <label for="companyName" class="formbold-form-label"><b>CompanyName</b> </label>
                             <input type="text" name="companyName"
                        id="companyName" placeholder="companyName"
                        class="formbold-form-input"  value="${aeroplaneDTO.companyName}"/>
                </div>
                <div>
                    <label for="AeroplaneName" class="formbold-form-label"><b>AeroplaneName</b>
                    </label> <input type="text" name="aeroplaneName"  value="${aeroplaneDTO.aeroplaneName}" id="AeroplaneName"
                        placeholder="AeroplaneName" class="formbold-form-input" />
                </div>
            </div>
            <div class="formbold-input-flex">
                
                <div>
                    <label for="PassangerName" class="formbold-form-label"> <b>PassangerName</b>
                    </label> 
                    <input type="text" name="passangerName"  value="${aeroplaneDTO.passangerName}" placeholder="PassangerName"
                        class="formbold-form-input" />
                        
                     <label for="Enter Your Gamil-Id"
                        class="formbold-form-label"> <b>Gamil-Id</b>
                    </label> <input type="email" name="gmail"  value="${aeroplaneDTO.gmail}"
                        placeholder="Enter Your Gamil-Id" class="formbold-form-input" />
                </div>

                <div>
                    <label class="formbold-form-label"><b>Class Type</b></label> <select
                        class="formbold-form-input" name="classType" id="classType">
                        <option value="">classType</option>
                        <c:forEach items="${classType}" var="c">
                            <option value="${c}">${c}</option>
                        </c:forEach>
                    </select> <label class="formbold-form-label"><b>CountryName</b></label> <select
                        class="formbold-form-input" name="countryName" id="Country">
                        <option value="">countryNames</option>
                        <c:forEach items="${countryNames}" var="C">
                            <option value="${C}">${C}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
           
            <div class="formbold-input-flex">
                <div>
                    <label for="TicketCost" class="formbold-form-label"><b>TicketCost</b>
                    </label> <input type="text" name="ticketCost"  value="${bigBasketDTO.price}" id="TicketCost"
                        placeholder="TicketCost" class="formbold-form-input" />
                </div>
                <div>
                    <label for="EnterPlanenumber" class="formbold-form-label"><b>EnterPlanenumber</b>
                    </label> <input type="text" name="enterPlanenumber" value="${bigBasketDTO.EnterPlanenumber}" id="EnterPlanenumber"
                        placeholder="EnterPlanenumber" class="formbold-form-input" />
                </div>
            </div>
            
            <input class="formbold-btn" type="submit" value="Apply" />
        </form>
    </div>
</div>
</form>

</body>
</html>