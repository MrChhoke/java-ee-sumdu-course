package ua.bondar.bridge.shape;

import ua.bondar.bridge.draw.DrawAPI;

public class Circle extends Shape {

    private int x;

    private int y;

    private int radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
