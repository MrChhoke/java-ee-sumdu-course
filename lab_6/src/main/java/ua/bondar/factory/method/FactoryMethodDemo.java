package ua.bondar.factory.method;

import ua.bondar.factory.method.factory.DwarfFactory;
import ua.bondar.factory.method.factory.ElfFactory;
import ua.bondar.factory.method.factory.RaceAbstractFactory;
import ua.bondar.factory.method.race.CharacterRace;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        RaceAbstractFactory raceFactory = new DwarfFactory();

        Character patron = new Character("Patron", raceFactory.create());
        patron.talk();

        System.out.print("\n\n===================\n\n");

        raceFactory = new ElfFactory();
        patron = new Character("Patron", raceFactory.create());
        patron.talk();
    }

}
