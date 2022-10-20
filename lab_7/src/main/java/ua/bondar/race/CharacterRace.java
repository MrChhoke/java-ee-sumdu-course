package ua.bondar.race;

import lombok.Getter;
import ua.bondar.stat.Stats;
import ua.bondar.visitor.DataElement;

@Getter
public abstract class CharacterRace implements DataElement {

    protected String name;

    protected Stats bonuses;

    public abstract void saySMTH();
}
