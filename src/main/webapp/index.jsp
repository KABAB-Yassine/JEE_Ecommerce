<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Menu.css" />
</head>
<body>
<div class="nav">
    <input type="checkbox">
    <span></span>
    <span></span>
    <div class="menu">
        <li><a href="#">Panier</a></li>
        <li><a href="#">Commandes</a></li>
        <li><a href="/SpringMVC_war_exploded/Catalogue">Catalogue</a></li>
    </div>
</div>
</body>
</html>