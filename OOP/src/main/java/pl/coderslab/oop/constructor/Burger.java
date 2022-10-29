public class Burger {
    public String size;
    public String price;
    public Burger(String size, String price){
        this.size = size;
        this.price = price;
    }
    public Burger(){

    }
    public static void main(String[] args){
        Burger burger = new Burger("200 g", "35 zł");

    }
}
