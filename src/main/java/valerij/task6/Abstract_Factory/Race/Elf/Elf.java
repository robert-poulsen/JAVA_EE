package valerij.task6.Abstract_Factory.Race.Elf;


import valerij.task6.Abstract_Factory.Race.CharacterRace;
import valerij.task6.Abstract_Factory.Stats.Stats;


public class Elf extends CharacterRace {
    public Elf() {
        name = "Elf";
        bonuses = new Stats(0, 2, 0, 0, 1, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Hi, I'm an elf. Have you not seen orcs ?");
    }
}
