<%--W projekcie stwórz servlet Mvc14 dostępny pod adresem /mvc14.--%>

<%--W metodzie doGet utwórz listę obiektów klasy Book: List<Book>.--%>
<%--Dodaj kilka dowolnych obiektów do listy, a następnie przekaż do widoku resultList.jsp.--%>
<%--W pętli wyświetl właściwości wszystkich obiektów title, author, isbn.--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${books}" var="book">
    <p>${book.title}</p>
    <p>${book.author}</p>
    <p>${book.isbn}</p>
</c:forEach>

</body>
</html>
