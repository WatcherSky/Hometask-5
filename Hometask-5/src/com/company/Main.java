package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Animal cat = new Cat("fish", "house" );
        Animal dog = new Dog("meat", "yard" );
        Animal horse = new Horse("steam", "stall" );

        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();

        cat.eat();
        dog.eat();
        horse.eat();

        Veterinarian veterinarian = new Veterinarian();
        Animal[] pets = { cat, dog, horse };

        for (int i = 0; i < 3; i++ ) {
            veterinarian.treatAnimal(pets[i]);
        }
    }
}


//Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного.
//В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.