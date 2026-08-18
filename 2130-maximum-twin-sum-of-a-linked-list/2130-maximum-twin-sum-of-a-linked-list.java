class Solution {
    public int pairSum(ListNode head) {

        Stack<Integer> st = new Stack<>();

        ListNode slow = head;
        ListNode fast = head;

        // Find middle and store first half
        while (fast!=null&&fast.next!=null) {

            st.push(slow.val);

            slow = slow.next;
            fast = fast.next.next;
        }

        int maxSum = 0;

        // Process second half
        while (slow!=fast) {

            int twinSum =st.pop()+slow.val;

            maxSum = Math.max(maxSum, twinSum);

            slow = slow.next;
        }

        return maxSum;
    }
}