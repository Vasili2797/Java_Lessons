package com.Personal_Java_Lessons.lesson1;
/*
This is the only time I will use this main method in this file lesson1, to show import method,
also to show the ability of Java to import different methods and classes from a different package-for now
in the same family of packages called Personal_Java_Lessons
* */
import com.Personal_Java_Lessons.lesson2_Bus.Bus;// after creating an object from lesson2_Bus, this was imported

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color="Green";
        firstBus.color="Yellow";
        secondBus.color="Red";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
