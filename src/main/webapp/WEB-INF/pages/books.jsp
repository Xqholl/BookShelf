<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alena
  Date: 26.03.2020
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BOOKS</title>
</head>
<body>
<h2>Books</h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>author</th>
        <th>genre</th>
        <th>read</th>
        <th>action</th>
    </tr>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.genre}</td>
            <td>${book.read}</td>
            <td>
                <a href="/edit/${book.id}">edit</a>
                <a href="/delete/${book.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value= "http://localhost:8080/add" var="add"/>
<a href="${add}">Add new book</a>
<a href="/edit/${book.id}">edit</a>
</body>
</html>
