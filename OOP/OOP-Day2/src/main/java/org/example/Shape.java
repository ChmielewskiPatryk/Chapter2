//Stwórz klasę Shape, która będzie posiadała:
//
//prywatne atrybuty x i y (określające środek tego kształtu) oraz color,
//konstruktor, przyjmujący zmienne określające wartości x, y i color,
//metodę o nazwie getDescription() zwracającą wartość typu String zawierającą informacje o tym kształcie (x, y i color),
//metodę o nazwie getDistance(Shape shape), zwracającą odległość od środka innego kształtu, wynik ma być typu double.
//Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.
package org.example;

public class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int _x, int _y, String _color) {
        this.x = _x;
        this.y = _y;
        this.color = _color;
    }

    public String getDescription() {
        return "x: " + this.x + " y: " + this.y + " color: " + this.color;
    }

    public double getDistance(Shape shape) {
        int xDiff = shape.x - this.x;
        int yDiff = shape.y - this.y;
        double distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
        return distance;
    }
}
