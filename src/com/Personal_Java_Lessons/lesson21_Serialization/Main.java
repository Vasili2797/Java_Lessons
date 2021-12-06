package com.Personal_Java_Lessons.lesson21_Serialization;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        Serializator serializator = new Serializator();
        try {
            Cat cat =serializator.deserialization();
            System.out.println(cat.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
