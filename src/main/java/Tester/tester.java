/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Entities.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mikke
 */
public class tester {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
    
    
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager(); 
        
        em.getTransaction().begin();
        
        Customer c1 = new Customer ("Jens", "Jensen") ; 
        Customer c2 = new Customer ("Mads", "Madsen") ; 
        
        c1.addHobby("Løb");
        c1.addHobby("Øl");
        c2.addHobby("Folkedans");
        
        em.persist(c1);
        em.persist(c2);
        
        
        em.getTransaction().commit();
    }
    
}
