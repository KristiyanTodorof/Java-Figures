package TaskTwo;

public abstract class Figure {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String getName() {
        return name;
    }
}
