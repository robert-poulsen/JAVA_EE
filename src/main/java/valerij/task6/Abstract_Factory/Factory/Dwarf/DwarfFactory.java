package valerij.task6.Abstract_Factory.Factory.Dwarf;


import valerij.task6.Abstract_Factory.Factory.RaceAbstractFactory;
import valerij.task6.Abstract_Factory.Race.CharacterRace;
import valerij.task6.Abstract_Factory.Race.Dwarf.Dwarf;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
