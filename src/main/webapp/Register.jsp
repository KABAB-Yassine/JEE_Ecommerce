<%--
  Created by IntelliJ IDEA.
  User: Terqouase
  Date: 19/03/2022
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Login.css" />
</head>
<body style="height: 250%">
<div class="center" style="height: 50%" >
    <h1>Inscrivez-vous</h1>
    <form action="/SpringMVC_war_exploded/Register.auth" method="post">
        <div class="inputbox">
            <input type="email" required="required" name="email">
            <span>Email</span>
        </div>
        <div class="inputbox">
            <input type="text" required="required" name="nom">
            <span>Nom</span>
        </div>
        <div class="inputbox">
            <input type="text" required="required" name="prenom">
            <span>Prenom</span>
        </div>
        <div class="inputbox">
            <input type="text" required="required" name="adresse">
            <span>Adresse</span>
        </div>
        <div class="inputbox">
            <input type="text" required="required" name="ville">
            <span>Ville</span>
        </div>
        <div class="inputbox">
            <input type="tel" required="required" name="tel">
            <span>Tel</span>
        </div>
        <div class="inputbox">
            <input type="text" required="required" name="codepostal">
            <span>code postal </span>
        </div>
        <div class="inputbox">
            <input type="password" required="required" name="password">
            <span>Password</span>
        </div>
        <div class="inputbox">
            <input type="submit" value="S'inscrire">
        </div>
    </form>
</div>
</body>
</html>
