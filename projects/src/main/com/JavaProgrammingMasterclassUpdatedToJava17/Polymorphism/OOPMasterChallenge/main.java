package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Hamburger hamburgerOrder=new Hamburger();
        try {
            hamburgerOrder.workingMethod();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
