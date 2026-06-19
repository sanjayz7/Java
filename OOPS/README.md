/**
 * COMPLETE GUIDE: When to use Abstract Class vs Interface
 * Real-world examples you can run and understand
 */

// ============================================================================
// SCENARIO 1: ANIMAL HIERARCHY - USE ABSTRACT CLASS
// Why? Animals ARE-A relationship, shared state (name, age), shared code
// ============================================================================

abstract class Animal {
    // Shared state (fields) - ONLY possible in abstract class, NOT interface
    protected String name;
    protected int age;
    
    // Constructor - ONLY in abstract class, NOT interface
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Abstract method - Child MUST implement
    abstract void makeSound();
    
    // Concrete method - Child can inherit or override
    public void eat() {
        System.out.println(name + " is eating...");
    }
    
    // Concrete method - Child can inherit or override
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class must implement ALL abstract methods
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);  // Call parent constructor
    }
    
    @Override
    void makeSound() {  // REQUIRED to implement
        System.out.println(name + " says: Woof! Woof!");
    }
    
    // Can override concrete methods (optional)
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food...");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    void makeSound() {  // REQUIRED to implement
        System.out.println(name + " says: Meow!");
    }
}

// Testing Abstract Class
// class AnimalTest {
//     public static void main(String[] args) {
//         Dog dog = new Dog("Buddy", 3);
//         dog.makeSound();      // Output: Buddy says: Woof! Woof!
//         dog.eat();            // Output: Buddy is eating dog food...
//         dog.sleep();          // Output: Buddy is sleeping...
//         
//         Cat cat = new Cat("Whiskers", 2);
//         cat.makeSound();      // Output: Whiskers says: Meow!
//         cat.eat();            // Output: Whiskers is eating...
//         cat.sleep();          // Output: Whiskers is sleeping...
//     }
// }

// ============================================================================
// SCENARIO 2: PAYMENT PROCESSING - USE INTERFACE
// Why? Different payment methods (Credit Card, PayPal, UPI) - unrelated
//      Each has own implementation, just need same contract
// ============================================================================

// Interface: Contract that different classes can implement
interface PaymentMethod {
    // All methods are implicitly abstract
    boolean validatePayment();
    void processPayment(double amount);
    void refund(double amount);
}

// Credit Card - one way to pay
class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cvv;
    
    public CreditCard(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    @Override
    public boolean validatePayment() {
        // Credit card specific validation
        return cardNumber.length() == 16 && cvv.length() == 3;
    }
    
    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Processing credit card payment: $" + amount);
            System.out.println("Card number: " + cardNumber.substring(12) + "****");
        }
    }
    
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " to credit card " + cardNumber.substring(12) + "****");
    }
}

// PayPal - completely different way to pay
class PayPal implements PaymentMethod {
    private String email;
    private String password;
    
    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean validatePayment() {
        // PayPal specific validation
        return email.contains("@") && password.length() > 6;
    }
    
    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Processing PayPal payment: $" + amount);
            System.out.println("From account: " + email);
        }
    }
    
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " to PayPal account " + email);
    }
}

// UPI - Indian payment method
class UPI implements PaymentMethod {
    private String upiId;
    
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public boolean validatePayment() {
        return upiId.contains("@");
    }
    
    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Processing UPI payment: ₹" + amount);
            System.out.println("UPI ID: " + upiId);
        }
    }
    
    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " to UPI ID " + upiId);
    }
}

// Shopping cart that accepts ANY payment method
class ShoppingCart {
    private double totalAmount;
    
    public ShoppingCart(double amount) {
        this.totalAmount = amount;
    }
    
    // Key point: Takes ANY PaymentMethod - not specific to Card, PayPal, or UPI
    public void checkout(PaymentMethod payment) {
        System.out.println("\n=== Checkout ===");
        payment.processPayment(totalAmount);
    }
}

