
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Article</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Files/Article.css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" charset="utf-8"></script>
</head>
<body>
<div class="product-card">
    <h1><c:out value="${article.getDesignation()}" /></h1>
    <p><c:out value="${article.getPrix()}" /></p>
    <div class="product-pic" > <img style="text-align: center;width: 100%;height: 100%" src="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"></div>
    <div class="product-colors">
        <span class="blue active" data-color="#7ed6df" data-pic="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"></span>
        <span class="green" data-color="#badc58" data-pic="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"></span>
        <span class="yellow" data-color="#f9ca24" data-pic="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"></span>
        <span class="rose" data-color="#ff7979" data-pic="${pageContext.request.contextPath}/Files/Images_Articles/<c:out value = "${article.getPhoto()}.jpg"/>"></span>
    </div>
    <div class="product-info">
        <div class="product-price">$<c:out value="${article.getPrix()}" /></div>
        <a href="/SpringMVC_war_exploded/Panier/<c:out value="${article.getCodeArticle()}"/>" class="product-button">Ajouter Au Panier</a>
    </div>
</div>
<script>
    $(".product-colors span").click(function(){
        $(".product-colors span").removeClass("active");
        $(this).addClass("active");
        $("body").css("background",$(this).attr("data-color"));
        $(".product-price").css("color",$(this).attr("data-color"));
        $(".product-button").css("color",$(this).attr("data-color"));
    });
</script>
</body>


</body>
</html>
