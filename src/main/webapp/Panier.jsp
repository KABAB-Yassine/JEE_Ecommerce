<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Panier</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Catalogue.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body><h4><a href="/SpringMVC_war_exploded/Catalogue">Catalogue</a></h4>
<h2 style="text-align: center">Panier de : <c:out value="${sessionScope.fullname}" /></h2>
<table class="table" style="text-align: center">
    <thead>
    <tr class="table-primary">
        <th scope="col">Ref_Cat</th>
        <th scope="col">Titre</th>
        <th scope="col">Auteur</th>
        <th scope="col">Photo</th>
        <th scope="col">Prix</th>
        <th scope="col">Details</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sessionScope.Panier_Articles.getList()}" var="article" >
        <tr>
            <th scope="row"><c:out value="${article.getCategorie()}"/></th>
            <td><c:out value="${article.getDesignation()}"/></td>
            <td><c:out value="${article.getDesignation()}"/></td>
            <td><img src="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"/></td>
            <td><c:out value="${article.getPrix()}"/></td>
            <td><a href="/SpringMVC_war_exploded/Article/<c:out value="${article.getCodeArticle()}"/>">Voir Plus</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<form method="POST" action="/SpringMVC_war_exploded/Panier">
<h2 style="text-align:center" ><input type="submit" value="Valider Panier"></h2>
</form>
</body>
</html>
