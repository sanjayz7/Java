import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Main {
    static ListNode head = null;

    // Insert at the end
    public static void insert(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = node;
    }

    // Delete first occurrence
    public static void delete(int val) {
        if (head == null) return;
        if (head.val == val) {
            head = head.next;
            return;
        }
        ListNode curr = head;
        while (curr.next != null && curr.next.val != val) curr = curr.next;
        if (curr.next != null) curr.next = curr.next.next;
    }

    // Search
    public static boolean search(int val) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) return true;
            curr = curr.next;
        }
        return false;
    }

    // Print list for reference
    public static void printList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Commands: 1 x (insert), 2 x (delete), 3 x (search), 0 to exit");
        while (true) {
            int cmd = sc.nextInt();
            if (cmd == 0) break;
            int val = sc.nextInt();
            if (cmd == 1) {
                insert(val);
                System.out.println("Inserted " + val);
            } else if (cmd == 2) {
                delete(val);
                System.out.println("Deleted " + val);
            } else if (cmd == 3) {
                boolean found = search(val);
                System.out.println(found ? "Found " + val : val + " not found");
            }
            printList();
        }
    }
}