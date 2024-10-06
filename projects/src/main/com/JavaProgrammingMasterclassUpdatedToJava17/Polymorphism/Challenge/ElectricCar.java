package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Challenge;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    @Override
    public void startEngine(){
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n",avgKmPerCharge);
    }

    public double getAvgKmPerCharge(){
        return avgKmPerCharge;
    }

    public int getBatterySize(){
        return batterySize;
    }

}
