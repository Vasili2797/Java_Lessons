package main.com.Projects.StudentDatabaseApplication.src.StudentDatabaseRetrieval;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static String firstName;
    public static String lastName;

    public static void main(String[] args) throws IOException {
        System.out.println("Thank you for using our app to retrieve information about a student.");
        System.out.println("Please enter the information about the student:");
        System.out.println("First Name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        firstName=reader.readLine();
        System.out.println("Last Name: ");
        lastName=reader.readLine();
        String fileName="..\\Programming\\Java_Lessons\\src\\main\\com\\" +
                "StudentDatabaseApplication\\src\\studentDatabaseApplicationSolution\\resourcesFolder\\data.txt";
        App app = new App();
        app.parseFile(fileName);
    }

    public void parseFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            String[] nametakenOUt = line.split(",");

            String firstNameFromFile=nametakenOUt[0].split(":")[1].strip();
            String lastNameFromFile=nametakenOUt[1].split(":")[1].strip();

            if(Objects.equals(firstNameFromFile, this.firstName.toLowerCase()) &&
                    Objects.equals(lastNameFromFile, this.lastName.toLowerCase())){
                System.out.println(line);
            }
        }
    }
}
