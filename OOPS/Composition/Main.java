public class Main{
  public static void main(String a[]){
    Car c= new Car("Toyoto",2023,"EV");
  System.out.println("Car is :"+c.engine.type);
    System.out.println("Car is :"+c.model);

    c.start();
  }

}
//If i delete the object for the car then engine object will also be deleted because engine is a part of car. This is called composition.

// Why inheritence over composition is not a good idea because if we delete the object of the parent class then the child class will also be deleted. But in composition if we delete the object of the parent class then the child class will not be deleted.
// In composition, the child class can exist independently of the parent class, while in inheritance, the child class is dependent on the parent class.
//In composition, the child class can have multiple parent classes, while in inheritance, a child class can only have one parent class.
//Object Diagram

// After:

// Car c = new Car("Toyota",2023,"EV");

// Memory looks like:

// c
// │
// ▼
// Car Object
// ------------
// model = Toyota
// year  = 2023
// eng
//  │
//  ▼
// Engine Object
// --------------
// type = EV
// Is this Composition?

// Yes.

// Because:

// Car
//   └── Engine

// A car owns its engine.

// This is a strong HAS-A relationship.