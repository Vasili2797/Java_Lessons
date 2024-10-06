package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing.BankingChallenge;

import java.util.ArrayList;
public class Customer {
    private String name;
    public ArrayList<Double> transactions;

    public Customer(String nameOfCustomer, double initialTransaction){
        this.name=nameOfCustomer;
        transactions=new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double param){

    }
}
