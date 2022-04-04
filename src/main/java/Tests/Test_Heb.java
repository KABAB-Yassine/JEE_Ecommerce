package Tests;

import Models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test_Heb {

    public static void main(String[] args) {
        User user;
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session. createQuery(" from User c where c.email=:email AND c.password=:password");
        List<User> list= query.setParameter("email", "yassine.kabab1234@gmail.com").setParameter("password","ahmad").list();
        System.out.println(list.get(0).getPrenom());
        if(list.size()==0){
            System.out.println("Vide");
        }else {
            System.out.println(list.get(0).getNom());
        }
    }

}
