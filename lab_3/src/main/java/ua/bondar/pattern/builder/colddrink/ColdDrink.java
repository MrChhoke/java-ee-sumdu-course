package ua.bondar.pattern.builder.colddrink;

import ua.bondar.pattern.builder.Item;
import ua.bondar.pattern.builder.packing.Packing;
import ua.bondar.pattern.builder.packing.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
