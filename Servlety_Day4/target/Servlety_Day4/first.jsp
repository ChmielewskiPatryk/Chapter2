<%--
  Created by IntelliJ IDEA.
  User: imac
  Date: 26/10/2022
  Time: 08:10
  To change this template use File | Settings | File Templates.
--%>
<%--//za pomocą EL wyświetl zawartość parametru o nazwie km, który będzie wpisywany jako parametr w pasku adresu,--%>
<%--przelicz ile to mil (1km = 0.62 mili), a następnie wyświetl wartość--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${param.el}</h1>
<h1>Wartość w miliach: ${param.el*0.62}</h1>
<%-- ${param.el} --%>
</body>
</html>
