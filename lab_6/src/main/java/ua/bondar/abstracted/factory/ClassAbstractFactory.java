package ua.bondar.abstracted.factory;

import ua.bondar.abstracted.factory.clas.Barbarian;
import ua.bondar.abstracted.factory.clas.CharacterClass;
import ua.bondar.abstracted.factory.clas.Cleric;

public class ClassAbstractFactory {

    public static CharacterClass getClass(String type){
        switch (type){
            case "Cleric":
                return new Cleric();
            case "Barbarian":
                return new Barbarian();
            default:
                throw new IllegalArgumentException("Can`t find this type: " + type);
        }

    }

}
