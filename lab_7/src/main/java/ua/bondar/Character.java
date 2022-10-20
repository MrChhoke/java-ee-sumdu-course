package ua.bondar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.bondar.clas.CharacterClass;
import ua.bondar.race.CharacterRace;
import ua.bondar.stat.Stats;
import ua.bondar.visitor.DataElement;
import ua.bondar.visitor.DataElementVisitor;

@Setter
@Getter
@AllArgsConstructor
public class Character implements DataElement {

    private String name;
    private CharacterClass characterClass;
    private Stats attributes;
    private CharacterRace characterRace;


    public void addRaceBonus() {
        attributes.getStats().put(
                "constitution",
                // Костиль но не можна впхунуть дробне число в hashtable<String,Integer>
                (int) Math.round((characterClass.getHp() + Math.floor(attributes.getStats().get("constitution") / 2D) - 5))
        );
    }

    public void talk() {
        System.out.printf("My name is %s\n I have skills: ", name);
        characterClass.printMagika();
        System.out.print("\n~~~My attributes~~~~\n");
        attributes.getStats().entrySet().forEach(System.out::println);
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
