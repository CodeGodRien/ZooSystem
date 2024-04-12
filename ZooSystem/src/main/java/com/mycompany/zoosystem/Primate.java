package com.mycompany.zoosystem;

class Primate extends Mammal {
    public Primate(String name, int age, double weight) {
        super(name, age, weight);
    }
}

class Ape extends Primate implements Swimmable {
    public Ape(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void swim() {
        System.out.println("Habitat - Savannah");
        System.out.println("Ape swims");
    }
}
class Monkey extends Primate implements Swimmable, Flyable {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void swim() {
        System.out.println("The Monkey is Swimming,");
    }

    public void climb() {
        System.out.println("The Monkey is Climbing.");
    }

    public void fly() {
        throw new UnsupportedOperationException("The Monkey cannot fly."); 
    }
}