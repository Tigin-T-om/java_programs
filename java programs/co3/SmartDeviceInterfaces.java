// SmartDeviceInterfaces.java

// Interface: Camera
// Defines a contract for devices capable of taking photos.
interface Camera {
    // Abstract method: Any class implementing Camera must provide an implementation for takePhoto().
    public void takePhoto();
}

// Interface: Phone
// Defines a contract for devices capable of making calls.
interface Phone {
    // Abstract method: Any class implementing Phone must provide an implementation for makeCall().
    public void makeCall();
}

// Class: Smartphone
// Demonstrates implementing multiple interfaces, showcasing multiple inheritance of type.
// A Smartphone is both a Camera and a Phone.
class Smartphone implements Camera, Phone {
    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Encapsulation: Setter for the model.
    public void setModel(String model) {
        this.model = model;
    }

    // Polymorphism/Interface Implementation: Implementing the takePhoto() method from the Camera interface.
    @Override
    public void takePhoto() {
        System.out.println(model + " is taking a photo.");
    }

    // Polymorphism/Interface Implementation: Implementing the makeCall() method from the Phone interface.
    @Override
    public void makeCall() {
        System.out.println(model + " is making a call.");
    }

    // Smartphone-specific method.
    public void browseInternet() {
        System.out.println(model + " is browsing the internet.");
    }
}

public class SmartDeviceInterfaces {
    public static void main(String[] args) {
        // Demonstrating Interfaces and Polymorphism.

        System.out.println("--- Smartphone Functionality ---");
        Smartphone myPhone = new Smartphone("Android X1");
        System.out.println("Model: " + myPhone.getModel());

        // Calling methods implemented from interfaces.
        myPhone.takePhoto(); // Invokes the implementation from Camera interface.
        myPhone.makeCall();  // Invokes the implementation from Phone interface.
        myPhone.browseInternet(); // Smartphone-specific method.
        System.out.println();

        // Demonstrate polymorphism with interface references.
        System.out.println("--- Polymorphism with Interface references ---");
        Camera cameraDevice = new Smartphone("iPhone 15");
        cameraDevice.takePhoto(); // The cameraDevice reference can only call Camera interface methods.
        // cameraDevice.makeCall(); // This would cause a compile-time error as makeCall is not in Camera interface.

        Phone phoneDevice = new Smartphone("Samsung Galaxy");
        phoneDevice.makeCall(); // The phoneDevice reference can only call Phone interface methods.
        // phoneDevice.takePhoto(); // This would cause a compile-time error as takePhoto is not in Phone interface.
    }
}

/*
Expected Output:

--- Smartphone Functionality ---
Model: Android X1
Android X1 is taking a photo.
Android X1 is making a call.
Android X1 is browsing the internet.

--- Polymorphism with Interface references ---
iPhone 15 is taking a photo.
Samsung Galaxy is making a call.
*/
