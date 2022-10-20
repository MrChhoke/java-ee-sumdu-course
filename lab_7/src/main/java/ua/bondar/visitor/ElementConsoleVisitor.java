package ua.bondar.visitor;

import ua.bondar.Character;
import ua.bondar.clas.CharacterClass;
import ua.bondar.race.CharacterRace;
import ua.bondar.stat.Stats;

public class ElementConsoleVisitor implements DataElementVisitor{
    @Override
    public void visit(Character character) {
        System.out.println("NameCharacter: " + character.getName());
    }

    @Override
    public void visit(Stats stats) {
        stats.getStats().forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }

    @Override
    public void visit(CharacterRace race) {
        System.out.println("CharacterRace: " + race.getName());
        race.getBonuses().getStats().forEach((key, value) -> System.out.printf("bonus_%s: %d\n", key, value));
    }

    @Override
    public void visit(CharacterClass characterClass) {
        System.out.println("CharacterClass: " + characterClass.getName());
        System.out.println("HP: " + characterClass.getHp());
    }
}
