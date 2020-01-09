<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="/WEB-INF/tlds/mytag.tld" prefix="pooja" %>    

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach begin="1" end ="5" step="1">

</c:forEach>



<pooja:deladd></pooja:deladd>

<pooja:NameTag nameToPrint="Bhawna" noOfTimes="2"></pooja:NameTag>
<pooja:NameTag nameToPrint="Himanshu" noOfTimes="5"></pooja:NameTag>
<pooja:NameTag nameToPrint="satya" noOfTimes="1"></pooja:NameTag>

</body>
</html>