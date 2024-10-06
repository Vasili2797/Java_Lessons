package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Challenge;

public class gasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public gasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }

    @Override
    public void startEngine() {
        System.out.format("Gas -> All %d cylinders are fired up, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }

    public double getAvgKmPerLitre(){
        return avgKmPerLitre;
    }

    public int getCylinders(){
        return cylinders;
    }
}
