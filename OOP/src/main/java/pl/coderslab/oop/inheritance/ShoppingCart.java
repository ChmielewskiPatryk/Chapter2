import java.util.Arrays;

public class ShoppingCart {
    CartItem[] cartItems = new CartItem[0];

    public void addProduct(Product product, int quantity) {
        boolean inside = false;
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                cartItems[i].quantity += quantity;
                inside = true;
            }
        }
        if (!inside) {
            this.cartItems = Arrays.copyOf(this.cartItems, this.cartItems.length + 1);
            this.cartItems[this.cartItems.length - 1] = new CartItem(product, quantity);
        }
    }

    public void removeProduct(Product product) {
        CartItem[] cartItems1 = new CartItem[0];
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                continue;
            } else {
                cartItems1 = Arrays.copyOf(cartItems1, cartItems1.length + 1);
                cartItems1[cartItems1.length - 1] = cartItems[i];
            }
        }
        cartItems = cartItems1;
    }

    public void upDateProduct(Product product, int quantity) {
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].product.equals(product)) {
                cartItems[i].quantity += quantity;
            }
        }
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (int i = 0; i < cartItems.length; i++) {
            totalQuantity += cartItems[i].quantity;
        }
        return totalQuantity;
    }

    public double getTotalSum() {
        double totalSum = 0;
        for (int i = 0; i < cartItems.length; i++) {
            totalSum += cartItems[i].product.getPrice() * cartItems[i].quantity;
        }
        return totalSum;
    }

    public void printReceipt() {
        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(i + ": " + "id: " + cartItems[i].product.getId() + ": " + cartItems[i].product.getName() + ", " + cartItems[i].quantity + " x " + cartItems[i].product.getPrice() + " = " + (cartItems[i].quantity * cartItems[i].product.getPrice()));
        }
        System.out.println("Razem: " + getTotalSum());
    }

    public static void main(String[] args) {
/*ShoppingCart kacperShoppingCart = new ShoppingCart();
        kacperShoppingCart.addProduct(new Product("czeko", 1.0), 1);
        kacperShoppingCart.addProduct(new Product("paluszki", 5.0), 1);
        kacperShoppingCart.addProduct(new Product("czeko", 4.0), 2);
        kacperShoppingCart.printReceipt();
        */
        Product komputer = new Product("Macbook", 7500);
        Product klawiatura = new Product("Logitech", 500);
        Product monitor = new Product("Dell", 4500);
        ShoppingCart kacperShoppingCart = new ShoppingCart();
        kacperShoppingCart.addProduct(komputer, 1);
        kacperShoppingCart.addProduct(klawiatura, 1);
        kacperShoppingCart.addProduct(monitor, 2);
        kacperShoppingCart.removeProduct(klawiatura);
        kacperShoppingCart.printReceipt();
/*
          kacperShoppingCart.addProduct(new Product("Macbook", 7500),1 );
          kacperShoppingCart.printReceipt();
          kacperShoppingCart.removeProduct(new Product("Macbook", 7500));
          kacperShoppingCart.printReceipt();

 */
    }
}
