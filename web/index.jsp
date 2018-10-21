<%--
  Created by IntelliJ IDEA.
  User: Zver
  Date: 20.10.2018
  domain.Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
  <head>
    <title>MyConverter</title>
  </head>
  <body>
  <%--<pre><c:import url="1.txt"/></pre>--%>
  <form action="conv" name="convForm">
    <input type="text" value="" name="field" >
    <input type="submit" name="submit" value="Press">
  </form>
  <form name="output">
      <input type="hidden" name="result" value="">
  </form>
  ${result}
  </body>
</html>
