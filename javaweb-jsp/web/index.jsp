<%--
  Created by IntelliJ IDEA.
  User: Niu Kai
  Date: 2023/3/23
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ page errorPage="page/hello.jsp" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%@include file="common/header.jsp"%>

  <%= new java.util.Date()%>


  <%
    out.write("<br>小东西去shi");
  %>

  <%
    int i=1;
//    i=i/0;
    for (i = 0; i < 5; i++) {
  %>

<%--  <h4>小傻逼 <%=i%></h4>--%>
<%--  EL表达式--%>
  <h4>小傻逼 ${i}</h4>

  <%
    }
  %>

  <%!
    static {
      System.out.println("进入全局代码块");
    }
  %>

  <%@include file="common/footer.jsp"%>



<%--  Jsp标签--%>
  <hr>
  <jsp:include page="/common/header.jsp"></jsp:include>

  <h4>傻屌</h4>

  <jsp:include page="/common/footer.jsp"></jsp:include>


  </body>
</html>
