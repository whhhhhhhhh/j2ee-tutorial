<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2018/8/17
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/login" method="post">
        <label>
            用户名：
            <input type="text" name="username" />
        </label>
        <label>
            密码：
            <input type="password" name="password" />
        </label>
        <input type="submit" name="submit" value="登录" />
    </form>
</body>
</html>
