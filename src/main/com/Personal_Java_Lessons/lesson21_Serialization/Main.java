package main.com.Personal_Java_Lessons.lesson21_Serialization;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setName("Tom");
        Cat cat2 = new Cat();
        cat2.setName("Tom2");

        Serializer serializer = new Serializer();
        serializer.serialization(cat);
        serializer.serialization(cat2);
    }
}
