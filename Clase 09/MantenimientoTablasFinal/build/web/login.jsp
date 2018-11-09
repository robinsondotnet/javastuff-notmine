<%-- 
    Document   : login
    Created on : 27-sep-2018, 22:06:39
    Author     : Alumno
--%>

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
                <div class="row"> 
                    <div class="col-lg-4"></div>
                    <div class="col-lg-4">
                        <form action="controladorlogin.do" method="post">
                            <div class="form-group">
                                <label for="correo">Email address</label>
                                <input type="email" class="form-control" name="txtCorreo" id="correo"  placeholder="Enter email" required="">
                                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                            </div>
                            <div class="form-group">
                                <label for="clave">Password</label>
                                <input type="password" class="form-control" id="clave" name="txtClave" placeholder="Password" required="">
                            </div>
          
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                        <div style="color: blue;"><a href="recuperar.jsp">¿Olvido su contraseña?</a></div>
                    </div>
                </div>
            </section>   
            <%@include  file="WEB-INF/jspf/footer.jspf"%> 
        </div>        
        <%@include  file="WEB-INF/jspf/js.jspf"%>
    </body>
</html>

