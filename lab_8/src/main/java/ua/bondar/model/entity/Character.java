package ua.bondar.model.entity;

import ua.bondar.model.service.Memento;

public class Character implements java.io.Serializable {

    private String name;
    private Race race;
    private Stats attributes;

    public Character(String name, Race race) {
        this.name = name;
        this.race = race;
        attributes = Stats.generate();
    }

    public void regenerateAttributes(){
        attributes = Stats.generate();
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void loadAttributes(Memento memento) {
        this.attributes.loadSavedState(memento);
    }
}
