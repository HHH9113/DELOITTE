<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<%String username =(String)session.getAttribute("username");
String option =(String)session.getAttribute("option");
String option2 =(String)session.getAttribute("option2");
int sum=0;
String option3 =(String)session.getAttribute("option3");%>
<%=username + " " + "below is your scores"%>

<table cellspacing="5" cellpadding="10" border="2">
<tr>

<th>CORRECT Ans</th>
<th>YOUR Ans</th>
<th>MARKS</th>
<tr>
<td><%=option %></td>
<td>Super</td>
<td>
<%if(option.equals("Super"))
{
	sum+=10;
	out.println("10");
}
else
{
	out.println("0");
}
	
	%>
	</td>
	</tr>
<tr>
<td><%=option2 %></td>
<td>Final</td>
<td>
<%if(option2.equals("Final"))
{
	sum+=10;
	out.println("10");
}
else
{
	out.println("0");
}
	
	%>
</td></tr>
<tr>
<td><%=option3 %></td>
<td>Abstraction</td>
<td>
<%if(option3.equals("Abstraction"))
{
	sum+=10;
	out.println("10");
}
else
{
	out.println("0");
}
	
	%>
</td>
</tr>



<tr>
<td>Total Marks</td>
<td></td>
<td><%=sum%></td>
</tr>

</table>

</body>
</html>