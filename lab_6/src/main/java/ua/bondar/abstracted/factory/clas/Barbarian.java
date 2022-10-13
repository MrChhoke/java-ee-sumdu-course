package ua.bondar.abstracted.factory.clas;

import lombok.ToString;

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
}
