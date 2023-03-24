<%--
  Created by IntelliJ IDEA.
  User: N_k
  Date: 2023/3/23
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--内置对象--%>
<%
  pageContext.setAttribute("name1","朵子");
  request.setAttribute("name2","朵子2号");
  session.setAttribute("name3","朵子3号");
  application.setAttribute("name4","朵子4号");
%>

<%
  String name1 = pageContext.findAttribute("name1").toString();
  String name2 = pageContext.findAttribute("name2").toString();
  String name3 = pageContext.findAttribute("name3").toString();
  String name4 = pageContext.findAttribute("name4").toString();
  String name5 = (String) pageContext.findAttribute("name5");
%>

<h1>取出的值：</h1>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=name5%></h3>

</body>
</html>
