package pl.coderslab.oop.advanced;

import java.util.Arrays;

public class ShoppingCart {
    CartItem[] cartItems = new CartItem[0];


    void addProduct(Product product, int quantity) {
        int index = doesProductExists(product);
        if (index < 0) {
            cartItems = Arrays.copyOf(this.cartItems, this.cartItems.length + 1);
            cartItems[cartItems.length - 1] = new CartItem(product, quantity);
        } else {
            cartItems[index].setQuantity(cartItems[index].getQuantity() + quantity);
        }
    }

    private int doesProductExists(Product product) {
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) {
                return i;
            }
        }
        return -1;
    }

    void removeProduct(Product product) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getName().equals(product.getName())) {
                cartItem.setQuantity(0);
            }
        }
    }

    void updateProduct(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getName().equals(product.getName())) {
                cartItem.setQuantity(quantity);
            }
        }
    }

    int getTotalQuantity() {
        int quantity = 0;
        for (CartItem cartItem : cartItems) {
            quantity += cartItem.getQuantity();
        }
        return quantity;
    }

    int getTotalSum() {
        int sum = 0;
        for (CartItem cartItem : cartItems) {
            sum += cartItem.getProduct().getPrice() * cartItem.getQuantity();
        }
        return sum;
    }

    void printReceipt() {
        for (CartItem cartItem : cartItems) {
            System.out.println(cartItem);
        }
        System.out.println("total:" + getTotalSum());
    }

}
