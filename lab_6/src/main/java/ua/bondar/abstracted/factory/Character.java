package ua.bondar.abstracted.factory;

import lombok.Getter;
import lombok.Setter;
import ua.bondar.abstracted.factory.clas.CharacterClass;
import ua.bondar.abstracted.factory.stat.Stats;

@Setter
@Getter
public class Character {

    private String name;
    private CharacterClass characterClass;
    private Stats attributes;

    public Character(String name, CharacterClass characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        attributes = Stats.generate();
    }

    public void addRaceBonus() {
        attributes.getStats().put(
                "constitution",
                // Костиль но не можна впхунуть дробне число в hashtable<String,Integer>
                (int) Math.round((characterClass.getHp() + Math.floor(attributes.getStats().get("constitution") / 2D) - 5))
        );
    }

    public void talk(){
        System.out.printf("My name is %s\n I have skills: ", name);
        characterClass.printMagika();
        System.out.print("\n~~~My attributes~~~~\n");
        attributes.getStats().entrySet().forEach(System.out::println);
    }
}
