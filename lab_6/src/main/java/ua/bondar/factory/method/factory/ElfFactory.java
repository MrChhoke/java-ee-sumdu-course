package ua.bondar.factory.method.factory;

import ua.bondar.factory.method.race.CharacterRace;
import ua.bondar.factory.method.race.Elf;

public class ElfFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
