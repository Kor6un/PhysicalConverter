<%--
  Created by IntelliJ IDEA.
  User: Zver
  Date: 28.10.2018
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<head>
    <%--<script type="text/javascript" src="content/js/scripts.js"></script>--%>
    <title>Login</title>
</head>
<body>
<c:if test="${error!=null}">
    <p style ="color: red">${error}</p>
</c:if>
    <h1>Login: </h1>
    <form action="log" name="loginForm">
        <input type="text" name="login" placeholder="login">
        <input type="text" name="password" placeholder="password">
       <p><input type="submit" value="login" <%--onclick="buttonClick('loginForm')"--%>></p>
    </form>
</body>
</html>
