<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
<link rel="stylesheet" href="/MyStyle.css" />
</head>
<body id="form">
<header id="f">
<h3>Mileage Form</h3>
</header>
<p> 
<form action ="/mileage-result">

<p>
<label id="main"> Enter Mileage </label>
<input type="number" name="mpg" step=".01"/>
</p>


<p>
<label id="main"> Gallons in tank </label>
<input type="number" name="gallons" step=".01"/>
</p>

<p id = "pad"></p>

<label id ="howfar"> <u>How Far Do You Expect to Go?</u> </label>
<p></p>
<label id="main">Miles</label>
<input type="number" name="dist" step=".01"/> 

<p>
<button type="submit">Get Range</button>
</p>

</form>

</p>



</body>


<div>
<p id="foot"><a href="/">Back to Homepage</a></p>
</div> 

</html>