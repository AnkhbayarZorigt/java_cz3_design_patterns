package cz.sda.bridge.shape;

import cz.sda.bridge.colour.Colour;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("This is a " + colour.get() + " circle");
    }
}
