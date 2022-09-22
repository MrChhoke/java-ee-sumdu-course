package ua.bondar.pattern.prototype;

import ua.bondar.pattern.prototype.shape.Shape;
import ua.bondar.pattern.prototype.shape.impl.Circle;
import ua.bondar.pattern.prototype.shape.impl.Rectangle;
import ua.bondar.pattern.prototype.shape.impl.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    Map<String, Shape> map = new HashMap<>(10);

    public Shape getShape(String idShape) {
        return  map.get(idShape).clone();
    }

    public void loadCache(){
        Shape circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        map.put(rectangle.getId(), rectangle);

        Shape square = new Square();
        square.setId("3");
        map.put(square.getId(), square);
    }




}
