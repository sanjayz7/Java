package Aggregation;

public class Main  {
   public static void main(String[] args)
   { 
    Address addr = new Address("Chennai", "Tamil Nadu");
     Employee emp = new Employee("Arun", addr);
      emp.display();
    
    } 
  }

📝 Explanation
Employee has an Address.

But Address can exist without Employee.

This is aggregation.
If instead Address was created inside Employee and couldn’t exist independently, that would be composition.



Aggregation is a special form of association in Object-Oriented Programming (OOP). It represents a "Has-A" relationship between two classes, but with a key distinction:

One class contains a reference to another class, yet both can exist independently.

It’s often described as a weaker form of composition.

✨ Key Points
Association: General relationship between two classes (e.g., Student ↔ Teacher).

Aggregation: A specific type of association where one class is a container of another, but the contained object can live without the container.

Composition vs Aggregation:

Aggregation: Independent lifecycle. If the container object is destroyed, the contained object can still exist.

Composition: Dependent lifecycle. If the container object is destroyed, the contained object is also destroyed.