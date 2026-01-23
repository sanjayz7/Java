abstract class Vehicle {
    // Instance variables
    protected String brand = "Generic";
    private int wheels = 4;
    // Static variable
    public static int count = 0;
    // Final variable
    public final String category = "Transport";

    // Constructor
    public Vehicle() {
        count++;
        System.out.println("Vehicle created.");
    }

    // Abstract method - must be implemented by subclasses
    public abstract void start();

    // Concrete method
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    // Final method - cannot be overridden
    public final void showWheels() {
        System.out.println("Wheels: " + wheels);
    }

    // Static method - belongs to the class
    public static void showCount() {
        System.out.println("Total vehicles: " + count);
    }

    // Private method - internal use only
    private void internalCheck() {
        System.out.println("Internal system check...");
    }

    // Method to demonstrate calling private method
    public void checkSystem() {
        internalCheck(); // Calling private method within the class
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Overriding the abstract method
    public void start() {
        System.out.println("Car started with key ignition.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car(); // Create object of subclass
        c.start(); // Abstract method implementation
        c.displayBrand(); // Concrete method
        c.showWheels(); // Final method
        c.checkSystem(); // Calls private method internally
        // Access static method and variable
        Vehicle.showCount(); // Static method
        System.out.println("Category: " + c.category); // Final variable
    }
}
