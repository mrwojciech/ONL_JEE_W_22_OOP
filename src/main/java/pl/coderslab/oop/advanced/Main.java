package pl.coderslab.oop.advanced;

public class Main {
    public static void main(String[] args) {
        System.out.println(AdvanceCalculator.computeCircleArea(12));
        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
        AdvanceCalculator calculator3 = new AdvanceCalculator();

        calculator.add(2, 4);
        Calculator.printOperations();
        System.out.println();
        calculator2.multiply(4, 5);
        System.out.println();
        Calculator.printOperations();
        System.out.println();
        calculator3.power(2, 6);
        System.out.println();
        Calculator.printOperations();
        System.out.println();
        Calculator.printOperations(2);
        System.out.println();
        calculator3.printGlobalOperations();
        System.out.println();
        calculator3.printGlobalOperations(1);

        Product product = new Product("dzik", 12.99);
        Product product1 = new Product("mleko", 12.91);
        try {
            product1.setPrice(0);
        } catch (NotValidPriceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(product);
        System.out.println(product1);
        try {
            product1.setPrice(12);
        } catch (NotValidPriceException e) {
            throw new RuntimeException(e);
        }
        System.out.println(product1);
        System.out.println();
        CartItem cartItem1 = new CartItem(product,3);
        CartItem cartItem2 = new CartItem(product,1);
        cartItem1.toString();
        ShoppingCart shoppingCart =new ShoppingCart();
       // System.out.println(shoppingCart.cartItems);
        System.out.println(shoppingCart.getTotalSum());
        shoppingCart.addProduct(product1,4);
        shoppingCart.printReceipt();
        shoppingCart.addProduct(product1,4);
        shoppingCart.printReceipt();
        shoppingCart.addProduct(product,100);
        shoppingCart.printReceipt();
        shoppingCart.updateProduct(product,5);
        shoppingCart.printReceipt();
        shoppingCart.removeProduct(product);
        shoppingCart.printReceipt();
        System.out.println(shoppingCart.getTotalQuantity());

    }


}
