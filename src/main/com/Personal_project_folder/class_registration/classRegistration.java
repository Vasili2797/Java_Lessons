package main.com.Personal_project_folder.class_registration;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class classRegistration implements Serializable{
    public static void main(String[] args) throws IOException {
        boolean isOn = true;
        while (isOn) {
            System.out.println("Welcome to the class registration website!\nPlease pick a subject where you would like to register!");
            System.out.println("If you wish to exit, please check 4 for Exit.");
            String math = "Mathematics";
            String english = "English and Writing";
            String compsci = "Computer Science and Technology";
            System.out.println("1)" + math + "\n" +
                    "2)" + english + "\n" +
                    "3)" + compsci);

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if(choice == 1) {
                System.out.println("You have chosen " + math);
                Mathematics();
            }else if(choice == 2) {
                System.out.println("you have chosen " + english);
                english();
            }else if(choice == 3) {
                System.out.println("You have chosen " + compsci);
                computerScience();
            }else if(choice==4){
                isOn=false;
                exit();
            }
            else {
                System.out.println("Wrong choice.");
            }
        }
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<String> classes = new ArrayList<>();
    public static void computerScience() throws IOException {
        System.out.println("Please write the class name you would like to join!");
        String compClass = reader.readLine();
        System.out.println("You have selected the class "+compClass);
        classes.add(compClass);
    }

    public static void Mathematics() throws IOException{
        System.out.println("Please write the class name you would like to join!");
        String mathClass= reader.readLine();
        System.out.println("You have selected the class "+mathClass);
        classes.add(mathClass);
    }
    public static void english() throws IOException{
        System.out.println("Please write the class name you would like to join!");
        //reader.readLine();
        String englishClass=reader.readLine();
        System.out.println("You have selected the class "+ englishClass);
        classes.add(englishClass);
    }
    public static void exit() throws IOException{
        System.out.println("You have selected exit. Your choices for the classes are as follows:\n ");
        for(String element : classes){
            System.out.println(element);
        }
        FileOutputStream fos = new FileOutputStream("registeredClasses.txt");
        PrintWriter pw = new PrintWriter(fos);
        pw.println(classes);
        pw.close();
    }
}
//So the registered classes will be saved in an arraylist, and at the end it will display and save the entries

//Saves the file until the program restarts
// I also need to do the same for the bank.java project where it will save the transactions