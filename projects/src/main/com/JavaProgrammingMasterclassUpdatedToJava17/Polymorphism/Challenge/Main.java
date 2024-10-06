package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari");
        runRace(car);
        Car electricCar = new ElectricCar("Electric Car",600.0,62);
        System.out.println();
        runRace(electricCar);

        Car gasCar = new gasPoweredCar("Bugatti",20.0,12);
        runRace(gasCar);

        Car hybridCar = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,8);
        runRace(hybridCar);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println("");
    }

    public static String gameWinner(String colors) {

        StringBuilder sb = new StringBuilder(colors);
        String resultString = null;
        for(int i=1;i<colors.length();i++){
            if(sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i-1)==sb.charAt(i)){
                sb.deleteCharAt(i);
            }
            resultString=sb.toString();
        }
        return resultString;
    }
}
