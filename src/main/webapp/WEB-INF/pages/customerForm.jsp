<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>	
<h2>Customer Form</h2>
<mvc:form modelAttribute="customer" action="result.mvc">
	<table>
	    <tr>
            <td><mvc:label path="firstName">First Name</mvc:label></td>
            <td><mvc:input path="firstName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="lastName">Last Name</mvc:label></td>
	        <td><mvc:input path="lastName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="phoneNmbr">Phone Number</mvc:label></td>
	        <td><mvc:input path="phoneNmbr" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="address">Street Address</mvc:label></td>
	        <td><mvc:textarea path="address" /></td>
	    </tr>
   	    <tr>
	        <td><mvc:label path="city">City</mvc:label></td>
	        <td><mvc:input path="city" /></td>
	    </tr>
		<tr>
            <td><mvc:label path="state">State</mvc:label></td>
            <td><mvc:input path="state" /></td>
        </tr>
        <tr>
            <td><mvc:label path="zip">Zip Code</mvc:label></td>
            <td><mvc:input path="zip" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Customers</a>
</body>
</html>