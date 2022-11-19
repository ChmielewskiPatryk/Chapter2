import java.util.SplittableRandom;

public class Car {
    private String brand;
    private String model;
    private int price;
    void setBrand(String brand){
        this.brand = brand;

    }
    String getBrand(){
        return brand;
    }
    void setModel(String brand){
        this.brand = brand;

    }
    String getModel(){
        return brand;
    }
    void setPrice(int prace){
        this.price = prace;

    }
    int getPrice(){
        return price;
    }
    public String toString(){
        return this.brand + " " + this.price;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Opel");
        car.setModel("Astra");
        car.setPrice(200000);
        System.out.println(car.toString());


    }
}
