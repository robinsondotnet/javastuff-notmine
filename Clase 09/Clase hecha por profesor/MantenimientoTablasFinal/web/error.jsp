<%-- 
    Document   : error.jsp
    Created on : 27-sep-2018, 22:26:18
    Author     : Alumno
--%>
<% String error = (String) request.getSession().getAttribute("error");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include  file="WEB-INF/jspf/estilos.jspf"%>
        <title>Sistema Ventas</title>
    </head>
    <body>
        <div class="container-fluid">
           <%@include  file="WEB-INF/jspf/header.jspf"%>
           <%@include  file="WEB-INF/jspf/nav.jspf"%>
            <section>
                <h3>Error:<%=error %></h3>
            </section>   
           <%@include  file="WEB-INF/jspf/footer.jspf"%> 
        </div> 
        
    <%@include  file="WEB-INF/jspf/js.jspf"%>
    </body>
</html>