<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Answer1">
<%out.println("WELCOME : "   + "  " + session.getAttribute("username"));%>
<ol>
<li>
Inside which HTML element do we put the JavaScript?</li>
</ol>
<ol>
<input type="radio" name="option" value="A" >Scrpit Tag </br>
 <input type="radio" name="option" value="B" >Scripting Tag</br>
 <input type="radio" name="option" value="C" >Java Script Tag</br>
 <input type="radio" name="option" value="D" >JS Tag</br>

</ol>

</ol>
<input type="submit" name="submit" value="NEXT">
</form>
</body>

</html>