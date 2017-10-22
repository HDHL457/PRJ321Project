<%-- 
    Document   : AddCart
    Created on : Sep 25, 2017, 7:59:44 AM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="task" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <task:choose>
            <task:when test="${empty sessionScope.Cart.cartItems}">
                <h3>EMPTY CART</h3>
                <hr/>
                <p>Your shopping cart is empty</p>
                <p>Click <a href="Product.jsp">here</a> to buy an item</p>
            </task:when>
            <task:otherwise>
                <h3>SHOPPING CART</h3>
                <hr/>
                <table border ="1" cellspacing="0">
                    <tr>
                        <th></th>
                        <th>Product Name</th>
                        <th>Unit Price</th>
                        <th>Quantity</th>
                        <th>Amount</th>
                    </tr>
                    <task:forEach var="item" items="${sessionScope.Cart.cartItems}">
                        <tr>
                            <td><img src="${item.imagePath}" width="40" height="40" alt="${item.name}"/></td>
                            <td>${item.name}</td>   <!--Chỗ này để link đến trang thông tin sản phẩm-->
                            <td>${item.price}</td>
                            <td><input type="text" width="15" value="${item.quantity}" 
                               onblur="validateQuantity(${item.id})" 
                               id="txtQuantity${item.id}"/></td> 
                            <!--khi người dùng bỏ focus khỏi chỗ nhập quantity thì hàm validateQuantity sẽ được gọi. 
                            Nếu không phải là 1 số thì số lượng sẽ về 0-->
                            <td><span id="cart-price" name="cart">${item.price * item.quantity} </span></td>

                            <task:url var="Update" value="Update">
                                <task:param name="id" value="${item.id}"/>
                                <task:param name="type" value="delete"/>    
                            </task:url>
                            <td><a href="${Update}">Delete</a></td>     <!--Chỗ này để hình cái thùng rác-->
                        </tr>
                    </task:forEach>
                    <tr>
                        <td>Total payments</td>
                        <td colspan="4" align="right">${sessionScope.Cart.amount}</td>
                    </tr>
                </table>
                <p>Continue buying, click <a href="Product.jsp">here</a></p>
                <p>Check out your shopping cart click <a href="Checkout.jsp">here</a></p>
            </task:otherwise>
        </task:choose>
    </body>
</html>

<script type="text/javascript">
    function validateQuantity(id) {
        var quantity = document.getElementById("txtQuantity" + id);
        var number;
        if (quantity.value.match(/^\d+$/)) {  //is a integer
            number = parseInt(quantity.value);
        } else {
//            quantity = 0;
            number = 1;
            quantity.value = 1;
        }
        var pathUrl = window.location.pathname.toString().substring(0, window.location.pathname.toString().lastIndexOf("/"));
        window.location.assign(pathUrl + "/Update?id=" + id + "&type=update&quantity=" + number);

    }
</script>