//Utwórz klasę CartItem zawierającą dwa pola:
//
//product – referencja do obiektu typu Product
//quantity – (int) – ilość powyższego produktu w koszyku.
package org.example;

public class CartItem {
    public Product product;
    public int quantity;
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
