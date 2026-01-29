import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int left = 0, right = arr.size() - 1;
        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Main {
    // Helper to build the linked list from input array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ListNode head = buildList(arr);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }
}