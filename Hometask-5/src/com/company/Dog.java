package com.company;

public class Dog extends Animal {

    private String name = "Spike";

    public Dog(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Dog издает звук bark");
    }

    public void eat() {
        System.out.println("Dog eats");
    }
}
