package ua.bondar.race;


import lombok.Getter;
import ua.bondar.stat.Stats;
import ua.bondar.visitor.DataElementVisitor;

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

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
