<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 14/12/2022
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<!-- ACA VA EL NAVBAR  -->
<%@include file="navbar.jsp" %>
<div class="container">
    <section>
        <h1>Alta</h1>
        <!--  JSP -->
<form method="post"  action="<%=request.getContextPath()%>/CreateController">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">idPersona</label>
        <input name="idPersona"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="idPersona" maxlength="50">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">nombre</label>
        <input name="nombre" type="text" class="form-control" id="exampleFormControlTextarea1">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">apellido</label>
        <input name="apellido" type="text" class="form-control" id="exampleFormControlTextarea2">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">edad</label>
        <input name="edad" type="number" class="form-control" id="exampleFormControlInput2" maxlength="7">
    </div>
    <button class="btn btn-primary">
        Dar de alta
    </button>

</form>
</body>
</html>

