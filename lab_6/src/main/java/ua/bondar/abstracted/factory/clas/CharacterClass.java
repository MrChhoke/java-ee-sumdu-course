package ua.bondar.abstracted.factory.clas;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class CharacterClass {

    protected String name;
    protected int hp;

    public abstract void printMagika();
}
