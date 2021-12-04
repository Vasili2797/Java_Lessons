package com.Personal_Java_Lessons.lesson13_This_and_Super_Keywords;

public class Main {
    public static void main(String[] args){
        Ostrich ostrich = new Ostrich();

        ostrich.setName("Ostrich");
        Birds ostrich2 = new Ostrich();

        ostrich.walk();
        ostrich.walk(" Hello");

        Birds crow = new Crow();

        Test test = new Test();
        test.foo(crow);


    }
}
