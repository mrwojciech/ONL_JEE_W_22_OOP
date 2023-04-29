package pl.coderslab.oop.constructor;

public class Burger {

    int size;
    double price;

    public Burger() {
    }

    public Burger(int size, double price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
