package ua.bondar.factory.method.race;

import lombok.Getter;
import ua.bondar.factory.method.stat.Stats;

@Getter
public abstract class CharacterRace {

    protected String name;

    protected Stats bonuses;

    public abstract void saySMTH();
}
