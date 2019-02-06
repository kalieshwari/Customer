<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCustomer">
 <label for="id"><b>ID</b></label>
 <input type="text" name="id"><br>
 <label for="name"><b>NAME</b></label>
 <input type="text" name="name"><br>
 <label for="name"><b>QUALIFICATION</b></label>
 <input type="text"name="qualification"><br>
  <button type="submit">SUBMIT</button>
 </form>
<br>
<br>
 <form action="getCustomer">
  <label for="name"><b>QUALIFICATION</b></label>
 <input type="text" name="qualification"><br>
  <button type="submit">SUBMIT</button>
 </form>

</body>
</html>