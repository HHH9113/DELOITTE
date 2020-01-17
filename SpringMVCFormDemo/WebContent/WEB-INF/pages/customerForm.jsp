

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@  taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer login form</title>
<script type="text/javascript">
	function validate() {
var customerId = document.getElementById("customerId").value
		
		
var customerName = document.getElementById("customerName").value
		var customerAddress = document.getElementById("customerAddress").value
		var billAmount = document.getElementById("billAmount").value
var errorCustomerId = document.getElementById("errorCustomerId")
var errorCustomerName = document.getElementById("errorCustomerName")
		var errorCustomerAddress = document
				.getElementById("errorCustomerAddress")
		var errorbillAmount = document.getElementById("errorbillAmount")

if (customerId == 0 || customerId.length < 5 || customerId.length > 5) {
	errorCustomerId.innerHTML = "<font color='red'>Invalid CustomerID, Must have be of 5 characters"
} else
{			errorCustomerId.innerHTML = ""

			
	
			
		if (customerName.length == 0) {
			errorCustomerName.innerHTML = "<font color='red'>Invalid Customer Name"
		} else
		{		errorCustomerName.innerHTML = ""

				if (customerAddress == "Pune" || customerAddress == "Mumbai"|| customerAddress == "Delhi") {
					errorCustomerAddress.innerHTML = ""
				} else if (customerAddress == 0) {
					errorCustomerAddress.innerHTML = "<font color='red'>Enter the city"
				} else
				{			errorCustomerAddress.innerHTML = "<font color='red'>Invalid City"

			
			
		if (billAmount <= 0 || billAmount == null) {
			errorbillAmount.innerHTML = "<font color='red'>Invalid Bill Amount"
		} else
			errorbillAmount.innerHTML = ""

}	}}}
</script>
</head>
<body>
	<f:form action="customerSave.do" >
		<h2>Customer Login form</h2>
		<table cellspacing="10" cellpadding="10" border="1" align="center">
			<caption>Login Form</caption>
			<tr>
				<td>Customer ID:</td>
				<td><f:input path="customerId" name="customerId" id="customerId" /></td>
				<td><span id="errorCustomerId"></span></td>
			</tr>
			<tr>
			<tr>
				<td>Customer Name:</td>
				<td><f:input path="customerName" name="customerName" id="customerName" /></td>
				<td><span id="errorCustomerName"></span></td>
			</tr>
			<tr>
				<td>Customer Address:</td>
				<td><f:input path="customerAddress" name="customerAddress"
					id="customerAddress" /></td>
				<td><span id="errorCustomerAddress"></span></td>
			</tr>
			<tr>
				<td>Bill Amount:</td>
				<td><f:input path="billAmount" name="billAmount" id="billAmount" /></td>
				<td><span id="errorbillAmount"></span></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="Submit"  id="submit" onsubmit="validate()"/></td>
			    <td align="center"><input type="submit" value="Update" formaction="updateCustomer.do" onsubmit="validate()" />				
				<td align="center"><input type="submit" value="Fetch" formaction="fetchCustomer.do" />				
				<td align="center"><input type="reset" id="reset" /></td>
			</tr>
			
		</table>
	</f:form>
</body>
</html>