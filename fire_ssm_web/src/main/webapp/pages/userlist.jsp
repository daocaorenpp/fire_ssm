<%--
  Created by IntelliJ IDEA.
  User: wangj
  Date: 2019/6/15
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>登录名</td>
            <td>密码</td>
            <td>昵称</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.loginname}</td>
                <td>${user.password}</td>
                <td>${user.nickname}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
