import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyStack {

    private ListNode head;

    // push operation
    void push(int x) {
        ListNode node = new ListNode(x);
        node.next = head;
        head = node;
    }

    // pop operation
    int pop() {
        int number = head.val;
        head = head.next;
        return number;
    }

    // peek operation
    int peek() {
        return head.val;
    }

    // check empty
    boolean isEmpty() {
        return head == null;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        int n = sc.nextInt(); // number of operations

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();

            if (op == 1) {             // push
                int x = sc.nextInt();
                stack.push(x);
            }
            else if (op == 2) {        // pop
                if (!stack.isEmpty())
                    System.out.println(stack.pop());
                else
                    System.out.println("Stack is empty");
            }
            else if (op == 3) {        // peek
                if (!stack.isEmpty())
                    System.out.println(stack.peek());
                else
                    System.out.println("Stack is empty");
            }
            else if (op == 4) {        // isEmpty
                System.out.println(stack.isEmpty());
            }
        }

        sc.close();
    }
}
