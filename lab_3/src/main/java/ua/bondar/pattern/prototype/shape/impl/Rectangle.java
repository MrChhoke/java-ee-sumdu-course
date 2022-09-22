package ua.bondar.pattern.prototype.shape.impl;

import ua.bondar.pattern.prototype.shape.Shape;

public class Rectangle extends Shape implements Cloneable {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

}
