// SmartHomeAutomation.java

// Abstraction: Abstract class Appliance defines common functionalities for all smart home appliances.
abstract class Appliance {
    // Encapsulation: Private field for power rating with getter and setter.
    private int powerRating;

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    // Abstraction: Abstract methods for turning on and off the appliance.
    public abstract void turnOn();
    public abstract void turnOff();

    // Non-abstract method for common information.
    public void displayPowerConsumption() {
        System.out.println("Power Rating: " + powerRating + " Watts");
    }
}

// Inheritance: Fan class inherits from Appliance.
class Fan extends Appliance {
    private int speed;

    public Fan(int powerRating, int speed) {
        super(powerRating);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Polymorphism/Inheritance: Implementing abstract turnOn method.
    @Override
    public void turnOn() {
        System.out.println("Fan is turning on at speed " + speed + ".");
    }

    // Polymorphism/Inheritance: Implementing abstract turnOff method.
    @Override
    public void turnOff() {
        System.out.println("Fan is turning off.");
    }

    // Encapsulation: Display method for Fan specific details.
    public void displayFanDetails() {
        displayPowerConsumption(); // Inherited method.
        System.out.println("Current Speed: " + speed);
    }
}

// Inheritance: Light class inherits from Appliance.
class Light extends Appliance {
    private String color;

    public Light(int powerRating, String color) {
        super(powerRating);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Polymorphism/Inheritance: Implementing abstract turnOn method.
    @Override
    public void turnOn() {
        System.out.println("Light is turning on with " + color + " color.");
    }

    // Polymorphism/Inheritance: Implementing abstract turnOff method.
    @Override
    public void turnOff() {
        System.out.println("Light is turning off.");
    }

    // Encapsulation: Display method for Light specific details.
    public void displayLightDetails() {
        displayPowerConsumption();
        System.out.println("Color: " + color);
    }
}

// Inheritance: AC (Air Conditioner) class inherits from Appliance.
class AC extends Appliance {
    private int temperature;

    public AC(int powerRating, int temperature) {
        super(powerRating);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Polymorphism/Inheritance: Implementing abstract turnOn method.
    @Override
    public void turnOn() {
        System.out.println("AC is turning on. Setting temperature to " + temperature + "°C.");
    }

    // Polymorphism/Inheritance: Implementing abstract turnOff method.
    @Override
    public void turnOff() {
        System.out.println("AC is turning off.");
    }

    // Encapsulation: Display method for AC specific details.
    public void displayACDetails() {
        displayPowerConsumption();
        System.out.println("Current Temperature Setting: " + temperature + "°C");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        // Demonstrating Abstraction, Inheritance, and Encapsulation.

        System.out.println("--- Fan Control ---");
        Fan fan1 = new Fan(60, 3); // Encapsulation: PowerRating and speed set via constructor.
        fan1.displayFanDetails();
        fan1.turnOn(); // Polymorphism: Calls Fan's turnOn method.
        fan1.setSpeed(5); // Encapsulation: Modifying state via setter.
        fan1.displayFanDetails();
        fan1.turnOff();
        System.out.println();

        System.out.println("--- Light Control ---");
        Light light1 = new Light(10, "Warm White");
        light1.displayLightDetails();
        light1.turnOn(); // Polymorphism: Calls Light's turnOn method.
        light1.setColor("Cool White");
        light1.displayLightDetails();
        light1.turnOff();
        System.out.println();

        System.out.println("--- AC Control ---");
        AC ac1 = new AC(1500, 22);
        ac1.displayACDetails();
        ac1.turnOn(); // Polymorphism: Calls AC's turnOn method.
        ac1.setTemperature(20);
        ac1.displayACDetails();
        ac1.turnOff();
        System.out.println();

        // Demonstrate polymorphism with abstract class reference.
        System.out.println("--- Polymorphism with Appliance reference ---");
        Appliance[] appliances = new Appliance[3];
        appliances[0] = new Fan(70, 2);
        appliances[1] = new Light(15, "Blue");
        appliances[2] = new AC(1800, 24);

        for (Appliance app : appliances) {
            app.turnOn(); // Each call invokes the specific subclass's turnOn implementation.
            app.displayPowerConsumption();
            app.turnOff();
            System.out.println();
        }
    }
}

/*
Sample Input/Output:

--- Fan Control ---
Power Rating: 60 Watts
Current Speed: 3
Fan is turning on at speed 3.
Power Rating: 60 Watts
Current Speed: 5
Fan is turning off.

--- Light Control ---
Power Rating: 10 Watts
Color: Warm White
Light is turning on with Warm White color.
Power Rating: 10 Watts
Color: Cool White
Light is turning off.

--- AC Control ---
Power Rating: 1500 Watts
Current Temperature Setting: 22°C
AC is turning on. Setting temperature to 22°C.
Power Rating: 1500 Watts
Current Temperature Setting: 20°C
AC is turning off.

--- Polymorphism with Appliance reference ---
Fan is turning on at speed 2.
Power Rating: 70 Watts
Fan is turning off.

Light is turning on with Blue color.
Power Rating: 15 Watts
Light is turning off.

AC is turning on. Setting temperature to 24°C.
Power Rating: 1800 Watts
AC is turning off.
*/
