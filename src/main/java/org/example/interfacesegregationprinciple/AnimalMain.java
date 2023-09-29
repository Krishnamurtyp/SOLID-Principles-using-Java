package org.example.interfacesegregationprinciple;

// Step 1: Define Focused Interfaces
// Define a Flyable interface for entities that can fly
interface Flyable {
    void fly();
}

// Define a Swimmable interface for entities that can swim
interface Swimmable {
    void swim();
}

// Define a Walkable interface for entities that can walk
interface Walkable {
    void walk();
}

// Step 2: Implement Classes Using Relevant Interfaces
// Create a Bird class that implements Flyable and Walkable
class Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }
}

// Create a Fish class that implements Swimmable
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Step 3: Demonstrate the Use of Interfaces
        // Create instances of Bird and Fish.
        Bird bird = new Bird();
        Fish fish = new Fish();

        // Show how Bird can fly and walk.
        bird.fly();
        bird.walk();

        // Show how Fish can swim.
        fish.swim();
    }
}
