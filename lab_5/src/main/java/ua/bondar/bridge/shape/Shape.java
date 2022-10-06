package ua.bondar.bridge.shape;

import ua.bondar.bridge.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void  draw();
}
