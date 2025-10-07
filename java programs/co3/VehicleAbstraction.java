// VehicleAbstraction.java

// Abstraction: Abstract class Vehicle defines common vehicle behaviors.
// It has an abstract method that concrete subclasses must implement
// and a concrete method with a default implementation.
abstract class Vehicle {
    // Abstract method: startEngine() must be implemented by concrete subclasses.
    public abstract void startEngine();

    // Concrete method: stopEngine() has a default implementation.
    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }

    // Another concrete method for common vehicle information.
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

// Inheritance: Car class extends Vehicle.
class Car extends Vehicle {
    // Polymorphism/Inheritance: Implementing the abstract startEngine method.
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    // Car-specific method.
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

// Inheritance: Bike class extends Vehicle.
class Bike extends Vehicle {
    // Polymorphism/Inheritance: Implementing the abstract startEngine method.
    @Override
    public void startEngine() {
        System.out.println("Bike engine started with a kick-start.");
    }

    // Bike-specific method.
    public void lean() {
        System.out.println("Bike is leaning into a turn.");
    }
}

public class VehicleAbstraction {
    public static void main(String[] args) {
        // Demonstrating Abstraction and Polymorphism.

        System.out.println("--- Car Operations ---");
        Car car1 = new Car();
        car1.startEngine(); // Polymorphism: Calls Car's startEngine.
        car1.drive();       // Inherited concrete method.
        car1.accelerate();  // Car-specific method.
        car1.stopEngine();  // Inherited concrete method.
        System.out.println();

        System.out.println("--- Bike Operations ---");
        Bike bike1 = new Bike();
        bike1.startEngine(); // Polymorphism: Calls Bike's startEngine.
        bike1.drive();       // Inherited concrete method.
        bike1.lean();        // Bike-specific method.
        bike1.stopEngine();  // Inherited concrete method.
        System.out.println();

        // Demonstrate polymorphism with abstract class reference.
        System.out.println("--- Polymorphism with Vehicle reference ---");
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine(); // Dynamic binding: Calls appropriate startEngine at runtime.
            vehicle.drive();
            vehicle.stopEngine();
            System.out.println();
        }
    }
}

/*
Expected Output:

--- Car Operations ---
Car engine started with a key.
Vehicle is being driven.
Car is accelerating.
Vehicle engine stopped.

--- Bike Operations ---
Bike engine started with a kick-start.
Vehicle is being driven.
Bike is leaning into a turn.
Vehicle engine stopped.

--- Polymorphism with Vehicle reference ---
Car engine started with a key.
Vehicle is being driven.
Vehicle engine stopped.

Bike engine started with a kick-start.
Vehicle is being driven.
Vehicle engine stopped.
*/
