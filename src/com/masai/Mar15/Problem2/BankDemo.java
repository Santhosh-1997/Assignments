package com.masai.Mar15.Problem2;

public class BankDemo {

    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount(111,50000);

        try {
            double amountTaken1 = account1.withdraw(60000);

            System.out.println("Amount withdrawn is " + amountTaken1);

        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }

}
