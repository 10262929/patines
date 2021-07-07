<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css"><title>CRUD</title>
    </head>

    <body>
        <div class="container my-4 ">          
            <div class="card border-info">
                <div class="card-header bg-primary d-flex justify-content-center text-white ">

                    <a class="btn btn-light mx-2" href="agregar.htm"> Nueva Patineta</a>
                    <h4>Listado de usuarios y sus patinetas</h4>
                    <a href="index.jsp"></a>

                </div>
                <div class="card-body">
                    <table id="listarPatinetas"  class=" table table-hover  ">
                        <thead class="bg-dark text-white">
                            <tr class="text-center">
                                <th>Id</th>
                                <th>nombre usuario</th>
                                <th>apellidos usuarios</th>
                                <th>codigo Patineta</th>
                                <th>color Patineta</th>
                                <th>descripcion Patineta</th>
                                <th>Acciones</th>

                            </tr>
                        </thead>
                        <tbody class="text-center">
                            <c:forEach var="dato" items="${lista}">
                                <tr class="table-secondary">
                                    <td>${dato.id}</td>
                                    <td>${dato.nombre_usuario}</td>
                                    <td>${dato.apellidos_usuarios}</td>
                                    <td>${dato.codigoPatineta}</td>
                                    <td>${dato.colorPatineta}</td>
                                    <td>${dato.descripcionPatineta}</td>
                                    <td>
                                        <a href="editar.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                                        <a href="eliminar.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                                    </td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>

    </body>
    <script>
        $(document).ready(function () {
            $('#listarPatinetas').DataTable();
        });
    </script>


</html>
