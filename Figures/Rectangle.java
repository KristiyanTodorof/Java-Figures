package TaskTwo;

public class Rectangle extends Figure {
    private final Integer a;
    private final Integer b;
    public Rectangle(String name,Integer a, Integer b ) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
