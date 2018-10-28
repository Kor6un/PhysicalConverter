<%--
  Created by IntelliJ IDEA.
  User: Zver
  Date: 20.10.2018
  domain.service_models.Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ page import="static utils.constants.Constants.KMH" %>
<%@ page import="static utils.constants.Constants.MPH" %>
<%@ page import="static utils.constants.Constants.KN" %>
<%@ page import="static utils.constants.Constants.*" %>
<html>
  <head>
    <title>MyConverter</title>
  </head>
  <body>
  <%@include file="jsp/header.jsp"%>

  <%--<pre><c:import url="1.txt"/></pre>--%>
  <form action="conv" name="convForm">
    <input type="text" value="${field}" name="field" >
      <select name="from">
          <option value="<%=KMH%>"><%=KMH%></option>
          <option value="<%=MPH%>"><%=MPH%></option>
          <option value="<%=KN%>"><%=KN%></option>
          <option value="<%=MS%>"><%=MS%></option>
      </select>
      to
      <select name="to">
          <option value="<%=KMH%>"><%=KMH%></option>
          <option value="<%=MPH%>"><%=MPH%></option>
          <option value="<%=KN%>"><%=KN%></option>
          <option value="<%=MS%>"><%=MS%></option>
      </select>

      <input type="text" value="${result}" name="out" >
      <input type="submit" name="submit" value="Press">
  </form>
  <form name="output">
      <input type="hidden" name="result" value="">
  </form>
  </body>
</html>
