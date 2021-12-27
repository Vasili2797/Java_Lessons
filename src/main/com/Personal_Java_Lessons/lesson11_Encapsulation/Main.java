package main.com.Personal_Java_Lessons.lesson11_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setA(25);
        encapsulation.setB(30);
        System.out.println(encapsulation.getPi());

        System.out.println(encapsulation.showResult());
    }
}
