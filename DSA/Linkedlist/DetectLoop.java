public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;         // move by 1
        fast = fast.next.next;    // move by 2

        if (slow == fast) {
            // They met, so there is a cycle!
            return true;
        }
    }
    // Fast reached the end, so no cycle.
    return false;
}