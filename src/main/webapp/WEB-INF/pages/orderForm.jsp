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
<h2>Order Form</h2>
<mvc:form modelAttribute="order" action="orderResult.mvc">
	<table>
	    <tr>
            <td><mvc:label path="custId">Customer ID</mvc:label></td>
            <td><mvc:input path="custId" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="dogFoodId">Dog Food ID</mvc:label></td>
	        <td><mvc:input path="dogFoodId" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="quantity">Quantity</mvc:label></td>
	        <td><mvc:input path="quantity" /></td>
	    </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAllOrders.mvc">View all Orders</a>
</body>
</html>