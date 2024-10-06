package main.com.JavaProgrammingMasterclassUpdatedToJava17.TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try{
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:\\Users\\nashv\\Desktop\\" +
//                    "Programming\\Java_Lessons\\src\\main\\com\\JavaProgrammingMasterclassUpdatedToJava17\\" +
//                    "TestDB\\testjava.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:\\TestDB\\testjava.db");
//            jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/testjava.db
        }catch (SQLException sql){
            System.err.println("Something went wrong " + sql.getMessage());
        }
    }
}
