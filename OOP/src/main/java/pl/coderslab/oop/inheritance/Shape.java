class ZadShape{
    public static void main(String[] args) {
        Shape shape = new Shape(4,2,"\033[0;31m");
        Shape shape1 = new Shape(2,2,"\033[0;31m");
        System.out.println(shape.getDistance(shape1));
    }
}
public class Shape {
    private double x;
    private double y;
    private String color;
    public Shape(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = this.color;
    }
    public String getDescription(){
        return "x: " + this.x + "y: " + this.y +  "color: " + this.color;
    }
    public double getDistance(Shape shape){
        double xdifference = shape.x - this.x;
        double ydufference = shape.y - this.y;
        double distance = Math.sqrt(Math.pow(xdifference, 2) + Math.pow(ydufference, 2));
        return distance;
    }
}
