package ua.bondar.pattern.prototype;

import ua.bondar.pattern.prototype.shape.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();

        Shape firstAttempt = shapeCache.getShape("1");
        Shape secondAttempt = shapeCache.getShape("1");

        System.out.println(
                "===========================\nfirst attempt\n" +
                        "id: " + firstAttempt.getId() + "\n" +
                        "type: " + firstAttempt.getType() + "\n" +
                        "hashcode: " + firstAttempt.hashCode()
        );
        System.out.println(
                "===========================\nsecond attempt\n" +
                        "id: " + secondAttempt.getId() + "\n" +
                        "type: " + secondAttempt.getType() + "\n" +
                        "hashcode: " + secondAttempt.hashCode()
        );


        System.out.println("\n\n\n");



        firstAttempt = shapeCache.getShape("2");
        secondAttempt = shapeCache.getShape("2");

        System.out.println(
                "===========================\nfirst attempt\n" +
                        "id: " + firstAttempt.getId() + "\n" +
                        "type: " + firstAttempt.getType() + "\n" +
                        "hashcode: " + firstAttempt.hashCode()
        );
        System.out.println(
                "===========================\nsecond attempt\n" +
                        "id: " + secondAttempt.getId() + "\n" +
                        "type: " + secondAttempt.getType() + "\n" +
                        "hashcode: " + secondAttempt.hashCode()
        );


        System.out.println("\n\n\n");


        firstAttempt = shapeCache.getShape("3");
        secondAttempt = shapeCache.getShape("3");

        System.out.println(
                "===========================\nfirst attempt\n" +
                        "id: " + firstAttempt.getId() + "\n" +
                        "type: " + firstAttempt.getType() + "\n" +
                        "hashcode: " + firstAttempt.hashCode()
        );
        System.out.println(
                "===========================\nsecond attempt\n" +
                        "id: " + secondAttempt.getId() + "\n" +
                        "type: " + secondAttempt.getType() + "\n" +
                        "hashcode: " + secondAttempt.hashCode()
        );
    }
}
