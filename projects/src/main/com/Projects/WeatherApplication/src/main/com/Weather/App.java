package main.com.Projects.WeatherApplication.src.main.com.Weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        System.out.println("This application wll be used by an individual who will enter their location and see" +
                " the current weather in the area mentioned, and also see the forecast.");
        System.out.println("First step is to create a user interface. Second step is to have to" +
                " ability to connect to a weather API. And then retrieve the data received." +
                " I am not sure at the moment, but I might also need SQL to retrieve the data. Not sure, so JDBC " +
                "possibility");
        try {
            userInterface();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void userInterface() throws IOException {
        System.out.println("Please enter your location: ");
        System.out.println("City: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userCity=reader.readLine();
        System.out.println("Is it in United States? ");
        String userAnswer= reader.readLine();
        String userState=null;
        String userCountry=null;
        if(userAnswer.equalsIgnoreCase("yes")){
            System.out.println("Please provide the state where the city is located:");
            userState= reader.readLine();
            userCountry="United States of America";
        }else{
            System.out.println("Please provide the nation where the city is located!");
            userCountry=reader.readLine();
        }
        if((userCountry==null)){
            System.out.println("Country: ");
            userCountry= reader.readLine();
            System.out.println("The entered location is: "+userCity.concat(", ")+userCountry.concat(", "));
        }else{
            System.out.println("The entered location is: "+userCity.concat(", ")+userCountry);
        }
    }
}
