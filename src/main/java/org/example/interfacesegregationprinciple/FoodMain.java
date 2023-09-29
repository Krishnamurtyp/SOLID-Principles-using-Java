package org.example.interfacesegregationprinciple;

// Step 1: Define Focused Interfaces
// Define an Eatable interface for entities that can be eaten.
interface Eatable {
    void eat();
}

// Define a Drinkable interface for entities that can be drunk.
interface Drinkable {
    void drink();
}

// Step 2: Implement Classes Using Relevant Interfaces
// Create a Fruit class that implements Eatable
class Fruit implements Eatable {
    @Override
    public void eat() {
        System.out.println("Eating the fruit.");
    }
}

// Create a Juice class that implements Drinkable.
class Juice implements Drinkable {
    @Override
    public void drink() {
        System.out.println("Drinking the juice.");
    }
}

public class FoodMain {
    public static void main(String[] args) {
        // Step 3: Demonstrate the Use of Interfaces
        // Create instances of Fruit and Juice.
        Fruit apple = new Fruit();
        Juice orangeJuice = new Juice();
        // Show how Fruit can be eaten.
        apple.eat();
        // Show how Juice can be drunk.
        orangeJuice.drink();
    }
}
