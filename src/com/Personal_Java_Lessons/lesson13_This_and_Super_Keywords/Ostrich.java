package com.Personal_Java_Lessons.lesson13_This_and_Super_Keywords;

public class Ostrich extends Birds{


    public void hideHead(){
        System.out.println("I am Ostrich and I hide my head in sand!");
    }

    public void walk(String str){
        System.out.println("I am Ostrich and I am walking"+str);
    }

    @Override
    public void walk(){
        System.out.println("Ostrich class override");
    }
}
