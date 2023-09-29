package org.example.opencloseprinciple;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw a rectangle");
    }
}

class Drawing {
    void drawShape(Shape shape) {
        shape.draw();
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        drawing.drawShape(circle);
        drawing.drawShape(rectangle);
    }
}
