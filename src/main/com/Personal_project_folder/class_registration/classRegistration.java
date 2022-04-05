package main.com.Personal_project_folder.class_registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class classRegistration {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the class registration website!\nPlease pick a subject where you would like to register!");
        String math = "Mathematics";
        String english = "English and Writing";
        String compsci ="Computer Science and Technology";
        System.out.println("1)"+math+"\n" +
                           "2)"+english+"\n"+
                           "3)"+compsci);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.println("You have chosen "+math);
            Mathematics();
        }else if(choice ==2){
            System.out.println("you have chosen "+english);
            english();
        }else if(choice ==3){
            System.out.println("You have chosen "+compsci);
            computerScience();
        }else{
            System.out.println("Wrong choice");
        }
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void computerScience() throws IOException {
        System.out.println("Please write the class name you would like to join!");
        String compClass = reader.readLine();
        System.out.println("You have selected the class "+compClass);
    }

    public static void Mathematics() throws IOException{
        System.out.println("Please write the class name you would like to join!");
        String mathClass= reader.readLine();
        System.out.println("You have selected the class "+mathClass);
    }
    public static void english() throws IOException{
        System.out.println("Please write the class name you would like to join!");
        //reader.readLine();
        String englishClass=reader.readLine();
        System.out.println("You have selected the class "+ englishClass);
    }
}
