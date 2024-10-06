package main.com.JavaProgrammingMasterclassUpdatedToJava17.ConstructorExercise;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Bob","mail@email.net");
    }

    public Customer(String name, int creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public Customer(String name, String emailAddress){
        this(name,3000,emailAddress);
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
}
