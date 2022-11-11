package ua.bondar.model.service;

import ua.bondar.model.entity.Stats;

public class Memento {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Memento(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Stats getSavedStats() {
        return new Stats(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    public int sumAllStats() {
        return strength +
                dexterity +
                constitution +
                intelligence +
                wisdom +
                charisma;
    }
}
