package TaskTwo;

import java.util.ArrayList;

public class Cylinder extends Figure {
    private final Double radius;
    private final Double height;
    public Cylinder(String name, Double radius, Double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
