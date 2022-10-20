package ua.bondar;

import ua.bondar.clas.Barbarian;
import ua.bondar.json.JsonSaver;
import ua.bondar.race.Dwarf;
import ua.bondar.stat.Stats;
import ua.bondar.visitor.DataElementVisitor;
import ua.bondar.visitor.ElementConsoleVisitor;
import ua.bondar.visitor.ElementSaverVisitor;

import java.util.TreeMap;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Character patron = new Character("Patron", new Barbarian(), Stats.generate(), new Dwarf());

        ElementSaverVisitor saver = new ElementSaverVisitor();

        patron.acceptOperation(saver);
        patron.getCharacterRace().acceptOperation(saver);
        patron.getCharacterClass().acceptOperation(saver);
        patron.getAttributes().acceptOperation(saver);

        TreeMap<String, String> treeMap = saver.getTreeMap();

        DataElementVisitor dataElementVisitor = new ElementConsoleVisitor();
        patron.acceptOperation(dataElementVisitor);
        patron.getCharacterRace().acceptOperation(dataElementVisitor);
        patron.getCharacterClass().acceptOperation(dataElementVisitor);
        patron.getAttributes().acceptOperation(dataElementVisitor);

        JsonSaver jsonSaver = new JsonSaver();
        jsonSaver.write("lab_7/src/main/resources/test.json", treeMap);
    }
}