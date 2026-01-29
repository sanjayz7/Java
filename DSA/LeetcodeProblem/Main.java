class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        
        // Move prev to the node before the 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        
        // Reverse the sublist
        ListNode curr = prev.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        
        return dummy.next;
    }
}

public class Main {
    // Helper to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Helper to build a list from array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example: head = [1,2,3,4,5], left = 2, right = 4
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = buildList(arr);

        System.out.print("Original List: ");
        printList(head);

        Solution sol = new Solution();
        ListNode newHead = sol.reverseBetween(head, 2, 4);

        System.out.print("Reversed List: ");
        printList(newHead);
        // Output: 1 -> 4 -> 3 -> 2 -> 5
    }
}