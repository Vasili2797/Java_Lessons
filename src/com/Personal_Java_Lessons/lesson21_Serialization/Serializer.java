package com.Personal_Java_Lessons.lesson21_Serialization;

import java.io.*;

public class Serializer {

    public boolean serialization(Cat cat) throws SecurityException{
        boolean value=false;

        File file = new File("src/resources/cat.data");
        ObjectOutputStream oos=null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos!=null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                value=true;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(oos != null){
                try{
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
        return value;
    }
}
