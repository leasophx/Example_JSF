<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>

</head>
<body>

<h1>Deine Anmeldedaten lauten:</h1>

<panelGrid>

</panelGrid>

<p><b>Username:</b> ${username} </p>
<p><b>Password:</b> ${password} </p>

<form action="${QuickServlet.setDefaultUser()}">
    <input type="submit" value="Login"/>

</form>
    <commandButton id="submitButton" value="Submit" action="${QuickServlet.setDefaultUser()}"></commandButton>
</form>

<outputText value="${QuickServlet2.user}"></outputText>



<%
    String s = "<b>Aktuelles Datum: 2020-07-06</b>";
    out.print(s);
%>

</body>
</html>
