package main.com.Projects.CurrentCurrencyConverter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static main.com.Projects.CurrentCurrencyConverter.App.WorkingCode;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isOn=true;
        while(isOn) {
            try {
                WorkingCode();
            } catch (URISyntaxException | IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String url="https://app.exchangerate-api.com/dashboard";
    }

    public static void doYouWishToContinue() {
        System.out.println();
        System.out.println();
        System.out.println("Do you wish to restart the program? Press 1 for yes. Press any key to exit");
        String input=scanner.nextLine();

        if(input.equalsIgnoreCase("1")){
            System.out.println("Restarting the program!");
            Main mainMethod=new Main();
            mainMethod.getClass();
        }else{
            System.out.println("Thank you for using our service!\n");
            System.exit(0);
        }
    }
}
