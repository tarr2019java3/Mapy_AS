package pl.sda.mapy;

public class Generyka<T> {
    private T field;

    public Generyka(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
