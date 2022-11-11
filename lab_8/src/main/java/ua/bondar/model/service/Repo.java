package ua.bondar.model.service;

import java.util.ArrayList;
import java.util.List;

public class Repo {

    private List<Memento> saves;

    public Repo() {
        saves = new ArrayList<>();
    }

    public void addSave(Memento memento) {
        System.out.println("Saving...\nDone. Repo saved your save!\n");
        saves.add(memento);
    }

    public Memento getSave(int index) {
        System.out.println("Loading...\n");
        return saves.get(index);
    }

    public Memento getLastSave() {
        //if repo is empty
        if (saves.size() == 0) {
            return null;
        }
        System.out.println("Loading...\n");
        return saves.get(saves.size() - 1);
    }

    public List<Memento> getSaves() {
        return saves;
    }
}
