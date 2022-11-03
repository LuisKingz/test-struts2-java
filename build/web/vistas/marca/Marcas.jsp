<%-- 
    Document   : Marcas
    Created on : 22/10/2018, 11:19:14 AM
    Author     : lfern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%String context = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=context%>/css/bootstrap.css" rel="stylesheet">

        <script type="text/javascript" src="<%=context%>/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="<%=context%>/js/bootstrap.bundle.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table-dark">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Telefono</th>
                    <th>Direccion</th>
                    <th>Correo</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="listaMarcas" status="stat" var="lista">
                    <tr>
                        <td><s:property value="#stat.count"/></td>
                        <td><s:property value="nombreMarca"/></td>
                        <td><s:property value="telefono"/></td>
                        <td><s:property value="direccion"/></td>
                        <td><s:property value="correo"/></td>
                        <td></td>
                        <td></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </body>
</html>
