package ua.bondar.pattern.builder.colddrink.impl;

import ua.bondar.pattern.builder.colddrink.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30F;
    }
}
