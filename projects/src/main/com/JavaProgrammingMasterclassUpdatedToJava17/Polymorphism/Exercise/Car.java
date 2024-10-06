package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Exercise;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders=cylinders;
        this.name=name;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " engine is starting.";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating.";
    }

    public String brake(){
        return getClass().getSimpleName() + " is braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
