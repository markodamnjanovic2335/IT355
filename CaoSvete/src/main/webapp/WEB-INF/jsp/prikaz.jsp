<%-- 
    Document   : prikaz
    Created on : Nov 23, 2016, 1:37:33 PM
    Author     : Marko
--%>

<%@ include file="header.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Igra</title>
    </head>
    <body>
        <h1>Podaci o igri:</h1>
        <table>
            <tr>
                <td>Naziv igre:</td>
                <td>${imeIgre}</td>
            </tr>
            <tr>
                <td>Opis igre:</td>
                <td>${opisIgre}</td>
            </tr>
            <tr>
                <td>Ocena igre:</td>
                <td>${OcenaIgre}</td>
            </tr>
            <tr>
                <td>Veičina igre:</td>
                <td>${velicinaIgrice}</td>
            </tr>
            <tr>
                <td>Cena igre:</td>
                <td>${cenaIgre}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>