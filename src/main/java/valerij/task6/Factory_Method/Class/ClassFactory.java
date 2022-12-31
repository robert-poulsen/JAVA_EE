package valerij.task6.Factory_Method.Class;

import valerij.task6.Factory_Method.Character.CharacterClass;
import valerij.task6.Factory_Method.Class.Specialization.Fighter;
import valerij.task6.Factory_Method.Class.Specialization.Sorcerer;

public class ClassFactory {
    public static CharacterClass getClass(String type) {
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Sorcerer" -> new Sorcerer();
            default -> null;
        };
    }
}
