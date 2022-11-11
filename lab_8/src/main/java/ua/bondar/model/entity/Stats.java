package ua.bondar.model.entity;

import ua.bondar.model.service.Memento;

import java.util.Map;
import java.util.TreeMap;

public class Stats implements java.io.Serializable {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public static Stats generate() {
        return new Stats(
                Dice.roll(),
                Dice.roll(),
                Dice.roll(),
                Dice.roll(),
                Dice.roll(),
                Dice.roll()
        );
    }

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Memento save() {
        return new Memento(
                strength,
                dexterity,
                constitution,
                intelligence,
                wisdom,
                charisma
        );
    }

    public void loadSavedState(Memento memento) {
        Stats savedState = memento.getSavedStats();
        strength = savedState.strength;
        dexterity = savedState.dexterity;
        constitution = savedState.constitution;
        intelligence = savedState.intelligence;
        wisdom = savedState.wisdom;
        charisma = savedState.charisma;
    }

    public Map<String, Integer> getValues() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("strength", strength);
        map.put("dexterity", dexterity);
        map.put("constitution", constitution);
        map.put("intelligence", intelligence);
        map.put("wisdom", wisdom);
        map.put("charisma", charisma);
        return map;
    }
}
