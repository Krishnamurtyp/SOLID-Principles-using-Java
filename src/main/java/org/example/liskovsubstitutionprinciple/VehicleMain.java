package org.example.liskovsubstitutionprinciple;

class Vehicle {
    void startEngine() {
        System.out.println("Starting the engine");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting a car's engine");
    }
}

class Bicycle extends Vehicle {
    // No engine for a bicycle
}

class Garage {
    void repair(Vehicle vehicle) {
        vehicle.startEngine();
        System.out.println("Performing other repair operations");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        garage.repair(car);
        garage.repair(bicycle);
    }
}
