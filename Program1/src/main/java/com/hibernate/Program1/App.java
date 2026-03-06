package com.hibernate.Program1;

import com.hibernate.Program1.models.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        
        et.begin();
        
        Customer c1 = new Customer(1,"One", "1234");
		Customer c2 = new Customer(2,"Two", "5678");
		Customer c3 = new Customer(3,"Three", "8787");
		Customer c4 = new Customer(4,"Four", "6351");
		Customer c5 = new Customer(5,"Five", "0971");
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.persist(c5);

		et.commit();
    }
}
