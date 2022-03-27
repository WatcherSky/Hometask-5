package com.company;

public class Cat extends Animal {

        private String name = "Tom";

        public Cat(String food, String location) {
            super(food, location);

        }
        void makeNoise() {
        System.out.println("Cat издает звук meow");
    }

    public void eat() {
        System.out.println("Cat eats");
    }
}
