package Task_12;

public class Counter {
    private final String name;
    private final String unit;

    private int value;

    public Counter(String name, String unit) {
        this(name, unit, 0);
    }

    public Counter(String name, String unit ,int value) {
        this.value = value;
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
