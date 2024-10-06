package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge;

public class Drink {
    private int size;
    private double price;
    private String type;

    public Drink(int size, double price, String type){
        this.size=size;
        this.price=price;
        this.type=type;
    }

    public int getSize(){
        return size;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return "{size: "+size
                +"\nprice: "+price
                +"\ntype: "+type+"}";
    }
}
