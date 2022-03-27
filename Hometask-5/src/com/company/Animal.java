package com.company;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Animal издает звук ...");
    }

    void eat() {
    System.out.println("I eat");
    }

    void sleep() {
        System.out.println("I sleep");
    }
}
