package valerij.task3.builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
