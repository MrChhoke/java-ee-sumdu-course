package ua.bondar.abstracted.factory.stat;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
public class Stats {

    private HashMap<String, Integer> stats;

    private Stats(){
        stats = new HashMap<>();
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
}
