package main.com.Personal_Java_Lessons.lesson22_InputOutput;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class fileOutputStream {
    //FileOutputStream fileOutPutStream;
    FileWriter fileWriter=null;
    String str = "Some String to write into file";
    String str2 = "New string variable to see new functionalities";

    //to create new files in java
    File file = new File("src/main.resources/newFile.txt");
    {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str2);
            //fileOutPutStream = new FileOutputStream("src/main.resources/lesson22.txt");
            //fileOutPutStream.write(str.getBytes(/*StandardCharsets.UTF_8*/));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
