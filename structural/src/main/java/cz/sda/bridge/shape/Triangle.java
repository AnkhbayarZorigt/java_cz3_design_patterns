package cz.sda.bridge.shape;

import cz.sda.bridge.colour.Colour;

public class Triangle extends Shape {

    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("This is a " + colour.get() + " triangle");
    }
}
