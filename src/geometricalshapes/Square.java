package geometricalshapes;

public class Square extends Shape {

    private double side;

    public void setSide(double side) {
        if (side >= 0) {
            this.side = side;
        } else {
            this.side = 0;
        }
    }

    public Square(double side) {
        setSide(side);
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    public String getShapeName() {
        return "square";
    }

}
