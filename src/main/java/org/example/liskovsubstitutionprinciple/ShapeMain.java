package org.example.liskovsubstitutionprinciple;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Client {
    void drawShape(Shape shape) {
        shape.draw();
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Client client = new Client();
        Shape circle = new Circle();
        Shape square = new Square();

        client.drawShape(circle);
        client.drawShape(square);

    }
}
