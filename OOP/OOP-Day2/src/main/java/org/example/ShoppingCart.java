//Utwórz klasę ShoppingCart. Klasa ta ma posiadać następujące atrybuty:
//
//cartItems – tablica z obiektami klasy CartItem.
//Do tej zmiennej nie powinno być ustawionych ani getterów, ani setterów.
//
//Klasa powinna mieć też następujące metody:
//
//addProduct(Product product, int quantity) – metoda ta powinna dodawać nowy obiekt CartItem do tablicy cartItems. Przy dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości.
//removeProduct(Product product) – metoda ta powinna usuwać wszystkie sztuki produktu z koszyka.
//updateProduct(Product product, int quantity) – metoda ta powinna zmieniać ilość danego produktu w koszyku.
//getTotalQuantity() – metoda ta ma zwracać łączną ilość wszystkich produktów w koszyku.
//getTotalSum() – metoda ta ma zwracać łączną wartość wszystkich produktów w koszyku.
//printReceipt() – metoda drukująca paragon.
//Na paragonie powinno się znaleźć: lista wszystkich produktów, wraz z ich id, nazwą, ceną, ilością i łączną ceną ,łączna kwota za wszystkie produkty znajdujące się w koszyku. Zwracaj ciąg znaków w postaci:
//1: Produkt 1, 2x2.5 = 5.0
//2: Produkt 2, 3x12.0 = 36.0
//3: Produkt 3, 1x1 = 1
//---
//Razem: 42.0
package org.example;

import java.util.Arrays;

public class ShoppingCart {
    CartItem[] cartItems = new CartItem[0];

    public void addProduct(Product product, int quantity) {
        boolean isInCart = isInCart(product);

        for (CartItem item : cartItems) {
            if (item.product.equals(product)) {
                item.quantity += quantity;
            }
        }
        if (!isInCart) {
            if (product.getPrice() != 0) {
                cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
                cartItems[cartItems.length - 1] = new CartItem(product, quantity);
            } else {
                System.out.println("This item have not set price you can not add it to the card");
            }

        }
    }
    public void removeProduct(Product product) {
        boolean isInCart = isInCart(product);

        if (isInCart) {
            CartItem[] cartItemCopy = cartItems;
            cartItems = Arrays.copyOf(cartItems, cartItems.length - 1);
            for (int i = 0, k = 0; i < cartItemCopy.length; i++) {
                if (cartItemCopy[i].product.equals(product)) {
                    continue;
                }
                cartItems[k] = cartItemCopy[i];
                k++;
            }
        } else {
            System.out.println("Product not in Cart");
        }
    }

    public void updateProduct(Product product, int quantity) {
        if (isInCart(product)) {
            addProduct(product, quantity);
        } else {
            System.out.println("Product not in CArt");
        }
    }

    public int getTotalQuantity() {
        int quantity = 0;
        for (int i = 0; i < cartItems.length; i++) {
            quantity += cartItems[i].quantity;
        }
        return quantity;
    }

    public double getTotalSum() {
        double sum = 0.0;
        for (int i = 0; i < cartItems.length; i++) {
            sum += cartItems[i].quantity * cartItems[i].product.getPrice();
        }
        return sum;

    }

    public void printReceipt() {
        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(i + ": Produkt " + cartItems[i].product.id + ", " + cartItems[i].quantity + "x" + cartItems[i].product.getPrice() + " = " + cartItems[i].quantity * cartItems[i].product.getPrice());
        }
        System.out.println("___");
        System.out.println("Razem: " + getTotalSum());
    }

    public boolean isInCart(Product product) {
        boolean isInCart = false;
        for (CartItem item : cartItems) {
            if (item.product.equals(product)) {
                isInCart = true;
            }
        }
        return isInCart;
    }


}
