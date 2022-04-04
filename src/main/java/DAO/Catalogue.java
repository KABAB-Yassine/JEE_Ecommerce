package DAO;

import Models.ArticlesEntity;
import Models.CategorieEntity;
import Models.Panier_Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface Catalogue {
    public List<CategorieEntity> GetAllCategories();
    public CategorieEntity getCategorie(String cat);
    public List<ArticlesEntity> getArticles(String cat);
    public ArticlesEntity getArticle(int id);
    public Panier_Model AddPanier(Panier_Model p, int CodeArticle);
    public Boolean AddCommande(Panier_Model p, int CodeClient,int Qtt);
}