// Testing Interface
// class PaymentTest {
//     public static void main(String[] args) {
//         ShoppingCart cart = new ShoppingCart(99.99);
//         
//         // Use credit card
//         PaymentMethod creditCard = new CreditCard("1234567890123456", "123");
//         cart.checkout(creditCard);
//         
//         // Use PayPal
//         PaymentMethod paypal = new PayPal("user@gmail.com", "password123");
//         cart.checkout(paypal);
//         
//         // Use UPI
//         PaymentMethod upi = new UPI("sanjay@paytm");
//         cart.checkout(upi);
//     }
// }

// ============================================================================
// SCENARIO 3: VEHICLE - COMBINING BOTH (ABSTRACT CLASS + MULTIPLE INTERFACES)
// Why? Vehicle IS-A hierarchy (abstract class) + capabilities (interfaces)
// ============================================================================

// Abstract class: Vehicle hierarchy
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    abstract void start();
    abstract void stop();
    
    public void printInfo() {
        System.out.println(year + " " + brand + " " + model);
    }
}

// Interface 1: Things that can be rented
interface Rentable {
    void rent(int days);
    double calculateRent(int days);
    void returnVehicle();
}

// Interface 2: Things that can be painted
interface Paintable {
    void paint(String color);
}

// Concrete car: IS-A Vehicle, CAN be Rentable, CAN be Paintable
class Car extends Vehicle implements Rentable, Paintable {
    private String currentColor;
    private double dailyRentalRate = 50.0;
    
    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.currentColor = color;
    }
    
    @Override
    void start() {
        System.out.println("Car engine started: Vroom!");
    }
    
    @Override
    void stop() {
        System.out.println("Car engine stopped");
    }
    
    // Rentable interface methods
    @Override
    public void rent(int days) {
        System.out.println("Renting " + brand + " " + model + " for " + days + " days");
    }
    
    @Override
    public double calculateRent(int days) {
        return days * dailyRentalRate;
    }
    
    @Override
    public void returnVehicle() {
        System.out.println("Returning " + brand + " " + model);
    }
    
    // Paintable interface methods
    @Override
    public void paint(String color) {
        currentColor = color;
        System.out.println("Car painted to " + color);
    }
}

// Concrete motorcycle: IS-A Vehicle, CAN be Rentable, but NOT Paintable
class Motorcycle extends Vehicle implements Rentable {
    private double dailyRentalRate = 30.0;
    
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }
    
    @Override
    void start() {
        System.out.println("Motorcycle engine started: Vroom vroom!");
    }
    
    @Override
    void stop() {
        System.out.println("Motorcycle engine stopped");
    }
    
    @Override
    public void rent(int days) {
        System.out.println("Renting " + brand + " " + model + " for " + days + " days");
    }
    
    @Override
    public double calculateRent(int days) {
        return days * dailyRentalRate;
    }
    
    @Override
    public void returnVehicle() {
        System.out.println("Returning " + brand + " " + model);
    }
}

// Statue: Can be painted, but NOT a vehicle
class Statue implements Paintable {
    private String material;
    
    public Statue(String material) {
        this.material = material;
    }
    
    @Override
    public void paint(String color) {
        System.out.println("Statue painted to " + color);
    }
}

// Testing combined approach
// class VehicleTest {
//     public static void main(String[] args) {
//         System.out.println("=== Car (Vehicle + Rentable + Paintable) ===");
//         Car car = new Car("Toyota", "Camry", 2023, "White");
//         car.printInfo();
//         car.start();
//         car.rent(3);
//         System.out.println("Rental cost for 3 days: $" + car.calculateRent(3));
//         car.paint("Red");
//         car.stop();
//         
//         System.out.println("\n=== Motorcycle (Vehicle + Rentable only) ===");
//         Motorcycle bike = new Motorcycle("Honda", "CB300", 2023);
//         bike.printInfo();
//         bike.start();
//         bike.rent(2);
//         System.out.println("Rental cost for 2 days: $" + bike.calculateRent(2));
//         // bike.paint("Blue");  // ERROR! Not Paintable
//         bike.stop();
//         
//         System.out.println("\n=== Statue (Paintable only) ===");
//         Statue statue = new Statue("Bronze");
//         statue.paint("Gold");
//         // statue.start();  // ERROR! Not a Vehicle
//     }
// }

