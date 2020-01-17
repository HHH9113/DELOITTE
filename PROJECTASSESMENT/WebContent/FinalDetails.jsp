<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<tr>

<td>
ProductId:
</td>
<td>

<%out.println(session.getAttribute("pID")); %>

</td>

</tr>

<tr>

<td>
Product Name:
</td>
<td>

<%out.println(session.getAttribute("pNAME")); %>

</td>

</tr>


<tr>

<td>
Price:
</td>
<td>

<%out.println(session.getAttribute("price")); %>

</td>

</tr>


<tr>

<td>
QOA
</td>
<td>

<%out.println(session.getAttribute("qoa")); %>

</td>

</tr>






</table>



</body>
</html>