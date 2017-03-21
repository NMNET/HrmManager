<%--
  Created by IntelliJ IDEA.
  User: NMNET
  Date: 2017/3/21 0021
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<c:set var="test" scope="session" value="${pageContext.request.contextPath}"/>
<c:out value="${test}"/>
</body>
</html>
