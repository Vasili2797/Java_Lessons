package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing.Challenge;

import java.util.ArrayList;

record CustomerSolution(String name, ArrayList<Double> transactions){
    public CustomerSolution(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class TimsSolution {
    public static void main(String[] args) {
        CustomerSolution bob = new CustomerSolution("Bob",1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A",500);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatement("Jane a");

        bank.addNewCustomer("Jordan S",25);
        bank.addTransaction("Jordan S", 300);
        bank.printStatement("Jordan s");
    }
}

class Bank{
    private String name;
    private ArrayList<CustomerSolution> customers = new ArrayList<>(5000);
    public Bank(String name){
        this.name=name;
    }

    private CustomerSolution getCustomer(String customerName){
        for(var customer: customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n",customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName)==null){
            CustomerSolution customer = new CustomerSolution(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: "+customer);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(String name, double transactionAmount){
        CustomerSolution customer = getCustomer(name);
        if(customer!=null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        CustomerSolution customer =getCustomer(customerName);
        if(customer==null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: "+customer.name());
        System.out.println("Transactions: ");
        for (double d: customer.transactions()) { // Unboxing
            System.out.printf("$%10.2f (%s)%n", d, d<0 ? "debit": "credit");
        }
    }
}