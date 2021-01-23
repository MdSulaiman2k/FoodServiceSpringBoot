<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
</head>
<body style="text-align:center;">
<form action = "getProduct"> 
  <fieldset>
   <label id="fid">Enter ProductID</label>
   <input id="fid" name="foodid" type="number" ><br><br>
   <label id= "fname">Enter ProductName</label>
   <input id="fname" name="foodname" type="name"> <br><br>
   <input type="submit">
   
   ${FoodProduct}
  </fieldset>
</form>

</body>
</html>