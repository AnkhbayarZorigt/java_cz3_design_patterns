package cz.sda.bridge;

import cz.sda.bridge.colour.Black;
import cz.sda.bridge.colour.Blue;
import cz.sda.bridge.colour.Green;
import cz.sda.bridge.colour.Red;
import cz.sda.bridge.shape.Circle;
import cz.sda.bridge.shape.Shape;
import cz.sda.bridge.shape.Square;
import cz.sda.bridge.shape.Triangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(new Red()),
                new Square(new Blue()),
                new Square(new Red()),
                new Circle(new Blue()),
                new Square(new Black()),
                new Circle(new Green()),
                new Triangle(new Black()));

        shapes.forEach(Shape::draw);
    }
}
