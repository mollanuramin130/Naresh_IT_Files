package com.nur.Exam;

import java.util.Scanner;

public class BankingSystemELC{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int accountNumber =sc.nextInt();
        String accountHolder=sc.nextLine();
        accountHolder=sc.nextLine();
        double balance=sc.nextDouble();
        double depoBalance=sc.nextDouble();
        double widBalance=sc.nextDouble();

        BankAccount acc1 = new BankAccount(accountNumber,accountHolder,balance);
acc1.deposit(depoBalance);
acc1.withdraw(widBalance);
acc1.displayDetails();
    }
}

class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance=balance+amount;
         System.out.println(amount+" deposited.");
    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println(amount+" withdrawn.");
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
         System.out.println("Account Holder: "+accountHolder);
         System.out.println("Balance: "+balance);

    }
}