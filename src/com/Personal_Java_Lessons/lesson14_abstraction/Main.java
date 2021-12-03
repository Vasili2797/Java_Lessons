package com.Personal_Java_Lessons.lesson14_abstraction;

public class Main {
    public static void main(String[] args){

        Tesla tesla = new Tesla();
        Tesla car = new Tesla();
        //Car car = new Car();//You cannot instantiate abstract class

        car.show();
        tesla.foo();

    }
}
