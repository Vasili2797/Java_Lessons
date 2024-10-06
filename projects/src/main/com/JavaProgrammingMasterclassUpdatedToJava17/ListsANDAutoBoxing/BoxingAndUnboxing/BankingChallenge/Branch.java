package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing.BankingChallenge;

import java.util.ArrayList;
public class Branch {
    // write code here
    private String name;
    ArrayList<Customer> customers;

    public Branch(String nameOfBranch){
        this.name=nameOfBranch;
        customers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
//        if(findCustomer())
        return false;
    }

    public Customer findCustomer(String nameOfCustomer){
        for (Customer customer : this.customers) {
            String searchName = customer.getName();
            if(searchName.equals(nameOfCustomer)){
                return customer;
            }
        }
        return null;
    }
}

