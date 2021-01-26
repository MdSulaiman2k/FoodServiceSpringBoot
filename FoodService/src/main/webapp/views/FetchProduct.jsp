<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
</head>
<body >
<br><br><br><br>
<form action = "getProducts"> 
  <fieldset>
   <br><br>
   <label id="fid">Enter ProductID</label>
   <input id="fid"   name="fid"   type="number" ><br><br>
   <input type="submit">
   
   <br><br><br><br>
  </fieldset>
  ${fp}
</form>
<br><br><br>
<form action = "getProductsName">
   <fieldset style=" margin :0px 450px 0px 500px  ;">
        <br><br>
        <label id= "fname">Enter ProductName</label>
        <input id="fname" name="fname" type="text"> <br><br><br><br>
        <input type="submit">
        <br><br><br><br>
   </fieldset>
</form>


</body>
</html>