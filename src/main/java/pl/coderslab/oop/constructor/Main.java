package pl.coderslab.oop.constructor;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger();
        Burger burger1 = new Burger(12, 23.33);

     Calculator c1 = new Calculator();
     Calculator c2 = new Calculator();
     Calculator c3 = new Calculator();
     Calculator c4 = new Calculator();

        System.out.println(c1.add(2, 4));
        c1.printOperations();
        System.out.println(c2.substract(5, 7.3));
        c2.printOperations();
        c3.printOperations();
        System.out.println(c3.divide(4, 7));
        System.out.println(c3.multiply(3, 9));
        c3.printOperations();
    }


}
