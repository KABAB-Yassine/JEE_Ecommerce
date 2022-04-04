
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Catalogue</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Catalogue.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container bg-light rounded">
    <div class="h4 font-weight-bold text-center py-3">Catalogue</div>
    <div class="row">
        <c:forEach items="${Categories}" var="Categorie">
        <div class="col-lg-4 col-md-6 my-lg-0 my-3" onclick="window.location='/SpringMVC_war_exploded/Catalogue/${Categorie.getRefcat()}'">
            <div class="box bg-white">
                <div class="d-flex align-items-center">
                    <div class="rounded-circle mx-3 text-center d-flex align-items-center justify-content-center blue"> <img src="${pageContext.request.contextPath}/Files/Images_Categories/<c:out value = "${Categorie.getImage()}.jpg"/>" /> </div>
                    <div class="d-flex flex-column"> <b><c:out value = "${Categorie.getCategorie()}"/></b> <a href="#">
                        <p class="text-muted"><c:out value = "${Categorie.getRefcat()}"/></p>
                    </a> </div>
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</div>
<br style="height: 10%" >
<h2 style="text-align: center">Categorie : <c:out value="${Categorie}" /></h2>
<table class="table" style="text-align: center">
    <thead>
    <tr class="table-primary">
        <th scope="col">Ref_Cat</th>
        <th scope="col">Titre</th>
        <th scope="col">Auteur</th>
        <th scope="col">Photo</th>
        <th scope="col">Prix</th>
        <th scope="col">Details</th>
        <th scope="col">Ajouter au Panieur</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${Articles}" var="article" >
    <tr>
        <th scope="row"><c:out value="${article.getCategorie()}"/></th>
        <td><c:out value="${article.getDesignation()}"/></td>
        <td><c:out value="${article.getDesignation()}"/></td>
        <td><img src="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"/></td>
        <td><c:out value="${article.getPrix()}"/></td>
        <td><a href="/SpringMVC_war_exploded/Article/<c:out value="${article.getCodeArticle()}"/>">Voir Plus</a></td>
        <td><a href="/SpringMVC_war_exploded/Panier/<c:out value="${article.getCodeArticle()}"/>">Ajouter Au Panier</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
