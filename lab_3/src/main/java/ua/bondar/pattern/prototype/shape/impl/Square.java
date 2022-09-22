package ua.bondar.pattern.prototype.shape.impl;

import ua.bondar.pattern.prototype.shape.Shape;

public class Square extends Shape implements Cloneable {

    public Square(){
        type = "Square";
    }

    @Override
    public Square clone() {
        try {
            return (Square) super.clone();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
