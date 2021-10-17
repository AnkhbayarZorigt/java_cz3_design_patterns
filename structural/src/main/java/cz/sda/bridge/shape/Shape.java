package cz.sda.bridge.shape;

import cz.sda.bridge.colour.Colour;

public abstract class Shape {
    protected final Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public abstract void draw();
}
