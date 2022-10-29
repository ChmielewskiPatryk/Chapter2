<%--
  Created by IntelliJ IDEA.
  User: imac
  Date: 26/10/2022
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="2" end="10" step="2" var="sample">
  ${sample}
</c:forEach>

</body>
</html>
