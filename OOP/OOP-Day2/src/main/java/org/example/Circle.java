//Stwórz klasę Circle, która spełnia następujące wymogi:
//
//dziedziczy po klasie definiującej kształt (Shape),
//ma dodatkowy atrybut radius,
//posiada konstruktor, przyjmujący zmienne określające wartości x, y, color i radius,
//nadpisuje metodę kształtu – getDescription(),
//ma metodę o nazwie getArea(), zwracającą pole powierzchni typu double,
//posiada metodę o nazwie getCircuit(), zwracającą obwód typu double.
//Przetestuj metodę getDistance(Shape shape) na obiektach typu Circle.
package org.example;

public class Circle extends Shape{
    private int radius;
    public Circle(int _x, int _y, String _color, int _radius){
        super(_x, _y, _color);
        this.radius = _radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "radius: " + this.radius;
    }

    public double getArea(){
        return Math.PI*(Math.pow(this.radius,2));
    }
    public double getCircuit(){
        return Math.PI*2*this.radius;
    }
}
