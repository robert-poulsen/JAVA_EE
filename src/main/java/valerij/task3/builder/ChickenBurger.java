package valerij.task3.builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
