package main.com.JavaProgrammingMasterclassUpdatedToJava17.FileLessons.FileExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("CWD= "+new File("").getAbsolutePath());

        String fileName = "Java_Lessons\\src\\main\\com\\JavaProgrammingMasterclassUpdatedToJava17\\FIleLessons\\FileExceptions\\files\\testing.csv";
        testFile2(null);
//        File file = new File(fileName);
//        File file = new File(".",fileName);
        File file = new File(new File("").getAbsolutePath(), fileName);
        System.out.println("Patheth absoluteth: "+file.getAbsolutePath());
        if (!file.exists()) {
            System.err.println("The program will not run because file does not exist");
            System.err.println("Quitting Application");
            return;
        }
        System.out.println("Good");
        for(File f : File.listRoots()){
            System.out.println(f);
        }

        Path path = Paths.get("Java_Lessons\\src\\main\\com\\JavaProgrammingMasterclassUpdatedToJava17\\FileLessons\\FileExceptions\\files\\testing.csv");
        System.out.println("Patheth absoluteth: "+file.getAbsolutePath());
        if (!Files.exists(path)) {
            System.err.println("2. The program will not run because file does not exist");
            System.err.println("2. Quitting Application");
            return;
        }
        System.out.println("2. Good");
    }

    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);
        FileReader reader = null;
        try {
//            List<String> lines = Files.readAllLines(path);
            reader = new FileReader(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Find another way");
        }
        System.out.println("File exists and able to use as a resource");
    }

    private static void testFile2(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' does not exist");
            throw new RuntimeException(e);
        } catch (NullPointerException | IllegalArgumentException badData) {
            System.out.println("User has added bad data " + badData.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Something unrelated and unexpected happened");
        } finally {
            System.out.println("The finally block");
        }
        System.out.println("File exists and able to use as a resource");
    }
}
