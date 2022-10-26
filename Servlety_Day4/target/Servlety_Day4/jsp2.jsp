<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--W projekcie stwórz servlet Mvc12 dostępny pod adresem /mvc12 ,
który wczyta dwie zmienne GET : start i end . Następnie:--%>

<%--W servlecie zwiększ obie wartości o wartość 10, przekaż zwiększone zmienne do widoku jsp2.jsp.--%>
<%--W widoku wyświetl wszystkie liczby od start do end.--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="${start}" end="${end}" var="sample">
    ${sample}
</c:forEach>
</body>
</html>
