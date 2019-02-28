/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.contextoestendido;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author Cliente
 */
@PersistenceContext(unitName = "DAC", type = PersistenceContextType.EXTENDED)

public class PersistirUsuario {

    
 private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

 

    public void persistir(Usuario u) {

       
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(u);
        transaction.commit();
        
       
    }

    public Usuario buscar(String email) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Usuario u;
       
        u = em.find(Usuario.class, email);

        transaction.commit();
        
        em.close();
        return u;
    }

    
    
 
}
