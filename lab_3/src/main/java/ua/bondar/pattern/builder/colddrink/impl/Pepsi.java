package ua.bondar.pattern.builder.colddrink.impl;

import ua.bondar.pattern.builder.colddrink.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 20F;
    }
}
