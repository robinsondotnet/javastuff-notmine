<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : list
    Created on : 25-oct-2018, 20:29:27
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include  file="../WEB-INF/jspf/estilos.jspf"%>
        <title>Sistema Ventas</title>
    </head>
    <body>
        <div class="container-fluid">
            <%@include  file="../WEB-INF/jspf/header.jspf"%>
            <%@include  file="../WEB-INF/jspf/nav.jspf"%>
            <section>
                <div class="row"> 
                    <div class="col-lg-1"></div>
                    <div class="col-lg-10">
                        <table border="1" class="table table-bordered table-hover">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Correo</th>
                                    <th>DNI</th>
                                    <th><i class="fas fa-binoculars"></i>&nbsp;Ver detalle</th>
                                    <th><i class="fas fa-edit"></i>&nbsp;Actualizar</th>
                                    <th><i class="fas fa-user-times"></i>&nbsp;Eliminar</th>
                                </tr>
                            </thead>
                            <tfoot>
                                <tr>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Correo</th>
                                    <th>DNI</th>
                                    <th>Ver detalle</th>
                                    <th>Actualizar</th>
                                    <th>Eliminar</th>
                                </tr>
                            </tfoot>
                            <tbody>
                                <c:forEach var="clientes" items="${sessionScope.Lista}">
                                    <tr>
                                        <td>${clientes.id}</td>
                                        <td>${clientes.nombre}</td>
                                        <td>${clientes.apellidoPat}</td>
                                        <td>${clientes.correo}</td>
                                        <td>${clientes.dni}</td>
                                        <td><a href="#" class="btn btn-primary  active" role="button" aria-pressed="true"><i class="fas fa-binoculars"></i></a></td>
                                        <td><a href="#" class="btn btn-success active" role="button" aria-pressed="true"><i class="fas fa-edit"></i></a></td>
                                        <td><a href="#" class="btn btn-danger active" role="button" aria-pressed="true"><i class="fas fa-user-times"></i></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>


                    </div>
                </div>
            </section>   
            <%@include  file="../WEB-INF/jspf/footer.jspf"%> 
        </div>        
        <%@include  file="../WEB-INF/jspf/js.jspf"%>
    </body>
</html>

