package Controllers;

import DAO.Imp_Catalogue;
import Models.ArticlesEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Article", urlPatterns = {"/Article","/Article/*"})
public class Article extends HttpServlet {
    Imp_Catalogue Cat;
    @Override
    public void init() throws ServletException {
        super.init();
        Cat=new Imp_Catalogue();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getRequestURI().substring(request.getContextPath().length());
        int CodeArticle = Integer.parseInt(path.substring(9));
        ArticlesEntity article = Cat.getArticle(CodeArticle);
        request.setAttribute("article",article);
        System.out.println(CodeArticle);
        request.getRequestDispatcher("/Article.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
