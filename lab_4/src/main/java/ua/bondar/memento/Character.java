package ua.bondar.memento;

public class Character {

    private String name;
    private String race;
    private Stats attributes;

    public Character(String name, String race) {
        this.name = name;
        this.race = race;
        attributes = Stats.generate();
    }

    public void printInfo() {
        System.out.println("Name:" + name
                + "\nRace: " + race);
        attributes.printStats();
        System.out.println();
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
