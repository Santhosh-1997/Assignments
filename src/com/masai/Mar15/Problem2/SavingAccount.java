package com.masai.Mar15.Problem2;

import javax.naming.InsufficientResourcesException;

public class SavingAccount {

    private int accountNumber;
    private double balance;

    public SavingAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display(int amount){
        this.balance += amount;
    }

    public double withdraw(int amount) throws InsufficientFundException {
        if(amount>this.balance){
           throw new InsufficientFundException("Insufficient Amount in the account");
        }

        this.balance-=amount;
        return amount;
    }
}
