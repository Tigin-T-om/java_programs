// FinalKeywordDemo.java

final class FinalClass {
    public void display() {
        System.out.println("This is a method from a final class.");
    }
}

// Attempting to extend a final class will result in a compile-time error.
/*
class MyExtendedClass extends FinalClass { // ERROR: cannot inherit from final FinalClass
    // ...
}
*/

class ClassWithFinalMethod {
    public void regularMethod() {
        System.out.println("This is a regular method.");
    }

    final public void finalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }
}

class SubclassOfFinalMethod extends ClassWithFinalMethod {
    @Override
    public void regularMethod() {
        System.out.println("Regular method overridden in subclass.");
    }

    // Attempting to override a final method will result in a compile-time error.
    /*
    @Override
    public void finalMethod() { // ERROR: finalMethod() cannot override finalMethod() in ClassWithFinalMethod
        System.out.println("Attempting to override final method.");
    }
    */
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating final class and method ---");

        FinalClass obj1 = new FinalClass();
        obj1.display();
        System.out.println();

        ClassWithFinalMethod obj2 = new ClassWithFinalMethod();
        obj2.regularMethod();
        obj2.finalMethod();
        System.out.println();

        SubclassOfFinalMethod obj3 = new SubclassOfFinalMethod();
        obj3.regularMethod(); // Calls the overridden method.
        obj3.finalMethod();
    }
}

/*
Expected Output:

--- Demonstrating final class and method ---
This is a method from a final class.

This is a regular method.
This is a final method. It cannot be overridden.

Regular method overridden in subclass.
This is a final method. It cannot be overridden.

(Compilation errors would occur if commented-out code was uncommented:)
Error: cannot inherit from final FinalClass
Error: finalMethod() cannot override finalMethod() in ClassWithFinalMethod
*/
