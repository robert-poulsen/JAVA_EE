package valerij.task7;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
