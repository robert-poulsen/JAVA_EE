package valerij.task6.Factory_Method.Class.Specialization;

import valerij.task6.Factory_Method.Character.CharacterClass;

public class Fighter extends CharacterClass {
    private String perk;

    public Fighter() {
        this.name = "Fighter";
        this.hp = 10;
        this.perk = "Extra Attack";
    }

    @Override
    public void printMagica() {
        System.out.println("Character " + name + " has the ability " + perk);
    }
}