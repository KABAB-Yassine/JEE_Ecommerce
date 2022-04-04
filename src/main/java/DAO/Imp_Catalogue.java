package DAO;

import Models.*;
import com.oracle.wls.shaded.org.apache.bcel.classfile.Code;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Imp_Catalogue implements Catalogue{
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session = sessionFactory.openSession();

    @Override
    public List<CategorieEntity> GetAllCategories() {
        //session.beginTransaction();
        List<CategorieEntity> list = session.createQuery(" FROM CategorieEntity ",CategorieEntity.class).getResultList();
        //session.getTransaction().commit();
        return (list.size() == 0)?null : list;
    }

    public CategorieEntity getCategorie(String cat) {
        Query query = session.createQuery(" from CategorieEntity a where a.refcat=:categorie");
        List<CategorieEntity> list = query.setParameter("categorie", cat).list();
        return (list.size() == 0)?null : list.get(0);
    }

    @Override
    public List<ArticlesEntity> getArticles(String cat) {
        Query query = session.createQuery(" from ArticlesEntity a where a.categorie=:categorie");
        List<ArticlesEntity> list = query.setParameter("categorie", cat).list();
        return (list.size() == 0)?null : list;
    }

    @Override
    public ArticlesEntity getArticle(int codeArticle) {
        Query query = session.createQuery(" from ArticlesEntity a where a.codeArticle=:codeArticle");
        List<ArticlesEntity> list = query.setParameter("codeArticle", codeArticle).list();
        return (list.size() == 0)?null : list.get(0);
    }

    @Override
    public Panier_Model AddPanier(Panier_Model p, int CodeArticle) {
        p.getList().add(getArticle(CodeArticle));
        return p;
    }

    @Override
    public Boolean AddCommande(Panier_Model p, int CodeClient,int Qtt) {
        Iterator it = p.list.iterator();
        Boolean result = true;
        session.beginTransaction();
            while (it.hasNext()) {
                ArticlesEntity ar = (ArticlesEntity) it.next();
                CommandesEntity commande = new CommandesEntity(CodeClient, ar.getCodeArticle(), Qtt);
                session.save(commande);
            }
            return result;
    }
}
