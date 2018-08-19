<%@ page import="java.util.List" %>
<%@ page import="edu.hebut.model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2018/8/17
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>客户列表</title>
</head>
<body>
<jsp:include page="/common/header.jsp" />
<div style="align-content: center">
    <table>
        <thead>
        <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>描述</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.customerList}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.gender}"/></td>
            <td><c:out value="${customer.phone}"/></td>
            <td><c:out value="${customer.email}"/></td>
            <c:choose>
                <c:when test="${customer.description} == null">
                    <td><c:out value="${customer.description}"/></td>
                </c:when>
                <c:otherwise>
                    <td>无</td>
                </c:otherwise>
            </c:choose>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
