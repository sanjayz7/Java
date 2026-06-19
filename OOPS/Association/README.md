## Introduction

Association is a key concept in object-oriented programming (OOP) that defines a relationship between two or more objects. It represents how objects interact with each other while maintaining their independence.

Association is **not inheritance**—rather, it is a relationship between objects that allows communication while ensuring they remain loosely coupled.

## What is Association?

Association defines a connection between two classes, where one class is linked to another. The association can be **one-to-one**, **one-to-many**, **many-to-one**, or **many-to-many**. Objects in an association can exist independently of each other.

### Key Characteristics of Association:
- Represents a **uses-a** or **knows-a** relationship.
- Objects in an association **can exist independently**.
- Can be **unidirectional** or **bidirectional**.
- Promotes **modularity** and **code reusability**.

### Example: A Student and a Teacher

A `Student` can be associated with multiple `Teacher` objects, and a `Teacher` can have multiple `Student` objects. This represents a **many-to-many** association.


class Teacher{

  private String name;
  private List<Student> stds;
  Teacher(name){
    this.name =name;
    this.stds= new ArrayList<>();
  }
  Teacher addStudent(Student s){
    stds.add(s);
  }
  void showStudents(){
    System.out.println("The Teacher "+name+" teaches");
    for(Student s:stds){
      System.out.println(s.getName());
    }
  }
}
class Student{

 private  String name;
  Student(String name){
    this.name = name;
  }
 public  String getName(){
    return name;
  }
}
public class Main{
  public static void main(String a[]){
    Teacher t1 = new Teacher("Jesus Sir");
    Teacher t2 = new Teacher("Rabik Sir");

    Student s1= new Students("Sanjay");
    Student s2 = new Students("Sujith");

    t1.addStudent(s1);
    t2.addStudent(s2);
    t1.showsDetail();
    t2.showsDetail();
  }

}

The Teacher Jesus teaches:
  -Sanjay


## Types of Association

### 1. **One-to-One Association**
   - Each object of class A is associated with one object of class B.
   - Example: A `Person` has one `Passport`.

### 2. **One-to-Many Association**
   - One object of class A can be associated with multiple objects of class B.
   - Example: A `Teacher` teaches multiple `Students`.

### 3. **Many-to-One Association**
   - Multiple objects of class A can be associated with one object of class B.
   - Example: Multiple `Students` belong to one `School`.

### 4. **Many-to-Many Association**
   - Multiple objects of class A can be associated with multiple objects of class B.
   - Example: `Teachers` and `Students` (a student can have multiple teachers, and a teacher can have multiple students).

---

## Why Use Association?



### 1. **Promotes Code Reusability**
   - Objects can be reused across multiple associations without duplication.

### 2. **Encourages Loose Coupling**
   - Objects interact without depending on the internal implementation of each other.

### 3. **Improves Maintainability**
   - Changing one object does not heavily impact others, making code easier to manage.

### 4. **Better System Design**
   - Allows modeling of real-world relationships between entities effectively.

---