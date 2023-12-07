/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MbsCompra;
import bean.MbsFornecedor;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marcelbenitezdasilva
 */
public class MbsCompraDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(MbsCompra.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsCompra.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    
        public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsCompra.class);
        criteria.add(Restrictions.eq("mbsDataCompra", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listPreco(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsCompra.class);
        criteria.add(Restrictions.ge("mbsPrecoCompra", preco));
        criteria.add(Restrictions.le("mbsPrecoCompra", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listDataPreco(Date data, double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsCompra.class);
        criteria.add(Restrictions.eq("mbsDataCompra", data));
        criteria.add(Restrictions.ge("mbsPrecoCompra", preco));
        criteria.add(Restrictions.le("mbsPrecoCompra", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
