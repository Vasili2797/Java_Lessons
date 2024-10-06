package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Challenge;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }


    @Override
    public void startEngine() {
        System.out.format("Hybrid -> All %d cylinders are fired up. Ready!%n",cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n",avgKmPerLitre);
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
