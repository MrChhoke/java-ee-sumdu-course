package ua.bondar.clas;

import lombok.ToString;
import ua.bondar.visitor.DataElementVisitor;

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

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