// ============================================================================
// DECISION TREE: WHEN TO USE WHAT
// ============================================================================

/*
 * FLOWCHART:
 * 
 * 1. Are the classes in IS-A relationship?
 *    (Is a Dog a type of Animal? Is a Car a type of Vehicle?)
 *    → YES: Use ABSTRACT CLASS
 *    → NO:  Go to step 2
 * 
 * 2. Do the classes share common STATE (fields) or IMPLEMENTATION (code)?
 *    (Do Dog and Cat both have 'age'? Do they both have eat() logic?)
 *    → YES: Use ABSTRACT CLASS
 *    → NO:  Go to step 3
 * 
 * 3. Are completely different/unrelated things implementing same behavior?
 *    (Can a CreditCard AND PayPal both process payments?
 *     Can a Car AND a Boat both be Rentable?)
 *    → YES: Use INTERFACE
 * 
 * 4. Can one class implement multiple of these things?
 *    (Can a Car be Rentable AND Paintable AND Vehicle?)
 *    → YES: Use INTERFACE (for multiple behaviors) + ABSTRACT CLASS (for hierarchy)
 * 
 */

public class AbstractVsInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("SCENARIO 1: Animal Hierarchy (Abstract Class)");
        System.out.println("====================");
        Dog dog = new Dog("Buddy", 3);
        dog.makeSound();
        dog.eat();
        dog.sleep();
        
        Cat cat = new Cat("Whiskers", 2);
        cat.makeSound();
        cat.eat();
        
        System.out.println("\n====================");
        System.out.println("SCENARIO 2: Payment Methods (Interface)");
        System.out.println("====================");
        ShoppingCart cart = new ShoppingCart(99.99);
        
        PaymentMethod creditCard = new CreditCard("1234567890123456", "123");
        cart.checkout(creditCard);
        
        PaymentMethod paypal = new PayPal("user@gmail.com", "password123");
        cart.checkout(paypal);
        
        PaymentMethod upi = new UPI("sanjay@paytm");
        cart.checkout(upi);
        
        System.out.println("\n====================");
        System.out.println("SCENARIO 3: Vehicle with Multiple Behaviors");
        System.out.println("====================");
        Car car = new Car("Toyota", "Camry", 2023, "White");
        car.printInfo();
        car.start();
        car.rent(3);
        System.out.println("Rental cost for 3 days: $" + car.calculateRent(3));
        car.paint("Red");
        car.stop();
        
        System.out.println();
        Motorcycle bike = new Motorcycle("Honda", "CB300", 2023);
        bike.printInfo();
        bike.start();
        bike.rent(2);
        System.out.println("Rental cost for 2 days: $" + bike.calculateRent(2));
        bike.stop();
        
        System.out.println();
        Statue statue = new Statue("Bronze");
        statue.paint("Gold");
    }
}

/*
 * KEY TAKEAWAYS:
 * 
 * 1. ABSTRACT CLASS (Animal, Vehicle):
 *    - Parent-child relationship (IS-A)
 *    - Shared STATE (fields like name, age)
 *    - Shared CODE (eat(), sleep())
 *    - Some methods MUST be implemented by child (makeSound)
 *    - Some methods can be inherited (eat, sleep)
 *    - Only ONE parent class
 * 
 * 2. INTERFACE (PaymentMethod, Rentable, Paintable):
 *    - No parent-child relationship
 *    - No shared state (only constants)
 *    - Contract/capability definition
 *    - ALL methods MUST be implemented
 *    - Many unrelated classes can use same interface
 *    - One class can implement MULTIPLE interfaces
 * 
 * 3. COMBINATION (Car extends Vehicle implements Rentable, Paintable):
 *    - Car IS-A Vehicle (abstract class)
 *    - Car CAN BE Rentable (interface)
 *    - Car CAN BE Paintable (interface)
 *    - Best of both worlds!
 */