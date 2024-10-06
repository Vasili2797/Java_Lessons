package main.com.JavaProgrammingMasterclassUpdatedToJava17.BankAccountExercise;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private double balance=0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("We called the constructor with parameters inside of the method!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(){
        this(34501,2.50,"Default Name", "default email address", "default phone number");
        System.out.println("Empty constructor called");
    }

    public void depositFunds(){
        System.out.println("Please enter the amount you would like to deposit: ");
        Scanner reader = new Scanner(System.in);
        double amount;
        amount = reader.nextDouble();
        System.out.println(amount);
        this.balance+= amount;
        System.out.println("You currently have "+ balance +" dollars in your account");
    }

    public void withdrawFunds(){
        System.out.println("Please enter the amount you would like to withdraw: ");
        Scanner reader = new Scanner(System.in);
        double amount;
        amount = reader.nextDouble();
        System.out.println(amount);
        if(balance >=amount){
            this.balance-= amount;
        }else{
            System.out.println("You do not have enough funds to withdraw the selected amount!" +
                    "\n The amount available is: "+balance);
        }
        System.out.println("You currently have "+ balance +" dollars in your account");
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setCustomerEmail(String s) {
        this.email=s;
    }

    public String toString(){
        return "Account Number: "+ getAccountNumber()+"\nBalance: "+getBalance()
                +"\nCustomer Name: "+getCustomerName()+"\nEmail: "+getEmail()
                +"\nPhone number: "+getPhoneNumber();
    }


}