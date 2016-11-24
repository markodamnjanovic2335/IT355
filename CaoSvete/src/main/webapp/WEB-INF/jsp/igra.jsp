<%-- 
    Document   : igra
    Created on : Nov 23, 2016, 1:30:29 PM
    Author     : Marko
--%>

<%@taglib uri="http://www.springframework.org/tags/form"prefix="form"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<h1>Unesite informacije o igri</h1>
<form:form method="POST" action="/CaoSvete/dodajIgru" commandName="igra">
    <table>
        <tr>
            <td><form:label path="imeIgre"><spring:message code="gameName"/></form:label></td>
            <td><form:input path="imeIgre" /></td>
        </tr>

        <tr>
            <td><form:label path="opisIgre"><spring:message code="desGame"/></form:label></td>
            <td><form:input path="opisIgre" /></td>
        </tr>
        <tr>
            <td><form:label path="velicinaIgrice"><spring:message  code="sizeOfGame"/></form:label></td>
            <td><form:input path="velicinaIgrice" /></td>
        </tr>
        <tr>
            <td><form:label path="ocenaIgre"><spring:message code="markGame"/></form:label></td>
            <td><form:input path="ocenaIgre" /></td>
        </tr>
        <tr>

            <td><form:label path="cenaIgre"><spring:message code="priceOfGame"/></form:label></td>
            <td><form:input path="cenaIgre" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Postavi"/>
            </td>
        </tr>
    </table>
</form:form>
<%@ include file="footer.jsp" %>