package main.com.Design_Patterns;

import java.io.FileOutputStream;
import java.io.IOException;

public class fos {
    
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("output.txt");
        String outputText = "my Message";
        byte[] outputBytes= outputText.getBytes();
        fos.write(outputBytes);
        fos.close();
    }
}
