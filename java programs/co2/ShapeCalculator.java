import java.util.Scanner;

// Class representing a generic Shape with a final constant for PI
class Shape {
    // Final constant for PI. It's static because PI is universal and doesn't change per object.
    public final static double PI = 3.14159;

    /**
     * Overloaded method to calculate the area of a square.
     * @param side The length of one side of the square.
     * @return The area of the square.
     */
    public double calculateArea(double side) {
        return side * side;
    }

    /**
     * Overloaded method to calculate the area of a rectangle.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The area of the rectangle.
     */
    public double calculateArea(double length, double width) {
        return length * width;
    }

    /**
     * Overloaded method to calculate the area of a circle.
     * @param radius The radius of the circle.
     * @param isCircle A boolean flag to differentiate this method from the square's area method if needed.
     *                 In this specific case, it helps distinguish from `calculateArea(double side)`.
     * @return The area of the circle.
     */
    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return PI * radius * radius;
        } else {
            // This else block is just for demonstration purposes, to show a different path
            System.out.println("Invalid call for circle area calculation without specifying it's a circle.");
            return 0.0;
        }
    }
}

// Main class to demonstrate the ShapeCalculator program
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shapeCalculator = new Shape(); // Create an object of the Shape class

        System.out.println("--- Shape Area Calculator ---");

        // Calculate area of a square
        System.out.print("Enter side length for square: ");
        double squareSide = scanner.nextDouble();
        System.out.println("Area of square: " + shapeCalculator.calculateArea(squareSide));

        // Calculate area of a rectangle
        System.out.print("Enter length for rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter width for rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.println("Area of rectangle: " + shapeCalculator.calculateArea(rectangleLength, rectangleWidth));

        // Calculate area of a circle
        System.out.print("Enter radius for circle: ");
        double circleRadius = scanner.nextDouble();
        System.out.println("Area of circle: " + shapeCalculator.calculateArea(circleRadius, true));

        scanner.close();
    }
}

/*
Sample Input/Output:

--- Shape Area Calculator ---
Enter side length for square: 7
Area of square: 49.0
Enter length for rectangle: 5
Enter width for rectangle: 10
Area of rectangle: 50.0
Enter radius for circle: 4
Area of circle: 50.26544
*/


