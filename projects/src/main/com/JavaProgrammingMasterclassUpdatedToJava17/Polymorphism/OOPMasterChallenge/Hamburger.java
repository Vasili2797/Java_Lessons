package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hamburger {
    public String burger;
    public Drink drink;
    public String sideOrder;
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public Hamburger(){
        burger=this.burger;
        drink=this.drink;
        sideOrder=this.sideOrder;
    }

    public void workingMethod() throws IOException{
        typeOfBurger();
        typeofDrink();
        typeOfSideOrder();
        System.out.println("Your order consists of: \n"
                            +this.burger.concat(", \n")
                            +(", side order: ")
                            +this.sideOrder.concat("! Drink:")
                            +this.drink);
    }
    public void typeOfBurger() throws IOException {
        System.out.println("What kind of burgers would you like?");
        String burgerType=scanner.readLine();
        this.burger=burgerType;
    }

    public void typeofDrink(){
        System.out.println("What size Drink would you like?");
        Scanner scanner1 = new Scanner(System.in);
        int size=scanner1.nextInt();
        System.out.println("What type of drink would you like?");
        String typeOfDrink= scanner1.next();
        double pricePerOz=0.1244;
        double price=Math.round(pricePerOz*size);
        System.out.println("The type and size of the drink is: "+size+" "+typeOfDrink);
        Drink drink1 = new Drink(size,price,typeOfDrink);
        this.drink=drink1;
    }

    public void typeOfSideOrder() throws IOException {
        System.out.println("What would you like as your side order?");
        String sideOrderPlaced=scanner.readLine();
        this.sideOrder=sideOrderPlaced;
    }
}
