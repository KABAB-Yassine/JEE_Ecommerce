package Controllers;

import DAO.Imp_Catalogue;
import Models.ArticlesEntity;
import Models.Panier_Model;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Panier", urlPatterns = {"/Panier","/Panier/*"})
public class Panier extends HttpServlet {
    Imp_Catalogue Cat;
    Panier_Model p;
    @Override
    public void init() throws ServletException {
        super.init();
        Cat=new Imp_Catalogue();
         p =new Panier_Model();
         p.setList(new ArrayList<ArticlesEntity>());
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getRequestURI().substring(request.getContextPath().length());
        int CodeArticle = Integer.parseInt(path.substring(8));
        HttpSession session = request.getSession(true);
        if (session.getAttribute("Panier_Articles") == null) {
            session.setAttribute("Panier_Articles",(Panier_Model)Cat.AddPanier(p,CodeArticle));
        } else{
            ((Panier_Model) session.getAttribute("Panier_Articles")).getList().add(Cat.getArticle(CodeArticle));
        }
        request.getRequestDispatcher("/Panier.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        int CodeClient= (int) session.getAttribute("CodeClient");
      Boolean result=Cat.AddCommande((Panier_Model) session.getAttribute("Panier_Articles"),CodeClient ,1);
      System.out.println(result);
      response.sendRedirect("/SpringMVC_war_exploded/Catalogue");

    }

}
