<%--
  Created by IntelliJ IDEA.
  User: imac
  Date: 26/10/2022
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:out value="${book.title}" default="Missing title"/>
<c:out value="${book.author}"  default="Missing author"/>
<c:out value="${book.isbn}" default="Missing isbn"/>
</body>
</html>
