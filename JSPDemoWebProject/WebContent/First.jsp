<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num1; %>

<%

String name= "Himanshu";
int num2=10;
for(int i=0;i<=5;i++)
{
	out.println("<h1>My name is</h1> " + name);
	
     
}
%>
<%="Welcome" + name%>

<h1>hello</h1>

sum of num1+num2 : <%= num1=num2 %>
<%
for(int i=0;i<=0;i++)
{
	out.println(new java.util.Date());}
%>
<% out.println("Hello" + (90+90)); %>

</body>
</html>