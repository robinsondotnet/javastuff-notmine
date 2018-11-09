<%-- 
    Document   : sistema
    Created on : 27-sep-2018, 22:31:04
    Author     : Alumno
--%>
<% String correo = (String) request.getSession().getAttribute("correo");%>
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
                <h3>Bievenido : <%=correo%></h3>
                
                <h2>Selecciona la opción del sistema</h2>
                <div class ="row">
                    <div class="col-lg-4">
               <%-- Sacado de página de bootstrap --%>
              <div class="alert alert-primary" role="alert">
                  <a href="<%=request.getContextPath()%>/controladorcliente.do" style="text-decoration:none;">Mantenimiento de clientes</a>
             </div>
              <div class="alert alert-primary" role="alert">
                  <a href="">Mantenimiento de usuarios</a>
             </div>
              
               </div>
               </div>
            </section>   
           <%@include  file="WEB-INF/jspf/footer.jspf"%> 
        </div>        
    <%@include  file="WEB-INF/jspf/js.jspf"%>
    </body>
</html>