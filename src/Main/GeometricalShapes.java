package Main;

import geometricalshapes.Circle;
import geometricalshapes.Rectangle;
import geometricalshapes.Shape;
import geometricalshapes.Square;
import java.util.Scanner;

public class GeometricalShapes {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String loopAgain; 
        
        do {
            int shapeChoice = readIntWithMessage("What shape do you want to create?\n1. Circle\n2. Square\n3. Rectangle");
            Shape shape = createShape(shapeChoice);

            int calculationChoice = readIntWithMessage("What do you want to calculate?\n1. Area\n2. Perimeter\n3. Both");
            displayResult(calculationChoice, shape);

            System.out.println("Do you want to do another shape and calculation? Press Y for yes and any other key for no.");
            loopAgain = sc.nextLine();

        } while ("y".equalsIgnoreCase(loopAgain));
    }

    public static Shape createShape(int shapeChoice) {
        Shape shape = null;
        switch (shapeChoice) {
            case 1:
                shape = new Circle(readDoubleWithMessage("Enter radius:"));
                break;
            case 2:
                shape = new Square(readDoubleWithMessage("Enter side:"));
                break;
            case 3:
                shape = new Rectangle(readDoubleWithMessage("Enter length:"), readDoubleWithMessage("Enter width:"));
                break;
        }
        return shape;
    }

    public static void displayResult(int calculationChoice, Shape shape) {
        switch (calculationChoice) {
            case 1:
                System.out.println("The area of the " + shape.getShapeName() + " is: " + shape.area());
                break;
            case 2:
                System.out.println("The perimeter of the " + shape.getShapeName() + " is: " + shape.perimeter());
                break;
            case 3:
                System.out.println("The area of the " + shape.getShapeName() + " is: " + shape.area());
                System.out.println("The perimeter of the " + shape.getShapeName() + " is: " + shape.perimeter());
                break;
        }
    }

    public static double readDoubleWithMessage(String s) {
        System.out.println(s);
        double number = sc.nextDouble();
        sc.nextLine();
        return number;
    }

    public static int readIntWithMessage(String s) {
        System.out.println(s);
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

}
