class ZadCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(2,3,"\033[0;31m",2);
        Shape shape = new Shape(4,2,"\033[0;31m");
        System.out.println(shape.getDistance(circle
        ));


    }
}
public class Circle extends Shape{
    private double radius;
    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }
    public String getDescription(){
        return super.getDescription() + "radius: " + this.radius;
    }
    public double getArea(){
        return Math.PI*(Math.pow(this.radius,2));
    }
    public double getCircuit(){
        return Math.PI*2*this.radius;
    }
}
