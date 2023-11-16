/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MbsFornecedor;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marcelbenitezdasilva
 */
public class MbsFornecedorDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(MbsFornecedor.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFornecedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFornecedor.class);
        criteria.add(Restrictions.like("mbsNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }
    
    public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFornecedor.class);
        criteria.add(Restrictions.eq("mbsDataCadastro", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeData(String nome, Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFornecedor.class);
        criteria.add(Restrictions.like("mbsNome", "%" + nome + "%"));
        criteria.add(Restrictions.eq("mbsDataCadastro", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    
}
