package ua.bondar.pattern.builder.burger.impl;

import ua.bondar.pattern.builder.burger.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25F;
    }
}
