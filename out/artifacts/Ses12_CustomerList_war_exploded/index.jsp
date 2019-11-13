<%--
  Created by IntelliJ IDEA.
  User: ThinkKING
  Date: 11/13/2019
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>models.Customer List</title>
</head>
<body>

<table>
    <tr>
        <td>Tên</td>
        <td>Ngày sinh</td>
        <td>Địa chỉ</td>
        <td>Ảnh</td>
    </tr>

    <c:forEach items="${customers}" var="customer">

        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getDateOfBirth()}</td>
            <td>${customer.getAddress()}</td>
            <td>
              <img src="${customer.getImage()}" height="100" width="100">
            </td>
        </tr>


    </c:forEach>

</table>
</body>
</html>
