/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MbsFuncionario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marcelbenitezdasilva
 */
public class MbsFuncionarioDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(MbsFuncionario.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFuncionario.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    
        public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFuncionario.class);
        criteria.add(Restrictions.like("mbsNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }
    
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFuncionario.class);
        criteria.add(Restrictions.like("mbsCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsFuncionario.class);
        criteria.add(Restrictions.like("mbsNome", "%" + nome + "%"));
        criteria.add(Restrictions.like("mbsCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }
    
}
