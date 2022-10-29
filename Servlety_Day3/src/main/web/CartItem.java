package web;

public class CartItem {
    public String name;
    public int quantity;
    public double price;
    public CartItem(String _name, int _quantity, double _price){
        this.name = _name;
        this.quantity = _quantity;
        this.price = _price;
    }
}
