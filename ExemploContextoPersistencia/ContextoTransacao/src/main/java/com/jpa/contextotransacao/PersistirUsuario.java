/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.contextotransacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.PersistenceContext;

/**
 *
 * @author Cliente
 */
@PersistenceContext(unitName = "DAC")

public class PersistirUsuario {

    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DAC");
        EntityManager em = factory.createEntityManager();

        return em;
    }

    public PersistirUsuario() {
    }

    public void persistir(Usuario u) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(u);
        transaction.commit();
        em.close();

    }

    public Usuario buscar(String email) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Usuario u;

        u = em.find(Usuario.class, email);

        transaction.commit();
        return u;
    }

}
