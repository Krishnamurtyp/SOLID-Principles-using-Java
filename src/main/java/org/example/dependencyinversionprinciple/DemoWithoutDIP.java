package org.example.dependencyinversionprinciple;

// High-level module
class Switch {
    private LightBulb bulb;

    public Switch() {
        this.bulb = new LightBulb();
    }

    public void operate() {
        bulb.turnOn();
    }
}

// Low-level module
class LightBulb {
    public void turnOn() {
        System.out.println("Light bulb is on.");
    }
}


public class DemoWithoutDIP {
    public static void main(String[] args) {
        Switch switcher = new Switch();
        switcher.operate();
    }
}
