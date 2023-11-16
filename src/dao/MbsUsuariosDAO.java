/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MbsUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marcelbenitezdasilva
 */
public class MbsUsuariosDAO extends DAO_Abstract {

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
        session.flush();
        session.clear(); 
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsUsuarios.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    
    
    public List listNome(String mbsNome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsUsuarios.class);
        criteria.add(Restrictions.like("mbsNome", mbsNome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
        public List listCpf(String mbsCpf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsUsuarios.class);
        criteria.add(Restrictions.like("mbsCpf", mbsCpf, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
        public List listNomeCpf(String mbsNome, String mbsCpf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MbsUsuarios.class);
        criteria.add(Restrictions.like("mbsNome", mbsNome, MatchMode.ANYWHERE));
        criteria.add(Restrictions.like("mbsCpf", mbsCpf, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
        public Object buscarLogin(String apelido, String senha) {
        MbsUsuarios mbsusuarios = null;

        String url = "jdbc:mysql://10.7.0.51:33062/db_marcel_silva";
        String user = "marcel_silva";
        String password = "marcel_silva";

        //String url = "jdbc:mysql://localhost:3306/db_marcel_silva";
        //String user = "root";
        //String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM mbs_usuarios WHERE mbs_apelido = ? AND mbs_senha = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, apelido);
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                mbsusuarios = new MbsUsuarios();
                mbsusuarios.setMbsApelido(rs.getString("apelido"));
                mbsusuarios.setMbsSenha(rs.getString("senha"));
            }

            rs.close();
            pstm.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MbsUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MbsUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mbsusuarios;
    }
    
}
