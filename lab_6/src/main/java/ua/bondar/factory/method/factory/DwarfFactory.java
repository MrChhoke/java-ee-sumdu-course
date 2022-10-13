package ua.bondar.factory.method.factory;

import ua.bondar.factory.method.race.CharacterRace;
import ua.bondar.factory.method.race.Dwarf;

public class DwarfFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
