package ua.bondar.facade.shape.impl;

import ua.bondar.facade.shape.Shape;

public class Circle implements Shape {

    @Override
    public void findFreePosition() {
        System.out.println("The circle is finding a free position... Done");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the circle... Done");
    }

    @Override
    public void paintShape() {
        System.out.println("Painting the circle... Done");
    }
}
