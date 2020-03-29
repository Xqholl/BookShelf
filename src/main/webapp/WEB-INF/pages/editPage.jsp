<%--
  Created by IntelliJ IDEA.
  User: Alena
  Date: 26.03.2020
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty book.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty book.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty book.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty book.title}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty book.title}">
        <input type="hidden" name="id" value="${book.id}">
    </c:if>
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <label for="author">Author</label>
    <input type="text" name="author" id="author">
    <label for="genre">Genre</label>
    <input type="text" name="genre" id="genre">
    <label for="read">Read</label>
    <input type="text" name="read" id="read">
    <c:if test="${empty book.title}">
        <input type="submit" value="Add new book">
    </c:if>
    <c:if test="${!empty book.title}">
        <input type="submit" value="Edit book">
    </c:if>
</form>

</body>
</html>
