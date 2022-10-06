package ua.bondar.facade.shape.impl;

import ua.bondar.facade.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void findFreePosition() {
        System.out.println("The rectangle is finding a free position... Done");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the rectangle... Done");
    }

    @Override
    public void paintShape() {
        System.out.println("Painting the rectangle... Done");
    }

}
