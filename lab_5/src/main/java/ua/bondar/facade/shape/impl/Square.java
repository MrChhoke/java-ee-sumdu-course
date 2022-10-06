package ua.bondar.facade.shape.impl;

import ua.bondar.facade.shape.Shape;

public class Square implements Shape {

    @Override
    public void findFreePosition() {
        System.out.println("The square is finding a free position... Done");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the square... Done");
    }

    @Override
    public void paintShape() {
        System.out.println("Painting the square... Done");
    }

}
