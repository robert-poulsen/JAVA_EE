package valerij.task6.Abstract_Factory;

import valerij.task6.Abstract_Factory.Character.Character;
import valerij.task6.Abstract_Factory.Factory.Dwarf.DwarfFactory;
import valerij.task6.Abstract_Factory.Factory.Elf.ElfFactory;
import valerij.task6.Abstract_Factory.Factory.RaceAbstractFactory;

public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory = new DwarfFactory();

        Character character = new Character("Dwarf", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();

        raceAbstractFactory = new ElfFactory();

        character = new Character("Elf", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();
    }
}
