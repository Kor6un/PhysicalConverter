<%--
  Created by IntelliJ IDEA.
  User: Zver
  Date: 28.10.2018
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>
</head>
<body>
    <table>
        <tr>
            <th>User:
                <c:choose>
                    <c:when test="${user != null}">${user.login}</c:when>
                    <c:otherwise>guest</c:otherwise>
                </c:choose>

            </th>
            <td><a href="/jsp/login.jsp" <c:if test="${user != null}">hidden</c:if>>Log in</a></td>
            <td><a href="/jsp/register.jsp" <c:if test="${user != null}">hidden</c:if>>Register</a></td>
            <td><a href="logout" <c:if test="${user == null}" >hidden</c:if>>log out</a></td>
        </tr>
    </table>
</body>
</html>
