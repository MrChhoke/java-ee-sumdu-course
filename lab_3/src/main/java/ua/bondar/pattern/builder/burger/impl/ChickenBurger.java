package ua.bondar.pattern.builder.burger.impl;

import ua.bondar.pattern.builder.burger.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 30F;
    }
}
