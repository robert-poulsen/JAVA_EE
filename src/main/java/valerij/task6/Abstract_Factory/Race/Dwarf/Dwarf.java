package valerij.task6.Abstract_Factory.Race.Dwarf;


import valerij.task6.Abstract_Factory.Race.CharacterRace;
import valerij.task6.Abstract_Factory.Stats.Stats;

public class Dwarf extends CharacterRace {
    public Dwarf(){
        this.name = "Dwarf";
        this.bonuses = new Stats(2, 0, 2, 0, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Hi, I'm a dwarf. I went to work in the mine!");
    }
}
