<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>Todays Date is <%out.println(new Date()); %></h1; >



<%String username=request.getParameter("username");
  
String color[]= request.getParameterValues("color");
  int selectedColor = color.length;%>



<% for(int i=0;i<selectedColor;i++)
{%>
	<font color =<%=color[i]%>> <%= "Hello" + username %></font></br>
	
	
	
	<% 
}
%>


<%@ include file='First.jsp'%>    


<jsp:include page="First.jsp"></jsp:include>



<%--<jsp:forward page="exercise1.html"></jsp:forward>

--%>
</body>
</html>