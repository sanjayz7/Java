// Parent class
/*class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }
    
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog is eating dog food");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
    
    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }
}

// Child class 3
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps: Tweet! Tweet!");
    }
    
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds");
    }
    
    // Additional method specific to Bird
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating objects
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        
        System.out.println("=== Parent Class Methods ===");
        animal.sound();
        animal.eat();
        animal.sleep();
        
        System.out.println("\n=== Dog Class Methods ===");
        dog.sound();  // Overridden method
        dog.eat();    // Overridden method
        dog.sleep();  // Inherited method
        
        System.out.println("\n=== Cat Class Methods ===");
        cat.sound();  // Overridden method
        cat.eat();    // Overridden method
        cat.sleep();  // Inherited method
        
        System.out.println("\n=== Bird Class Methods ===");
        bird.sound(); // Overridden method
        bird.eat();   // Overridden method
        bird.sleep(); // Inherited method
        bird.fly();   // Bird-specific method
        
        System.out.println("\n=== Polymorphism Example ===");
        // Runtime polymorphism - method called depends on object type
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        
        for (Animal a : animals) {
            a.sound(); // Calls overridden method based on actual object type
            a.eat();   // Calls overridden method based on actual object type
            System.out.println("---");
        }
    }
}*/
class  baseclass{
    int a =3;
    public void display(){
        System.out.println("This is the base class method");
    }
}
class derivedclass extends baseclass{
    int a=2; // This variable hides the variable in baseclass
    @Override
    public void display(){
        System.out.println("This is the derived class method");
super.display(); // Calls the method in baseclass using super
System.out.println(a);
        System.out.println(super.a); // Accesses the variable in baseclass using super

    }
}


public class MethodOverriding {
    public static void main(String[] args) {
    
        
        derivedclass obj2 = new derivedclass();
        obj2.display(); // Calls the overridden method in derivedclass
        
    }}
    