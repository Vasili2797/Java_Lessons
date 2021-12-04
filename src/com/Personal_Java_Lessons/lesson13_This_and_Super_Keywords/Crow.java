package com.Personal_Java_Lessons.lesson13_This_and_Super_Keywords;

public class Crow extends Birds{

    public void fly(){
        System.out.println("I am a Crow and I can fly!");
    }

    @Override
    public void walk() {
        System.out.println("Crow class override method");
    }
}
