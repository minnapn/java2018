package geometricalshapes;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }
    
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = length;
        } else {
            this.width = 0;
        }
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }

    public String getShapeName() {
        return "rectangle";
    }

}
