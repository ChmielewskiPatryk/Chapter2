<%--W projekcie stwórz servlet Mvc13 dostępny pod adresem /mvc13.--%>

<%--W widoku jsp3.jsp stwórz formularz zawierający pola o nazwach: title, author i isbn.
 Formularz ma przesłać dane metodą POST do tego samego servletu (do metody doPost).--%>
<%--Stwórz klasę Book zawierającą pola zgodne z polami wcześniej utworzonego formularza.--%>
<%--Odbierz dane i na ich podstawie stwórz obiekt klasy Book.--%>
<%--Przekaż obiekt do widoku result.jsp.--%>
<%--Wyświetl właściwości nowo dodanego obiektu: title, author, isbn.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="Mvc13">
    <label>
        Title:
        <input type="text" name="title">
    </label>
    <label>
        Author:
        <input type="text" name="author">
    </label>
    <label>
        ISBN:
        <input type="text" name="isbn">
    </label>
    <input type="submit">
</form>

</body>
</html>
