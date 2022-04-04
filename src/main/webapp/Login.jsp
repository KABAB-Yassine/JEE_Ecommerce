<%--
  Created by IntelliJ IDEA.
  User: Terqouase
  Date: 19/03/2022
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Login.css" />
</head>
<body>
<div class="center">
    <h1>Bienvenu SHop</h1>
    <form method="post" action="/SpringMVC_war_exploded/Login.auth">
        <div class="inputbox">
            <input type="email" required="required" name="email">
            <span>Email</span>
        </div>
        <div class="inputbox">
            <input type="password" required="required" name="password">
            <span>Password</span>
        </div>
        <div class="inputbox">
            <input type="submit" value="se connecter">
        </div>
    </form>
</div>
</body>
</html>
