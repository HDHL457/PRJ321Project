<%-- 
    Document   : HoanThanh
    Created on : Oct 21, 2017, 7:56:33 PM
    Author     : KingDra
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hoan Thanh</title>
    </head>
    <body>
        <div>
            <h1>Mã đơn hàng của bạn : </h1>
            <p>
                <strong>Ngày đặt :</strong>
                <%! Date today = new Date();%>
                <fmt:formatDate pattern="yyyy/MM/dd" value="<%=today%>" />
            </p>
            <p>
                <strong>Phương thức thanh toán: </strong>
            </p>
            <p>
                <h1>Thông tin đơn hàng</h1>
                <table></table>
            </p>
        </div>
    </body>
</html>
