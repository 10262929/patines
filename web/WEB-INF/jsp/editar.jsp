<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

        <title>CRUD-editar</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar nuevo registro</h4>
                </div>
                <div class="card-body ">
                    <form:form  method="POST" commandName="listar">
                        <form:label path="Id">Id</form:label><br>
                        <form:input path="Id" cssClass="form-control" disabled="true" ></form:input>
                        <form:errors path="Id" element="div" cssClass="alert alert-danger" />
                        
                        <form:label path="nombre">Nombres</form:label><br>
                        <form:input path="nombre"   cssClass="form-control" ></form:input>
                        <form:errors path="nombre" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="apellidos">apellidos</form:label><br>
                        <form:input path="apellidos" cssClass="form-control"  ></form:input>
                        <form:errors path="apellidos" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="codigoPatin">codigo patineta</form:label><br>
                        <form:input path="codigoPatin" cssClass="form-control"  ></form:input>
                        <form:errors path="codigoPatin" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="color">color</form:label><br>
                        <form:input path="color" cssClass="form-control"  ></form:input>
                        <form:errors path="color" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="descripcion">descripcion</form:label><br>
                        <form:input path="descripcion" cssClass="form-control"  ></form:input>
                        <form:errors path="descripcion" element="div" cssClass="alert alert-danger" />
                        <form:button name="btnActualizar" class=" mt-1 btn btn-success">Actualizar</form:button>
                        <a class=" mt-1 btn btn-warning" href="index.htm">Regresar</a>
                    </form:form>
                        
                </div>
            </div>
        </div>
    </body>
</html>
