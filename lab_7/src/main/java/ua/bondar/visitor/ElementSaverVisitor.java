package ua.bondar.visitor;


import lombok.Getter;
import ua.bondar.Character;
import ua.bondar.clas.CharacterClass;
import ua.bondar.race.CharacterRace;
import ua.bondar.stat.Stats;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class ElementSaverVisitor implements DataElementVisitor {

    @Getter
    private final TreeMap<String, String> treeMap = new TreeMap<>();


    @Override
    public void visit(Character character) {
        treeMap.put("NameCharacter", character.getName());
    }

    @Override
    public void visit(Stats stats) {
        treeMap.putAll(stats.getStats().entrySet().stream().
                collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toString()))
        );
    }

    @Override
    public void visit(CharacterRace race) {
        treeMap.put("CharacterRace", race.getName());
        treeMap.putAll(race.getBonuses().getStats().entrySet().stream().
                collect(Collectors.toMap(e -> "bonus_" + e.getKey(), e -> e.getValue().toString()))
        );
    }

    @Override
    public void visit(CharacterClass characterClass) {
        treeMap.put("CharacterClass", characterClass.getName());
        treeMap.put("HP", String.valueOf(characterClass.getHp()));
    }

}
