package ua.bondar.pattern.builder.packing.impl;

import ua.bondar.pattern.builder.packing.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
