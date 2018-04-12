<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Customer Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${c.firstName}</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>${c.lastName}</td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td>${c.phoneNmbr}</td>
        </tr>
        <tr>
            <td>Street Address</td>
            <td>${c.address}</td>
        </tr>
        <tr>
            <td>City</td>
            <td>${c.city}</td>
        </tr>
        <tr>
            <td>State</td>
            <td>${c.state}</td>
        </tr>
        <tr>
            <td>Zip Code</td>
            <td>${c.zip}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View all Customers</a>
<a href="form.mvc">Add a new Customer</a>
<a href = "editCustomer.mvc">Edit a Customer</a>
<a href = "deleteCustomer.mvc">Delete a Customers</a>
<a href="orderForm.mvc">Place an Order</a>
</body>
</html>