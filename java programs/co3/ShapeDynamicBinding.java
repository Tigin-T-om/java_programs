// ShapeDynamicBinding.java
import java.util.Scanner;

// Abstraction: Abstract base class Shape.
// Defines a common interface for drawing, to be implemented by concrete shapes.
abstract class Shape {
    // Abstract method: draw() will be implemented by concrete subclasses.
    public abstract void draw();
}

// Inheritance: Circle class extends Shape.
class Circle extends Shape {
    // Polymorphism (Dynamic Binding): Overriding the draw method.
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Inheritance: Square class extends Shape.
class Square extends Shape {
    // Polymorphism (Dynamic Binding): Overriding the draw method.
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

// Inheritance: Triangle class extends Shape.
class Triangle extends Shape {
    // Polymorphism (Dynamic Binding): Overriding the draw method.
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

public class ShapeDynamicBinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrating Dynamic Binding (Runtime Polymorphism).
        System.out.println("Enter the shape you want to draw (circle, square, triangle):");
        String shapeType = scanner.nextLine();

        // Declare a reference of the abstract base class type.
        Shape shape = null;

        // Based on user input, instantiate the correct subclass object.
        // The assignment here demonstrates polymorphism, where a superclass reference
        // points to a subclass object.
        switch (shapeType.toLowerCase()) {
            case "circle":
                shape = new Circle();
                break;
            case "square":
                shape = new Square();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            default:
                System.out.println("Invalid shape entered.");
                break;
        }

        // Dynamic Binding: Call the draw() method.
        // The actual method invoked (Circle's, Square's, or Triangle's draw()) is
        // determined at runtime based on the actual object that 'shape' refers to.
        if (shape != null) {
            shape.draw();
        }

        scanner.close();
    }
}

/*
Expected Output (Scenario 1: User enters "circle"):

Enter the shape you want to draw (circle, square, triangle):
circle
Drawing a Circle.

Expected Output (Scenario 2: User enters "square"):

Enter the shape you want to draw (circle, square, triangle):
square
Drawing a Square.

Expected Output (Scenario 3: User enters "triangle"):

Enter the shape you want to draw (circle, square, triangle):
triangle
Drawing a Triangle.

Expected Output (Scenario 4: User enters "hexagon"):

Enter the shape you want to draw (circle, square, triangle):
hexagon
Invalid shape entered.
*/
