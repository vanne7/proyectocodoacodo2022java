<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 28/12/2022
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> JSP- HELLO world</title>
    <%@include file="head.jsp" %>
</head>

<body>
<!-- ACA VA EL NAVBAR  -->
<%@include file="navbar.jsp" %>
<main>
    <h1> <%= "listado estudiantes" %></h1>
    <a href ="AdministratorConnexions">Hello servlet</a>
    <div class="container">
        <section>
            <h1>listado de estudiantes </h1>
        </section>
    </div>
</main>
</body>
</html>
