package com.Personal_Java_Lessons.lesson14_abstraction;

public abstract class Car {

    private String name;
    public abstract void foo();

    public void show(){
        System.out.println("show function in Car class");
    }
}
