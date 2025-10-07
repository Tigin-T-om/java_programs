// ShapeFactoryDemo.java
import java.util.Scanner;

// Interface: Shape
// Defines a common contract for all shapes, demonstrating abstraction.
interface Shape {
    public void draw();
}

// Implementation: Circle
// Concrete class implementing the Shape interface.
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Implementation: Square
// Concrete class implementing the Shape interface.
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

// Implementation: Triangle
// Concrete class implementing the Shape interface.
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

// Factory Class: ShapeFactory
// Demonstrates the Factory design pattern. It encapsulates the object creation logic.
// This class creates and returns objects of various shapes based on input,
// without exposing the instantiation logic to the client.
class ShapeFactory {
    // Polymorphism: Returns an object of type Shape, but the actual object
    // is a concrete subclass (Circle, Square, or Triangle).
    public static Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of shape to draw (circle, square, triangle):");
        String shapeInput = scanner.nextLine();

        // Using the ShapeFactory to get a Shape object.
        // This demonstrates abstraction (client interacts with Shape interface)
        // and encapsulation (creation logic is hidden within ShapeFactory).
        Shape shape = ShapeFactory.getShape(shapeInput);

        if (shape != null) {
            // Polymorphism: The draw() method is called on the Shape interface reference,
            // but the actual implementation executed is from the concrete shape object
            // (Circle, Square, or Triangle) created by the factory.
            shape.draw();
        } else {
            System.out.println("Could not create shape.");
        }

        scanner.close();
    }
}

/*
Expected Output (Scenario 1: User enters "circle"):

Enter the type of shape to draw (circle, square, triangle):
circle
Drawing a Circle.

Expected Output (Scenario 2: User enters "square"):

Enter the type of shape to draw (circle, square, triangle):
square
Drawing a Square.

Expected Output (Scenario 3: User enters "triangle"):

Enter the type of shape to draw (circle, square, triangle):
triangle
Drawing a Triangle.

Expected Output (Scenario 4: User enters "hexagon"):

Enter the type of shape to draw (circle, square, triangle):
hexagon
Unknown shape type: hexagon
Could not create shape.
*/
