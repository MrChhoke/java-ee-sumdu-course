package ua.bondar.pattern.builder.burger;

import ua.bondar.pattern.builder.Item;
import ua.bondar.pattern.builder.packing.Packing;
import ua.bondar.pattern.builder.packing.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
