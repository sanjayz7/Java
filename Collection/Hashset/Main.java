import java.util.*;
// To insert user-defined objects (Student) into a HashSet
class Student {
    String name;
    int rollNo;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " --> " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Student> h = new HashSet<>();

        h.add(new Student(101, "Sanjay"));
        h.add(new Student(102, "Praveen"));
        h.add(new Student(103, "Anguraja"));

        System.out.println(h); // Prints all elements (unordered)

        for (Student s : h) {
            System.out.println(s);
        }
    }
}
