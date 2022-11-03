<%-- 
    Document   : Inicio
    Created on : 22/10/2018, 11:21:22 AM
    Author     : lfern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String context = request.getContextPath();%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
        <ul class="nav">
            <li class="nav-item">
                <a class=" nav-link active" href="<%=context%>/vistas/marca/RegistrarMarcas.jsp">registrar marca</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=context%>/consultarMarca">Consultar Marcar</a>
            </li>
        </ul>
    </body>
</html>
