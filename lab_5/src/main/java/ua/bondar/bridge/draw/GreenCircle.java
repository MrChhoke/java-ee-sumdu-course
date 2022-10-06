package ua.bondar.bridge.draw;

public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("GreenCircle (radius: %d, x: %d, y: %d)\n", radius, x, y);
    }
}
