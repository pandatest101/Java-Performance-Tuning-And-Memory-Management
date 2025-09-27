package com.art.app;

public class Person {
    private final static String infoTemplate = "name : %s, age : %d";
    private static int personTotal = 0;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personTotal++;
    }

    public static int getPersonTotal(){
        return personTotal;
    }

    public void displayInfo() {
        System.out.println(String.format(infoTemplate, name, age));
    }
}
