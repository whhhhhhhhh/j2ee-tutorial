<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2018/8/19
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="/common/header.jsp" />
<form method="post" action="/uploadFile" enctype="multipart/form-data">
    选择一个文件:
    <input type="file" name="file" />
    <br/><br/>
    <input type="submit" value="上传" />
</form>
</body>
</html>
