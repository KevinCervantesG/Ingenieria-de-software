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
public class MarcadorDAO extends AbstractDAO<Marcador>{
    
    protected SessionFactory sessionFactory;
    
    public MarcadorDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save(Marcador mcr){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(mcr);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }     
        
    }
    
    
    protected void update(Marcador mcr){}
    
    protected void delete(Marcador mcr){}
    
    protected Marcador find(Class clazz, int id){
        Marcador mcr = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            mcr = (Marcador) session.get(clazz, id);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return mcr;
    }
    
    protected List<Marcador> findAll(Class clazz){
        List<Marcador> mcr = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From"+clazz;
            Query query = session.createQuery(hql);
            mcr = (List<Marcador>) query.uniqueResult();
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return mcr;
    }
}
