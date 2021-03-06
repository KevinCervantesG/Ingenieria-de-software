/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapita.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author kevin
 */
public class UsuarioDAO extends AbstractDAO<Usuario>{
    
    protected SessionFactory sessionFactory;
    
    public UsuarioDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save(Usuario usr){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(usr);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }     
        
    }
    
    
    protected void update(Usuario usr){}
    
    protected void delete(Usuario usr){}
    
    protected Usuario find(Class clazz, int id){
        Usuario usr = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            usr = (Usuario) session.get(clazz, id);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return usr;
    }
    
    protected List<Usuario> findAll(Class clazz){
        List<Usuario> usr = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From"+clazz;
            Query query = session.createQuery(hql);
            usr = (List<Usuario>) query.uniqueResult();
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return usr;
    }
}
