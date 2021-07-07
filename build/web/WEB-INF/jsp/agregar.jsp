<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>    
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">      
        <title>CRUD-agregar</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar nueva patineta</h4>
                </div>
                <div class="card-body ">
                    <form:form commandName="formAddPatineta" method="POST">

                       
                        <form:label path="nombre" >Nombres</form:label>
                        <form:input path="nombre" cssClass="form-control"></form:input><br><br>
                        <form:errors path="nombre" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="apellidos" >Apellidos</form:label>
                        <form:input path="apellidos"  cssClass="form-control"></form:input><br><br>
                        <form:errors path="apellidos" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="codigoPatin" >Codigo patineta</form:label>
                        <form:input path="codigoPatin"  cssClass="form-control"></form:input><br><br>
                        <form:errors path="codigoPatin" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="color" >color patineta</form:label>
                        <form:input path="color"  cssClass="form-control"></form:input><br><br>
                        <form:errors path="color" element="div" cssClass="alert alert-danger" />
                        
                         <form:label path="Descripcion" >Descripcion</form:label>
                        <form:input path="Descripcion"  cssClass="form-control"></form:input><br><br>
                        <form:errors path="Descripcion" element="div" cssClass="alert alert-danger" />
                        <form:button name="enviar" Class="btn btn-primary">Agregar</form:button>
                            <a href="index.htm" Class="btn btn-warning">Regesar</a>
                    </form:form>

                </div>
            </div>
        </div>

    </body>
</html>
