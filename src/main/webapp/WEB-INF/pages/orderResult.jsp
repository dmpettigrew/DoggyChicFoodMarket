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
<body> <h2>Order Result</h2>
    <table>
        <tr>
            <td>Customer ID</td>
            <td>${o.custId}</td>
        </tr>
        <tr>
            <td>Dog Food ID</td>
            <td>${o.dogFoodId}</td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td>${o.quantity}</td>
        </tr>
        </table>
<a href = "viewAllOrders.mvc">View all Orders</a>
<a href="orderForm.mvc">Place another Order</a>
<a href = "editOrder.mvc">Edit an Order</a>
<a href = "deleteOrder.mvc">Delete an Order</a>
<a href="orderForm.mvc">Admin Options</a>
</body>
</html>