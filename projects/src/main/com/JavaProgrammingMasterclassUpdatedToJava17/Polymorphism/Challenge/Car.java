package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Challenge;

public class Car {
    public String description;

    public Car(String description){
        this.description=description;
    }

    public void startEngine(){
        System.out.println("Just started the car!");
    }
    public void drive(){
        System.out.println("Car -> driving, type is "+getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}
