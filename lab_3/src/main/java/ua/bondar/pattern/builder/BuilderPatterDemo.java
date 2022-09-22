package ua.bondar.pattern.builder;

public class BuilderPatterDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVeganMeal = mealBuilder.prepareNonVegMeal();
        Meal veganMeal = mealBuilder.prepareVegMeal();

        nonVeganMeal.showItems();
        System.out.println(
                "total price: " + nonVeganMeal.getCost() +
                "\n=========================================="
        );

        veganMeal.showItems();
        System.out.println(
                "total price: " + veganMeal.getCost() +
                "\n=========================================="
        );
    }
}
