package ua.bondar.abstracted.factory.clas;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
public class Cleric extends CharacterClass {

    private List<String> spells;

    public Cleric() {
        name = "Cleric";
        hp = 8;
        spells = List.of("Guidance", "Heal");
    }

    @Override
    public void printMagika() {
        System.out.print(String.join(",", spells));
    }
}
