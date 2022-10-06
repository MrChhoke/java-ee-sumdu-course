package ua.bondar.bridge;

import ua.bondar.bridge.draw.GreenCircle;
import ua.bondar.bridge.draw.RedCircle;
import ua.bondar.bridge.shape.Circle;
import ua.bondar.bridge.shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 1, 100, 49);
        Shape greenCircle = new Circle(new GreenCircle(), 1, 100, 49);

        redCircle.draw();
        greenCircle.draw();
    }
}