package valerij.task6.Abstract_Factory.Factory.Elf;


import valerij.task6.Abstract_Factory.Factory.RaceAbstractFactory;
import valerij.task6.Abstract_Factory.Race.CharacterRace;
import valerij.task6.Abstract_Factory.Race.Elf.Elf;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
