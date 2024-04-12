package com.mycompany.zoosystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Animal{
    private String name;
    private int age;
    double weight;
    
    public Animal (String name, int age, double weight){ 
        this.name = name;
        this.age = age;
        this.weight = weight;
     }

    abstract void makeSound();

    abstract void eat();

    abstract void sleep();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

public class ZooSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Welcome to the Zoo Management System!");

        while (true) {
            System.out.println("Enter Choice");
            System.out.println("1. Bird 2. Ape, 3. Monkey, 4. View, 5. Exit");
            System.out.println("2. Ape");
            System.out.println("3. Monkey");
            System.out.println("4. View");
             System.out.println("4. Exit");
            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }

            System.out.println("Enter name:");
            String name = scanner.next();

            System.out.println("Enter age:");
            int age = scanner.nextInt();

            System.out.println("Enter weight:");
            double weight = scanner.nextDouble();

            Animal animal = null;
            switch (choice) {
                case 1:
                    animal = new Bird(name, age, weight);
                    break;
                case 2:
                    animal = new Ape(name, age, weight);
                    break;
                case 3:
                    animal = new Monkey(name, age, weight);
                    break;
                    
                    case 4:
                   System.out.println("\n Animals in the Zoo: ");
                for (Iterator<Animal> it = animals.iterator(); it.hasNext();) {
                    System.out.println(animal);
                }
                   break; 
 
                default:
                    System.out.println("Invalid input, Please try again.");
            }

            if (animal != null) {
                animals.add(animal);
                System.out.println("Animal added to the zoo!");
            }
        }

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }

            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}