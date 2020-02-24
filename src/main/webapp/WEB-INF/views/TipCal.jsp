<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/MyStyle.css" />
</head>
<header>
<h3>Tip Calculator</h3>
</header>

<body id="tip">

<form action = "Tip-Result">
<p id = "main">
<label>Bill Total</label>

<input type="number" name="bill" step = ".01" default ="0"/> 
</p>

<p id = "main">
 <input type="radio" id="0" name="tip" value="0">
  <label for="0">No Tip</label><br>
  <input type="radio" id="10" name="tip" value=".1" checked ="checked">
  <label for="10">10%</label><br>
  <input type="radio" id="20" name="tip" value=".2">
  <label for="20">20%</label><br>
  <input type="radio" id="30" name="tip" value=".3">
  <label for="30">30%</label><br>
  <input type="radio" id="cus" name="tip" value="-1" >
  <label for="cust">Custom Tip</label>
</p>

<label id = "main">Custom Tip</label>
<input type="number" name="cust" step = ".01"/> 


<p>
<button type ="submit" id = "main">Get Tip</button>
</p>

<p id ="pad">


</p>
</form>

</body>

<div>
<p id="foot"><a href="/">Back to Homepage</a></p>
</div> 

</html>