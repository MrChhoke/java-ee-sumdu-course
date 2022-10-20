package ua.bondar.race;

import ua.bondar.stat.Stats;
import ua.bondar.visitor.DataElementVisitor;

public class Dwarf extends CharacterRace{

    public Dwarf(){
        name = "Dwarf";
        bonuses = new Stats(0,0,2,0,1,0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Hi, a stranger, I am a dwarf, do you want to buy smth?");
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
