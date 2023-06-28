package main.com.GeorgianLessons.GeoLab_Lesson01.Programming5;

import java.io.*;

public class HelloFiles {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\com\\GeorgianLessons\\GeoLab_Lesson01\\Programming5\\shnuri.txt"));
            String line = reader.readLine();

            PrintWriter rw = new PrintWriter(new FileWriter("output.txt"));
            while(line!= null) {
                System.out.println(line);
                line = reader.readLine();
                if (line !=null && !line.isEmpty()) {
                    rw.append(line.substring(2));
                }
                rw.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
