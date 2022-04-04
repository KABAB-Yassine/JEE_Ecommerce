package Controllers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.*;

@WebFilter(filterName = "Filter_Conn" ,urlPatterns = "/Catalogue")
public class Filter_Conn implements Filter {
    public void init(FilterConfig config) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("test filter");
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        HttpSession session=req.getSession(false);
        if(session.getAttribute("Auth")==null){
            res.sendRedirect("/SpringMVC_war_exploded/Login.jsp");
        }else{
            System.out.println(session.getAttribute("Auth"));
            if(session.getAttribute("Auth").equals("valide")) {
                chain.doFilter(request, response);
            }
        }
    }
}
