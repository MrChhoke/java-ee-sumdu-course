package ua.bondar.factory.method;

import lombok.Getter;
import ua.bondar.factory.method.race.CharacterRace;
import ua.bondar.factory.method.stat.Dice;
import ua.bondar.factory.method.stat.Stats;

import java.util.Map;

@Getter
public class Character {

    private String name;
    private CharacterRace race;
    private Stats stats;

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;

        stats = Stats.generate();

        // Додавання додаткових характеристик персонажа
        for(Map.Entry<String, Integer> stat : race.getBonuses().getStats().entrySet()){
            stats.getStats().put(stat.getKey(), stats.getStats().get(stat.getKey()) + stat.getValue());
        }
    }

    public void talk(){
        System.out.printf("Name: %s\nRace: %s\n", name, race.getName());
        race.saySMTH();
        System.out.println("~~~~Attribute~~~~");
        stats.getStats().entrySet().forEach(System.out::println);
    }
}
