package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.InterfaceAndAbstract;

public class Main{

    public static void main(String[] args) {
//        car newCar = new car(); //You cannot instantiate an abstract class
//        IPowered ipoweredCar = new IPowered(); //You also cannot instantiate an interface
        drivableCar drivableCar=new drivableCar("Nissan","Versa","06/10/2011");
        // If we extend the car abstract method in driveCar class, we get
        System.out.println("These are the methods to get the private items in the class. " +
                " And they can use the print statement");
        System.out.println(drivableCar.getMake());
        System.out.println(drivableCar.getModel());
        System.out.println(drivableCar.getManufactureDate());

        System.out.println("These are the methods From car abstract class");
        drivableCar.drive();
        drivableCar.consumeEnergy();
        drivableCar.brake();

        drivableCar.drivingAround();
        drivableCar.milesPerGallon();

        int zeroDouble=0;
        int number=3;

//        try {
//            System.out.println(number/zeroDouble);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        System.out.println("Exception was caught, and we move on.");

        System.out.println(255/143);
    }
}
