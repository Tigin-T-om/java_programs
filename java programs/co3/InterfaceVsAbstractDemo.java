// InterfaceVsAbstractDemo.java

abstract class Appliance {
    private String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn() {
        System.out.println(brand + " appliance is turning on.");
    }

    // An abstract method could also be here if needed:
    // public abstract void powerConsumption();
}

interface RemoteControl {
    public void control();
}

class TV extends Appliance implements RemoteControl {
    private int currentChannel;

    public TV(String brand, int currentChannel) {
        super(brand);
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
        System.out.println(getBrand() + " TV is set to channel: " + currentChannel);
    }

    @Override
    public void control() {
        System.out.println(getBrand() + " TV is being controlled by remote. Current channel: " + currentChannel);
    }

    // TV-specific method, could also override turnOn() from Appliance.
    public void displayChannelInfo() {
        System.out.println(getBrand() + " TV is displaying channel " + currentChannel + ".");
    }
}

public class InterfaceVsAbstractDemo {
    public static void main(String[] args) {
        System.out.println("--- TV Functionality ---");
        TV smartTV = new TV("Samsung", 5);

        smartTV.turnOn(); // Inherited concrete method.
        smartTV.displayChannelInfo();

        smartTV.control(); // Implemented interface method.
        System.out.println();

        smartTV.setCurrentChannel(10);
        smartTV.control();
        System.out.println();

        System.out.println("--- Polymorphism with Appliance reference ---");
        Appliance myAppliance = new TV("LG", 1);
        myAppliance.turnOn(); // Calls the concrete method from Appliance.
        // myAppliance.control(); // This would be a compile error, control() is not in Appliance.
        System.out.println();

        System.out.println("--- Polymorphism with RemoteControl reference ---");
        RemoteControl myRemoteControl = new TV("Sony", 2);
        myRemoteControl.control(); // Calls the control() method from TV.
        // myRemoteControl.turnOn(); // This would be a compile error, turnOn() is not in RemoteControl.
    }
}

/*
Expected Output:

--- TV Functionality ---
Samsung appliance is turning on.
Samsung TV is displaying channel 5.
Samsung TV is being controlled by remote. Current channel: 5

Samsung TV is set to channel: 10
Samsung TV is being controlled by remote. Current channel: 10

--- Polymorphism with Appliance reference ---
LG appliance is turning on.

--- Polymorphism with RemoteControl reference ---
Sony TV is being controlled by remote. Current channel: 2
*/
