package ua.bondar.pattern.builder;

import java.util.ArrayList;

public class Meal {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return items.stream()
                .map(Item::price)
                .reduce(0F, Float::sum);
    }

    public void showItems() {
        items.forEach(item -> System.out.println(
                        "name: " + item.name() +
                        " price: " + item.price() +
                        " packing: " + item.packing().pack()
                )
        );
    }
}
