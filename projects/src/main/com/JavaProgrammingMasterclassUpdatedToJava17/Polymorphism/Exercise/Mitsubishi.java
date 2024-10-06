package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Exercise;


public class Mitsubishi extends Car{
    private String name;
    private int cylinders;

    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
