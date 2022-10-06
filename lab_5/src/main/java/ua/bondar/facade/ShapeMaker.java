package ua.bondar.facade;

import ua.bondar.facade.shape.Shape;
import ua.bondar.facade.shape.impl.Circle;
import ua.bondar.facade.shape.impl.Rectangle;
import ua.bondar.facade.shape.impl.Square;

public class ShapeMaker {

    public Shape makeCircle() {
        Shape circle = new Circle();
        circle.findFreePosition();
        circle.draw();
        circle.paintShape();
        return circle;
    }

    public Shape makeSquare() {
        Shape square = new Square();
        square.findFreePosition();
        square.draw();
        square.paintShape();
        return square;
    }

    public Shape makeRectangle() {
        Shape rectangle = new Rectangle();
        rectangle.findFreePosition();
        rectangle.draw();
        rectangle.paintShape();
        return rectangle;
    }

}
