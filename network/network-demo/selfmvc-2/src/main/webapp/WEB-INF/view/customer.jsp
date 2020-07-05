<%--
  Created by IntelliJ IDEA.
  User: meijunjie
  Date: 2020/7/2
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>
    <h1>创建客户界面</h1>
    <%--TODO--%>
    <table>
        <tr>
            <th>客户名称</th>
            <th>客户年龄</th>
            <th>客户邮箱</th>
            <th>客户积分</th>
        </tr>

        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.age}</td>
                <td>${customer.email}</td>
                <td>${customer.score}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
