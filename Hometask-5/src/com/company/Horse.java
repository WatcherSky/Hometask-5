package com.company;

public class Horse extends Animal {

    private String name = "Jerry";  //это ведь поле?

    public Horse(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Horse издает звук laugh");
    }

    public void eat() {
        System.out.println("Horse eats");
    }

}
