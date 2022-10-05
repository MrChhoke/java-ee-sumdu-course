package ua.bondar.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Character character = new Character("Patron", "Dog");
        Repo repo = new Repo();

        character.printInfo();
        Memento save = character.getAttributes().save();
        repo.addSave(save);

        character.regenerateAttributes();
        character.printInfo();
        save = character.getAttributes().save();
        repo.addSave(save);

        System.out.println("\n\nLoad the first save");
        character.loadAttributes(repo.getSave(0));
        character.printInfo();

    }
}
