package ua.bondar.clas;

import lombok.Getter;
import lombok.ToString;
import ua.bondar.visitor.DataElement;

@Getter
@ToString
public abstract class CharacterClass implements DataElement {

    protected String name;
    protected int hp;

    public abstract void printMagika();
}
