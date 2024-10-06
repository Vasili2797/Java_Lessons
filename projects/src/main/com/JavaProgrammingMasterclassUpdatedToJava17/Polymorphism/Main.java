package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor=new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        MotherBoard theMotherboard=new MotherBoard("TUF Gaming A15", "TUF",
                4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Asus",
                theMonitor,theMotherboard,theCase);
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherBoard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
