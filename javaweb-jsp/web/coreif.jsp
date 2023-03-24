<%--
  Created by IntelliJ IDEA.
  User: N_k
  Date: 2023/3/24
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>

<%--jakarta jsp jstl库依赖有问题----未解决--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入JSTL核心标签库--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>if测试</h4>
<hr>

<form action="coreif.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>




</body>
</html>
