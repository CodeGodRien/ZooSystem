package com.mycompany.zoosystem;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Fish sound");
    }

    @Override
    void eat() {
        System.out.println("The Fish is Eating.");
    }

    @Override
    void sleep() {
        System.out.println("The Fish is Sleeping.");
    }

    @Override
    public void swim() {
        System.out.println("The Fish is Swimming.");
    }
}