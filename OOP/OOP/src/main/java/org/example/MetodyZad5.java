//Stwórz klasę Car, posiadającą następujące atrybuty:
//
//brand
//model
//price
//Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.
//
//Dopisz metodę toString, wyświetlającą markę oraz cenę w jednej linii.

package org.example;

public class MetodyZad5 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Volvo");
        car.setModel("XC40");
        car.setPrice("100k");
        System.out.println(car.toString());
    }
}

class Car {
    public String brand;
    public String model;
    public String price;

    public String getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Price: " + price;
    }
}