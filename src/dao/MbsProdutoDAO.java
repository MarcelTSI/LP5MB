/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MbsProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marcelbenitezdasilva
 */
public class MbsProdutoDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsProduto.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsProduto.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    
    public List listNome(String  mbsNome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsProduto.class);
        criteria.add(Restrictions.like("mbsNome", mbsNome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listPreco(double mbsPreco){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsProduto.class);
        criteria.add(Restrictions.ge("mbsPreco", mbsPreco )); 
        criteria.add(Restrictions.le("mbsPreco", mbsPreco ));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}

        public List listNomePreco(String mbsNome, double mbsPreco){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsProduto.class);
        criteria.add(Restrictions.like("mbsNome", mbsNome, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ge("mbsPreco", mbsPreco )); 
        criteria.add(Restrictions.le("mbsPreco", mbsPreco ));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
