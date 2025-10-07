// CarThisKeyword.java

// Class Car demonstrates the use of the 'this' keyword.
class Car {
    private String model;
    private int year;

    // Method to set the car's details using the 'this' keyword.
    // 'this.model' refers to the instance variable, while 'model' refers to the parameter.
    public void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Car details set.");
    }

    // Method to display car details.
    public void displayDetails() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Manufacturing Year: " + this.year);
    }
}

public class CarThisKeyword {
    public static void main(String[] args) {
        // Create a Car object.
        System.out.println("Creating a car object:");
        Car car1 = new Car();

        // Set details using the setDetails method.
        System.out.println("Setting car details:");
        car1.setDetails("Toyota Camry", 2023);

        // Display the car details.
        System.out.println("Displaying car details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Creating another car object:");
        Car car2 = new Car();
        car2.setDetails("Honda Civic", 2024);
        car2.displayDetails();
    }
}

/*
Sample Input/Output:

Creating a car object:
Setting car details:
Car details set.
Displaying car details:
Car Model: Toyota Camry
Manufacturing Year: 2023

Creating another car object:
Car details set.
Car Model: Honda Civic
Manufacturing Year: 2024
*/
