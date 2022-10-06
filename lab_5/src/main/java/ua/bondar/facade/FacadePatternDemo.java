package ua.bondar.facade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.makeCircle();
        System.out.println();

        shapeMaker.makeSquare();
        System.out.println();

        shapeMaker.makeRectangle();
    }

}
