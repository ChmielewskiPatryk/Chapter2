package org.example;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple");
        Product orange = new Product("Orange");
        Product banana = new Product("Banana");
        apple.setPrice(3.50);
        orange.setPrice(2.2);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(apple, 2);
        cart.addProduct(orange,3);
        cart.removeProduct(apple);
        System.out.println("__________________________________");
        System.out.println(cart.getTotalQuantity());
        System.out.println("__________________________________");
        System.out.println(cart.getTotalSum());
        System.out.println("__________________________________");
        cart.printReceipt();


    }
}