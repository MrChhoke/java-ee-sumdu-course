package ua.bondar.pattern.prototype.shape.impl;

import ua.bondar.pattern.prototype.shape.Shape;

public class Circle extends Shape implements Cloneable {

    public Circle(){
        type = "Circle";
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
