<%--
  Created by IntelliJ IDEA.
  User: imac
  Date: 26/10/2022
  Time: 08:13
  To change this template use File | Settings | File Templates.
--%>
<%--W dowolnym servlecie utwórz ciasteczko o nazwie foo oraz wartości bar.--%>
<%--W pliku fourth.jsp wyświetl wartość utworzonego ciasteczka.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${cookie.test.value}
</body>
</html>
