package Controllers;

import DAO.Imp_Catalogue;
import Models.ArticlesEntity;
import Models.CategorieEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Catalogue", urlPatterns = {"/Catalogue","/Catalogue/*"})
public class Catalogue extends HttpServlet {
    Imp_Catalogue Cat;
    @Override
    public void init() throws ServletException {
        super.init();
        Cat=new Imp_Catalogue();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=request.getRequestURI().substring(request.getContextPath().length());
        List<CategorieEntity> Categories = Cat.GetAllCategories();
        List<ArticlesEntity> Articles = null;
        if(path.equals("/Catalogue")) {
            if (Categories != null) {
                Articles = Cat.getArticles(Categories.get(0).getRefcat());
            }
            request.setAttribute("Categories", Categories);
            request.setAttribute("Categorie",Categories.get(0).getCategorie());
            request.setAttribute("Articles", Articles);
            request.getRequestDispatcher("/Catalogue.jsp").forward(request, response);
        }else{
            String Categorie=path.substring(11);
            if(Categories!=null) {
                Articles = Cat.getArticles(Categorie);
                request.setAttribute("Articles", Articles);
            }
            request.setAttribute("Categorie",Cat.getCategorie(Categorie).getCategorie());
            request.setAttribute("Categories", Categories);

            request.getRequestDispatcher("/Catalogue.jsp").forward(request, response);
        }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}