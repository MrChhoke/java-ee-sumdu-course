package ua.bondar.pattern.builder;

import ua.bondar.pattern.builder.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
