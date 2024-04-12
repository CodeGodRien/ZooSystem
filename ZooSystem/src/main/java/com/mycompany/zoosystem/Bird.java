package com.mycompany.zoosystem;

class Bird extends Animal implements Flyable {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("tweet");
    }

    @Override
    void eat() {
        System.out.println("The Bird is Eating.");
    }

    @Override
    void sleep() {
        System.out.println("The Bird is Sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("The Bird is Flying.");
    }
}