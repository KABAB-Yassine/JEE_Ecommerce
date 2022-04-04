package DAO;

import Models.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

import static com.sun.tools.attach.VirtualMachine.list;

public class Imp_Auth implements AUTH {
    User user;
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session = sessionFactory.openSession();

    @Override
    public List<User> Login(String email, String Password) {
        session.beginTransaction();
        Query query = session.createQuery(" from User c where c.email=:email AND c.password=:password");
        List<User> list = query.setParameter("email", email).setParameter("password", Password).list();
        session.getTransaction().commit();
        return (list.size() == 0)?null : list;
    }
    @Override
    public Boolean Register(String email,String  nom,String  prenom,String  adresse,String  codepostal,String  ville,String  tel,String  password) {
        Boolean result=true;
        user=new User(email,nom,prenom,adresse,codepostal,ville,tel,password);
        session.beginTransaction();
        try{
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception exp) {
        session.getTransaction().rollback();
        result=false;
        }
        return result;
        }
}
