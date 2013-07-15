/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Plano;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author yuricampos
 */
public class PlanoDAO {
    private static SessionFactory factory;

    public PlanoDAO() {
        initSessionFactory();
    }

    public void initSessionFactory() {
        try {
            factory = new Configuration().configure().buildSessionFactory();

        } catch (Exception e) {
            System.out.println("Erro no initSessionFactory");
        }
    }

    public int verificaLogin(String usuario, String senha) {
        Session session = factory.openSession();
        String query = "from Plano m where plano_login=? and plano_senha=?";
        Query queryObj = session.createQuery(query);
        queryObj.setString(0, usuario);
        queryObj.setString(1, senha);
        List<Plano> records = queryObj.list();
        if (records.size() > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void alterarDados(Plano p) {
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.saveOrUpdate(p);
            session.getTransaction().commit();
            session.flush();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();

    }

    public void cadastrar(Plano p) {
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.save(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();
    }

}
