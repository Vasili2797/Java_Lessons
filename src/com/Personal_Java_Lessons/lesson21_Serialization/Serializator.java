package com.Personal_Java_Lessons.lesson21_Serialization;

import java.io.*;

public class Serializator{

    public boolean serialization(Cat cat){
        boolean flag = false;
        File file = new File("src/resources/cat.data");
        ObjectOutputStream oos=null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos !=null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag =true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Cat deserialization() throws IOException {
        File file = new File("src/resources/cat.data");
        ObjectInputStream ois=null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis !=null) {
                ois = new ObjectInputStream(fis);
                Cat cat =(Cat) ois.readObject();
                return cat;
            }
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }finally {
            ois.close();
        }
        throw new InvalidObjectException("Object is invalid");
    }
}
