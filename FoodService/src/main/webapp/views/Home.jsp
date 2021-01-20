<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Home Page </title>

</head>
<body style="text-align:center;" >
<form method="post" action = "addproduct">
   <fieldset>
   <br><br>
   <label id = "id">Enter foodID   :</label>
   <input name= "foodId" id="id" type="number" ><br><br>
   <label id = "name" >Enter Foodname :</label>
   <input name= "foodname" id = "name" type="text" ><br><br>
   <label id="price" >Enter Price  :</label>
   <input name = "price" id= "price" type="text"><br><br> 
   <label id="quantity">Enter Quantity  :</label>
   <input name="quantity" id="quantity" type="text"><br><br>
   <input type="submit">
   <br>
   
   </fieldset>
   
</form>
</body>
</html>