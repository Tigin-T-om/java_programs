// RectangleCompare.java

// Class Rectangle represents a rectangle with length and breadth.
class Rectangle {
    double length;
    double breadth;

    // Constructor to initialize length and breadth.
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle.
    public double calculateArea() {
        return length * breadth;
    }

    // Method to compare the area of this rectangle with another Rectangle object.
    // It returns a String indicating which rectangle has a larger or equal area.
    public String compareArea(Rectangle r) {
        double area1 = this.calculateArea();
        double area2 = r.calculateArea();

        if (area1 > area2) {
            return "This rectangle (Area: " + area1 + ") has a larger area than the other rectangle (Area: " + area2 + ").";
        } else if (area2 > area1) {
            return "The other rectangle (Area: " + area2 + ") has a larger area than this rectangle (Area: " + area1 + ").";
        } else {
            return "Both rectangles have the same area (Area: " + area1 + ").";
        }
    }

    // Method to display the rectangle's dimensions and area.
    public void displayDetails() {
        System.out.println("Rectangle: Length = " + length + ", Breadth = " + breadth + ", Area = " + calculateArea());
    }
}

public class RectangleCompare {
    public static void main(String[] args) {
        // Create two Rectangle objects.
        System.out.println("Creating Rectangle 1 (Length: 5.0, Breadth: 10.0):");
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        rect1.displayDetails();

        System.out.println("Creating Rectangle 2 (Length: 7.0, Breadth: 8.0):");
        Rectangle rect2 = new Rectangle(7.0, 8.0);
        rect2.displayDetails();
        System.out.println();

        // Compare the areas of the two rectangles.
        System.out.println("Comparing areas:");
        String comparisonResult = rect1.compareArea(rect2);
        System.out.println(comparisonResult);
        System.out.println();

        System.out.println("Creating Rectangle 3 (Length: 4.0, Breadth: 12.5):");
        Rectangle rect3 = new Rectangle(4.0, 12.5);
        rect3.displayDetails();
        System.out.println();

        // Compare rect1 with rect3 (which has the same area as rect1).
        System.out.println("Comparing Rectangle 1 with Rectangle 3:");
        String comparisonResult2 = rect1.compareArea(rect3);
        System.out.println(comparisonResult2);
    }
}

/*
Sample Input/Output:

Creating Rectangle 1 (Length: 5.0, Breadth: 10.0):
Rectangle: Length = 5.0, Breadth = 10.0, Area = 50.0
Creating Rectangle 2 (Length: 7.0, Breadth: 8.0):
Rectangle: Length = 7.0, Breadth = 8.0, Area = 56.0

Comparing areas:
The other rectangle (Area: 56.0) has a larger area than this rectangle (Area: 50.0).

Creating Rectangle 3 (Length: 4.0, Breadth: 12.5):
Rectangle: Length = 4.0, Breadth = 12.5, Area = 50.0

Comparing Rectangle 1 with Rectangle 3:
Both rectangles have the same area (Area: 50.0).
*/
