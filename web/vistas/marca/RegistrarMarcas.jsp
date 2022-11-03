<%-- 
    Document   : RegistrarMarcas
    Created on : 22/10/2018, 11:19:47 AM
    Author     : lfern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%String context = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=context%>/css/bootstrap.css" rel="stylesheet">

        <script type="text/javascript" src="<%=context%>/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="<%=context%>/js/bootstrap.bundle.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DULCERIA</h1>
        <form action="registrarMarca" method="post">
            <div class="form-group">
                <label for="nombreMarca">Nombre marca:</label>
                <input type="text" class="form-group" id="nombreMarca" name="bean.nombreMarca" placeholder=""/>
            </div>
            <div class="form-group">
                <label for="telefono">Telefono</label>
                <input type="number" class="form-group" id="telefono" name="bean.telefono" placeholder=""/>
            </div>
            <div class="form-group">
                <label for="direccion">Direccion</label>
                <input type="text" class="form-group" id="direccion" name="bean.direccion" placeholder=""/>
            </div>
            <div class="form-group">
                <label for="correo">correo</label>
                <input type="text" class="form-group" id="correo" name="bean.correo" placeholder=""/>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-success" value="Guardar">
            </div>
        </form>
    </body>
</html>
