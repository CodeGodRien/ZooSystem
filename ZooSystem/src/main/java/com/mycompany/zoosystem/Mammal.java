package com.mycompany.zoosystem;

class Mammal extends Animal {
    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Habitat - Jungle");
        System.out.println("ror");
    }

    @Override
    void eat() {
        System.out.println("The Mammal is eating.");
    }

    @Override
    void sleep() {
        System.out.println("The Mammal is Sleeping");
    }
}