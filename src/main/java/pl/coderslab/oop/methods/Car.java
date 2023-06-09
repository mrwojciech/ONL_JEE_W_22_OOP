package pl.coderslab.oop.methods;

public class Car {
    String brand;
    String model;
    double price;

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + ", price=" + price + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
