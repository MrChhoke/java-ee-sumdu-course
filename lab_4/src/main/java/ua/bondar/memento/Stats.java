package ua.bondar.memento;

public class Stats {

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

    public void printStats() {
        System.out.println("~~~~~attributes~~~~~");
        System.out.printf("strength: %d\n", strength);
        System.out.printf("dexterity: %d\n", dexterity);
        System.out.printf("constitution: %d\n", constitution);
        System.out.printf("intelligence: %d\n", intelligence);
        System.out.printf("wisdom: %d\n", wisdom);
        System.out.printf("charisma: %d\n", charisma);
    }
}
