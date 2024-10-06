package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public static void main(String[] args) {
        Customer c1 = new Customer("First Customer");
        System.out.println(c1.addNewCustomer(c1, customerList));
        c1.addTransaction(100,c1);
        System.out.println("The new Amount available after adding is: "+Double.valueOf(amountOfMoney(30,c1)));
//        amountAvailable= Double.valueOf(amountOfMoney(-50,c1));
        c1.addTransaction(-50,c1);
        System.out.println();
        System.out.println("After taking money out of the bank, we have "+ c1.getAmount());
    }

    private static String name;
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private static ArrayList<Double> transactions = new ArrayList<>();
    private static double amountOfMoneyInBank=0.0;

    public Customer(String name){
        this.name=name;
    }

    public double getAmount(){
        return amountOfMoneyInBank;
    }


    private String addNewCustomer(Customer customer, List<Customer> list){
        // Add a new customer if they are not already in the list
        String response=null;
        if(!(list.contains(customer))){
            list.add(customer);
            response="Added a new Customer with the Name: "+customer.getName();
        }
        else{
            response="The customer already exists";
        }
        return response;
    }


    private static double addTransaction(double num, Customer c){
        return amountOfMoneyInBank+=num;
    }

    private static Double amountOfMoney(double number, Customer c){
        if(number>=0.0){
            System.out.println("The positive amount: "+number);
            addTransaction(number,c);

        }else if(number<0.0){
            System.out.println("The negative amount: "+number);
            addTransaction(number,c);
        }
        return Double.valueOf(c.amountOfMoneyInBank);
    }

    public static String getName(){
        return name;
    }
}
