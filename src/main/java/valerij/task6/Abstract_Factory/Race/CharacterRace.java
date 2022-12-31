package valerij.task6.Abstract_Factory.Race;


import valerij.task6.Abstract_Factory.Stats.Stats;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;
    public Stats getRaceBonuses() {
        return bonuses;
    }

    public void print() {
        System.out.println("Race: " + name);

        for (String title : bonuses.getStats().keySet()) {
            System.out.println("Race bonus: " + title + " +" + bonuses.getStats().get(title));
        }

        System.out.println();
    }

    public abstract void saySMTH();
}
