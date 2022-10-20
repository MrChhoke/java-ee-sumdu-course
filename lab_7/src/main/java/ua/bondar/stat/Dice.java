package ua.bondar.stat;

public class Dice {
    public static int roll(){
        double f = Math.random() / Math.nextDown(1.0);
        return (int)((1.0 - f) + (6D + 1) * f);
    }
}
