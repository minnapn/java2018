package geometricalshapes;

public class Circle extends Shape {

    private final double PI = 3.14;
    private double radius;

    private void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            
            this.radius = 0;
        }
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }


     public String getShapeName(){
        return "circle";
    }
   
}
