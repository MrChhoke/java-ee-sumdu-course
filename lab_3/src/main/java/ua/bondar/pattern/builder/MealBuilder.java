package ua.bondar.pattern.builder;

import ua.bondar.pattern.builder.burger.Burger;
import ua.bondar.pattern.builder.burger.impl.ChickenBurger;
import ua.bondar.pattern.builder.burger.impl.VegBurger;
import ua.bondar.pattern.builder.colddrink.impl.Coke;
import ua.bondar.pattern.builder.colddrink.impl.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal vegMeal = new Meal();

        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new VegBurger());

        vegMeal.addItem(new Pepsi());
        vegMeal.addItem(new Coke());
        vegMeal.addItem(new Pepsi());

        return vegMeal;
    }

    public Meal prepareNonVegMeal(){
        Meal nonVegMeal = new Meal();

        Burger chickenBurger = new ChickenBurger();
        nonVegMeal.addItem(chickenBurger);
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new ChickenBurger());

        nonVegMeal.addItem(new Coke());
        nonVegMeal.addItem(new Pepsi());
        nonVegMeal.addItem(new Pepsi());

        return nonVegMeal;
    }

}
