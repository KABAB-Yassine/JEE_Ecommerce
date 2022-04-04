package Controllers;

import DAO.Imp_Auth;
import Models.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Auth", value = "*.auth")
public class Auth extends HttpServlet {
    Imp_Auth auth;
    @Override
    public void init() throws ServletException {
        super.init();
        auth=new Imp_Auth();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path=request.getRequestURI().substring(request.getContextPath().length());

        if (path.equals("/Login.auth")) {
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            List<User> user=auth.Login(email,password);
            if(user!=null){
                HttpSession se=request.getSession(true);
                se.setAttribute("fullname",user.get(0).getNom()+" "+user.get(0).getPrenom());
                se.setAttribute("Auth","valide");
                se.setAttribute("CodeClient",user.get(0).getId());
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }else{
                response.sendRedirect("/SpringMVC_war_exploded/Login.jsp");
            }
        }else if(path.equals("/Register.auth")){
            System.out.println("test1");
            String email,  nom,  prenom,  adresse,  codepostal,  ville, tel,  password;
            email=request.getParameter("email");
            nom=request.getParameter("nom");
            prenom=request.getParameter("prenom");
            adresse=request.getParameter("adresse");
            codepostal=request.getParameter("codepostal");
            ville=request.getParameter("ville");
            tel=request.getParameter("tel");
            password=request.getParameter("password");
            boolean var=auth.Register(email,  nom,  prenom,  adresse,  codepostal,  ville, tel,  password);
            if(var==true){
                HttpSession se=request.getSession(true);
                se.setAttribute("fullname",prenom+" "+nom);
                se.setAttribute("Auth","valide");
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }else{
                response.sendRedirect("/SpringMVC_war_exploded/Login.jsp");
            }

        }else{


        }
    }
}
