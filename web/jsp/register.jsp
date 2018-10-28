<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<head>
    <script type="text/javascript" src="content/js/scripts.js"></script>
    <title>Register</title>
</head>
<body>
<c:if test="${error != null}">
    <p style="color: red">${error}</p>
</c:if>
    <form action="reg" name="regForm" method="get">
        <input type="text" name="name" value="" placeholder="name">
        <input type="text" name="login" value="" placeholder="login">
        <input type="text" name="password" value="" placeholder="password">
        <input type="submit" value="registration"<%-- onclick="buttonClick('regForm')"--%>>
    </form>
</body>
</html>
