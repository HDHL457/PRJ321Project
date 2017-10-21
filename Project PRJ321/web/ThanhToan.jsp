<%-- 
    Document   : ThanhToan
    Created on : Oct 21, 2017, 6:59:26 PM
    Author     : KingDra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thanh Toán và Vận Chuyển</title>
    </head>
    <body>
        <form action="HoanThanh.jsp">
            <div class="address">
                <table border="1" cellspacing="0">
                    <tr style="background-color: red">
                        <th><h4>1. ĐỊA CHỈ THANH TOÁN VÀ GIAO HÀNG</h4></th>
                    </tr>
                    <tr>
                        <td>
                            <h5>THÔNG TIN THANH TOÁN</h5>
                            <p>
                                <strong>Người nhận : </strong> 
                                <input type="text" name="txtUserName" value="" />
                            </p>
                            <p>
                                <strong>Điện thoại : </strong>
                                <input type="number" name="txtPhone" pattern="^[0-9]" value="" placeholder="Số điện thoại" />
                            </p>
                            <p>
                                <strong>Email : </strong>
                                <input type="email" name="txtEmail" value="" />
                            </p>
                            <p>
                                <strong>Địa chỉ : </strong>
                                <input type="text" name="txtAddress" value="" />
                            </p>
                            <p>
                                <strong>Quận/Huyện : </strong>
                                <input type="text" name="txtAddress1" value="" />
                            </p>
                            <p>
                                <strong>Thành Phố : </strong>
                                <input type="text" name="txtCity" value="" />
                            </p>
                            <p>
                                <textarea rows="5" cols="40" name="txtNote" form="usrform" placeholder="Ghi Chu"></textarea>
                            </p>
                            <p for="chk">
                                <input type="checkbox" id="chk" value="" />
                                Giao hàng tại địa chỉ khác?
                            </p>
                            <div id="dvAdd" style="display: none">
                                <p>
                                    <strong>Địa chỉ : </strong>
                                    <input type="text" name="txtAddress" value="" />
                                </p>
                                <p>
                                    <strong>Quận/Huyện : </strong>
                                    <input type="text" name="txtAddress1" value="" />
                                </p>
                                <p>
                                    <strong>Thành Phố : </strong>
                                    <input type="text" name="txtCity" value="" />
                                </p>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="address">
                <table border="1" cellspacing="0">
                    <tr style="background-color: red">
                        <th><h4>2. THANH TOÁN VÀ VẬN CHUYỂN</h4></th>
                    </tr>
                    <tr>
                        <td>
                            <p style="color: red">THANH TOÁN</p>
                            <p>
                                <select>
                                    <option>Thanh toan khi nhan hang</option>
                                    <option>Thanh toan bang the</option>
                                </select>
                            </p>
                        </td>
                    </tr>
                </table>
            </div>
            <input type="submit" name="btnSubmit" value="Thanh Toan" />
        </form>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script type="text/javascript">
            $(function () {
                $("#chk").click(function () {
                    if ($(this).is(":checked")) {
                        $("#dvAdd").show();
                    } else {
                        $("#dvAdd").hide();
                    }
                });
            });
        </script>
    </body>
</html>
