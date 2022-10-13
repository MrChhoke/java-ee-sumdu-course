package ua.bondar.abstracted.factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Character patron = new Character("Patron", ClassAbstractFactory.getClass("Cleric"));
        patron.talk();

        System.out.println("\nPatron activated his bonus\n");

        patron.addRaceBonus();
        patron.talk();

        System.out.println("\nPatron changed his class\n\n");


        patron = new Character("Patron", ClassAbstractFactory.getClass("Barbarian"));
        patron.talk();

        System.out.println("\nPatron activated his bonus\n");

        patron.addRaceBonus();
        patron.talk();
    }
}