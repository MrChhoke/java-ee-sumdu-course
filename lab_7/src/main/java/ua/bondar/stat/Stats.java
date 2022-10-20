package ua.bondar.stat;

import lombok.Getter;
import lombok.Setter;
import ua.bondar.visitor.DataElement;
import ua.bondar.visitor.DataElementVisitor;

import java.util.HashMap;

@Setter
@Getter
public class Stats implements DataElement {

    private HashMap<String, Integer> stats;

    public Stats(){
        stats = new HashMap<>();
    }

    public Stats(int strength,
                 int dexterity,
                 int constitution,
                 int intelligence,
                 int wisdom,
                 int charisma) {
        stats = new HashMap<>();

        stats.put("strength", strength);
        stats.put("dexterity", dexterity);
        stats.put("constitution", constitution);
        stats.put("intelligence", intelligence);
        stats.put("wisdom", wisdom);
        stats.put("charisma", charisma);
    }

    public static Stats generate(){
        Stats stats = new Stats();

        stats.stats.put("strength", Dice.roll());
        stats.stats.put("dexterity", Dice.roll());
        stats.stats.put("constitution", Dice.roll());
        stats.stats.put("intelligence", Dice.roll());
        stats.stats.put("wisdom", Dice.roll());
        stats.stats.put("charisma", Dice.roll());

        return stats;
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
