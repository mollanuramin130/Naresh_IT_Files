package com.nur.Exam;


import java.util.*;

public class Test{
    public static void main(String [] args){
        Bank nur = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank name : ");
        String bankName=sc.nextLine();
        System.out.println("Enter customer name : ");
        String bankCustomerName=sc.nextLine();
        System.out.println("Enter Bank address name : ");
        String bankAddress=sc.nextLine();
        System.out.println("Enter Bank IFSC name : ");
        String bankIFSCCode=sc.nextLine();
        System.out.println("Enter Bank Account name : ");
        int customerAccountNumber=sc.nextInt();
        System.out.println("Enter Current Balance : ");
        int currentBalance=sc.nextInt();

        nur.setDeatils(bankName,bankCustomerName,bankAddress,bankIFSCCode,customerAccountNumber,currentBalance);

        System.out.println(nur.displayDetails());
        nur.withdraw(1200);
        nur.deposit(500);
        nur.currentBalance();
        System.out.println(nur.displayDetails());
        sc.close();
    }
}

class Bank{
    
    static String bankName ;
    String bankCustomerName;
    static String bankAddress;
    static String bankIFSCCode;
    int customerAccountNumber;
    int currentBalance;

    public void setDeatils(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance){
        Bank.bankName=bankName;
        this.bankCustomerName=bankCustomerName;
        Bank.bankAddress=bankAddress;
        Bank.bankIFSCCode=bankIFSCCode;
        this.customerAccountNumber=customerAccountNumber;
        this.currentBalance=currentBalance;
    }

    public void withdraw(double amount){
        if(currentBalance<=1000){
            System.out.println("InsufficientBalance");
        }
        else if(currentBalance-amount<=1000){
            System.out.println("Maintain MinimumBalance");
        }
        else{
            currentBalance -=amount;
            System.out.println("Transaction Successful.\nAvailable Balance : Rs."+currentBalance);
        }
    }
     public void deposit(double amount){
        
            currentBalance +=amount;
            System.out.println("Deposited Successfully .\nAvailable Balance : Rs."+currentBalance);
        
    }
    public void currentBalance(){
        System.out.println("Your current Balance is : Rs."+currentBalance);
    }

    public String displayDetails(){

        return "[\nbankName "+bankName+"\nbankCustomerName : "+bankCustomerName+"\nbankAddress : "+bankAddress+"\nbankIFSCCode : "+bankIFSCCode+"\ncustomerAccountNumber : "+customerAccountNumber+"\ncurrentBalance : "+currentBalance+"\n]";
    }
    
}




