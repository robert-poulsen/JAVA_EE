package valerij.task4.memento;

public class Memento {
    private Stats state;

    public Memento() {

    }

    public Memento(Stats state) {
        this.state = state;
    }

    public void setState(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }
}
