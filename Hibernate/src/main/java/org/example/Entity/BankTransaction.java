package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_transactions")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private double balance;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public BankTransaction(){

    }

    public BankTransaction( double balance, Account account) {
        this.balance = balance;
        this.account = account;
    }


    public Long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
