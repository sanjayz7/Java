import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static Node head = null;

    // Insert at end
    static void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Delete by value
    static void delete(int val) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == val) {
            head = head.next;
            System.out.println(val + " deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(val + " not found");
        } else {
            temp.next = temp.next.next;
            System.out.println(val + " deleted");
        }
    }

    // Search
    static void search(int val) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == val) {
                System.out.println(val + " found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println(val + " not found");
    }

    // Display list
    static void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter choice and value (1 insert, 2 delete, 3 search, 0 exit):");
            int choice = sc.nextInt();

            if (choice == 0)
                break;

            int value = sc.nextInt();

            switch (choice) {
                case 1:
                    insert(value);
                    break;
                case 2:
                    delete(value);
                    break;
                case 3:
                    search(value);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            display();
        }
    }
}
