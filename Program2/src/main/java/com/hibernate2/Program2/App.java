package com.hibernate2.Program2;

import com.hibernate2.Program2.modules.Customer;
import com.hibernate2.Program2.modules.Customer_Details;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        
        Customer c = new Customer(1,"all");
        Customer_Details cd = new Customer_Details(101,"9966","abc@gmail.com","Ap");
        
        c.setCustomer_details(cd);
        em.persist(c);
        
        et.commit();
    }
}
