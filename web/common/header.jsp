<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2018/8/18
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="width: 100%">
        <table border="1">
                <tr>
                    <td><a href="<c:url value="/addCustomer" />">添加客户</a></td>
                    <td><a href="<c:url value="/searchCustomer" />">查询客户</a></td>
                    <td><a href="<c:url value="/advancedSearch" />">高级查询</a></td>
                    <td><a href="<c:url value="/uploadFile" />">文件上传</a></td>
                    <td><a href="<c:url value="/exit" />">退出</a></td>
                </tr>
        </table>
    </div>
</body>
</html>