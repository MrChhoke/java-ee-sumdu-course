package ua.bondar.factory.method.race;

import lombok.Getter;
import ua.bondar.factory.method.stat.Stats;

@Getter
public class Elf extends CharacterRace {

    public Elf() {
        name = "Elf";
        bonuses = new Stats(0, 2, 0, 1, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("I am an elf. GIVE ME YOUR GOLD");
    }

}
