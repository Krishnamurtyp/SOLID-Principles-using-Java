package org.example.dependencyinversionprinciple;

interface Switchable {
    void turnOn();
}

class Switch2 {
    private Switchable device;

    public Switch2(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

class LightBulb2 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on.");
    }
}

public class DemoWithDIP {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb2();
        Switchable fan = new Fan();

        Switch2 switcher1 = new Switch2(bulb);
        Switch2 switcher2 = new Switch2(fan);

        switcher1.operate();
        switcher2.operate();
    }
}
