package ua.bondar.bridge.draw;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("RedCircle (radius: %d, x: %d, y: %d)\n", radius, x, y);
    }
}
