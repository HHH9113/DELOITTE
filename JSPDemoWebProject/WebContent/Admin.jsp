<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.Sum"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Welcome Admin
<% Sum sum = new Sum(); %>
<%= 



sum.addNumbers(11,12) %>






<%=session.getAttribute("cust") %>


</body>
</html>