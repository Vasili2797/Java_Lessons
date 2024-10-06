package main.com.Personal_Java_Lessons.lesson24_ternary;

public class App {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar=="Volkswagen" ? false : true;
        System.out.println(isDomestic);
        App app = new App();

    }

    public App(){
            System.out.println("This is the public constructor for the program App.");
    }
}
