package pl.coderslab.oop.inheritance;

public class Shape {
    private int x;
    private int y;

    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription
            () {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public double getDistance(Shape shape2) {
        return Math.sqrt((this.x - shape2.x) ^ 2 + (this.y - shape2.y) ^ 2);
    }
}
