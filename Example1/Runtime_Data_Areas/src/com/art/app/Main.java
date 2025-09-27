package com.art.app;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Art", 25);
        person1.displayInfo();
        Person person2 = new Person("Ai", 23);
        person2.displayInfo();

        System.out.println(String.format("Current person count : %d",person1.getPersonTotal()));
    }
}