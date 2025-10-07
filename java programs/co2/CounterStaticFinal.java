// CounterStaticFinal.java

// Class Counter demonstrates the use of static and final keywords.
class Counter {
    // static variable: belongs to the class, not to any object.
    // It will be shared by all instances of the Counter class.
    static int count = 0;

    // final variable: a constant whose value cannot be changed once assigned.
    // Here, MAX is a constant accessible by all objects and cannot be modified.
    final int MAX = 100;

    // Constructor: increments the static count every time a new Counter object is created.
    public Counter() {
        count++;
        System.out.println("Counter object created. Current count: " + count);
        // Attempting to modify a final variable would result in a compile-time error:
        // MAX = 200;
    }

    // static method: can access static members directly (like 'count').
    // It cannot access non-static members (like 'MAX') without an object reference.
    public static void displayCount() {
        System.out.println("Total number of Counter objects created: " + count);
    }

    // Non-static method to demonstrate access to both static and final members.
    public void displayMax() {
        System.out.println("The maximum value (final): " + MAX);
    }
}

public class CounterStaticFinal {
    public static void main(String[] args) {
        System.out.println("--- Creating Counter objects ---");

        // Create multiple Counter objects.
        Counter c1 = new Counter(); // count becomes 1
        Counter c2 = new Counter(); // count becomes 2
        Counter c3 = new Counter(); // count becomes 3
        System.out.println();

        // Accessing static variable directly via class name.
        System.out.println("Accessing static count directly via class name: " + Counter.count);

        // Calling static method via class name.
        Counter.displayCount();
        System.out.println();

        // Create another object to see count increment again.
        Counter c4 = new Counter(); // count becomes 4
        Counter.displayCount();
        System.out.println();

        // Demonstrating access to final variable through an object.
        System.out.println("--- Demonstrating final keyword ---");
        c1.displayMax();
        c4.displayMax();

        // Note: You can't access MAX directly using the class name if it's not static final
        // System.out.println(Counter.MAX); // This would be a compile error if MAX is not static.
    }
}

/*
Sample Input/Output:

--- Creating Counter objects ---
Counter object created. Current count: 1
Counter object created. Current count: 2
Counter object created. Current count: 3

Accessing static count directly via class name: 3
Total number of Counter objects created: 3

Counter object created. Current count: 4
Total number of Counter objects created: 4

--- Demonstrating final keyword ---
The maximum value (final): 100
The maximum value (final): 100
*/
