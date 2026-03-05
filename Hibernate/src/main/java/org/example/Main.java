package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entity.Account;
import org.example.Entity.Customer;
import org.example.Entity.BankTransaction;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        Customer customer1 = new Customer(
                "Sagnik",
                "sagnikduttaofficial18@gmail.com"
        );

        Account acc1 = new Account("ACC001", 50000);
        Account acc2 = new Account("ACC002", 70000);

        customer1.addAccount(acc1);
        customer1.addAccount(acc2);

        acc1.addTransaction(new BankTransaction(2000, acc1));
        acc1.addTransaction(new BankTransaction(5000, acc1));
        acc1.addTransaction(new BankTransaction(10000, acc1));

        acc2.addTransaction(new BankTransaction(3000, acc2));
        acc2.addTransaction(new BankTransaction(4500, acc2));


        Customer customer2 = new Customer(
                "Rahul",
                "rahul@gmail.com"
        );

        Account acc3 = new Account("ACC003", 90000);
        Account acc4 = new Account("ACC004", 120000);

        customer2.addAccount(acc3);
        customer2.addAccount(acc4);

        acc3.addTransaction(new BankTransaction(15000, acc3));
        acc3.addTransaction(new BankTransaction(20000, acc3));

        acc4.addTransaction(new BankTransaction(5000, acc4));
        acc4.addTransaction(new BankTransaction(8000, acc4));
        acc4.addTransaction(new BankTransaction(12000, acc4));


        em.persist(customer1);
        em.persist(customer2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}