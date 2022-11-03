<%-- 
    Document   : TipoDulces
    Created on : 22/10/2018, 11:20:00 AM
    Author     : lfern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
        <table class="table-bordered">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Descripcion</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="" status="" var="">
                </tbody>
        </table>
    </body>
</html>
