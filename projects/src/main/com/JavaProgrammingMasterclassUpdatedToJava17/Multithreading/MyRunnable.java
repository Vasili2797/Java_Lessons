package main.com.JavaProgrammingMasterclassUpdatedToJava17.Multithreading;

import static main.com.JavaProgrammingMasterclassUpdatedToJava17.Multithreading.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
