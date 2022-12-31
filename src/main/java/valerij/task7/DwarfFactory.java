package valerij.task7;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
