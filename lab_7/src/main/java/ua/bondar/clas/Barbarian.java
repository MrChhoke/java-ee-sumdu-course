package ua.bondar.clas;

import lombok.ToString;
import ua.bondar.visitor.DataElementVisitor;

@ToString
public class Barbarian extends CharacterClass {

    private String perk;

    public Barbarian() {
        name = "Barbarian";
        hp = 12;
        perk = "Battle Rage";
    }


    @Override
    public void printMagika() {
        System.out.print(perk);
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
