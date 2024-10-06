package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.InterfaceAndAbstract;

public class drivableCar extends car implements IPowered{
    private String make;
    private String model;
    private String manufactureDate;
    public drivableCar(String make, String model, String manufactureDate){
        this.make=make;
        this.model=model;
        this.manufactureDate=manufactureDate;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getManufactureDate(){
        return manufactureDate;
    }

    // All of these are from car abstract class
    @Override
    public void drive() {
        System.out.println("I am driving the "+getModel() + " "+getMake()+" manufactured in the year "+getManufactureDate());
    }

    @Override
    public void brake() {
        System.out.println("I am braking my "+getModel() + " "+getMake());
    }

    @Override
    public void consumeEnergy() {
        System.out.println("My "+getModel() + " "+getMake()+" manufactured in the year "+getManufactureDate()
                            +" consumes a lot of petroleum");
    }
    // abstract class ends here
    // The Implemented Methods
    @Override
    public double milesPerGallon() {
        System.out.println("A double return type method implemented from IPowered interface");
        return 30.0;
    }

    @Override
    public void drivingAround() {
        System.out.println("Driving around implemented from IPowered interface");
    }
}
