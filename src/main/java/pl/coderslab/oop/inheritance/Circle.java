package pl.coderslab.oop.inheritance;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getCircuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "radius= " + radius;
    }
}
