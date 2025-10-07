// CalculatorOverloading.java

// Class Calculator demonstrates method overloading for the add operation.
class Calculator {

    // Method to add two integers.
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    // Method to add two doubles (overloaded method).
    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }

    // Method to add three integers (another overloaded method).
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
}

public class CalculatorOverloading {
    public static void main(String[] args) {
        // Create a Calculator object.
        Calculator myCalculator = new Calculator();

        // Call the add method with two integers.
        int sum1 = myCalculator.add(5, 10);
        System.out.println("Result of adding two integers: " + sum1);
        System.out.println();

        // Call the add method with two doubles.
        double sum2 = myCalculator.add(3.5, 2.7);
        System.out.println("Result of adding two doubles: " + sum2);
        System.out.println();

        // Call the add method with three integers.
        int sum3 = myCalculator.add(1, 2, 3);
        System.out.println("Result of adding three integers: " + sum3);
    }
}

/*
Sample Input/Output:

Adding two integers: 5 + 10
Result of adding two integers: 15

Adding two doubles: 3.5 + 2.7
Result of adding two doubles: 6.2

Adding three integers: 1 + 2 + 3
Result of adding three integers: 6
*/
