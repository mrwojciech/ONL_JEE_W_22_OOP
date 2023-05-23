package pl.coderslab.oop.advanced;

public class Product {

    public static int counter = 1;

    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = counter;
        this.name = name;
        this.price = price;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws NotValidPriceException {
        if (price < 0.01) {
            throw new NotValidPriceException("Cena nie moze byc mniejsz niz 0.01");

        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
