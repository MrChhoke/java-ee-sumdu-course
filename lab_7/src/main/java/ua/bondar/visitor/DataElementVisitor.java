package ua.bondar.visitor;

import ua.bondar.Character;
import ua.bondar.clas.CharacterClass;
import ua.bondar.race.CharacterRace;
import ua.bondar.stat.Stats;

import java.util.TreeMap;

public interface DataElementVisitor {

    void visit(Character character);

    void visit(Stats stats);

    void visit(CharacterRace race);

    void visit(CharacterClass race);

}
