package main.com.Personal_Java_Lessons.lesson19_errorsAndExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {
    //Class to show how errors and try catch blocks can get out of hand
    private newClass class1=new newClass();
    public void foo() {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
