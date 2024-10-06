package Generics;

import java.util.ArrayList;
import java.util.List;

public class wildcards {
    
    public static void deleteBike(List<Bullet> b12, Bike b1){
        b12.remove(b1);
        System.out.println("Bike Removed");
    }

    public static void addBike(List<? super Bullet> l2){
        l2.add(new Bullet("classic"));
        System.out.println("bike added");
    }

    public static void printItems(List<?> list){
        for(Object i: list){
            System.out.println(i+" ");
        }
    }

public static void main(String[] args) {
    List<Vehicle> v1 = new ArrayList<Vehicle>();
    List<Bullet> b1 = new ArrayList<Bullet>();
    addBike(b1);
    addBike(v1);

    printItems(v1);
    printItems(b1);

    Bullet bike1 = b1.get(0);
    deleteBike(b1,bike1);
    printItems(b1);
    }
}

class Vehicle{
    String name;
    Vehicle(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

class Bike extends Vehicle{
    String name;
    Bike(String name){
        super(name);
    }
}

class Car extends Vehicle{
    String name;
    Car(String name){
        super(name);
    }
}

class Bullet extends Bike{
    String name;
    Bullet(String name){
        super(name);
    }
}