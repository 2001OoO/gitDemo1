<%--
  Created by IntelliJ IDEA.
  User: Niu Kai
  Date: 2023/3/22
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
  <form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    爱好：
    <input type="checkbox" name="hobby" value="玩游戏">玩游戏
    <input type="checkbox" name="hobby" value="打篮球">打篮球
    <input type="checkbox" name="hobby" value="游泳">游泳
    <input type="checkbox" name="hobby" value="吃饭">吃饭
    <br>
    <input type="submit">
  </form>
</div>


</body>
</html>
