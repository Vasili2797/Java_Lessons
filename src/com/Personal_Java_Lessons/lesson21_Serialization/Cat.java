package com.Personal_Java_Lessons.lesson21_Serialization;

import java.io.Serializable;

public class Cat implements Serializable {

    private String name;
    private static String a="1";
    private transient String b="2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
