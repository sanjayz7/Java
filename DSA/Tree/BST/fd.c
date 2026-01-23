#include <stdio.h>
#include <stdlib.h>

// Definition for singly-linked list.
struct ListNode {
    int val;
    struct ListNode *next;
};

// Function to reverse the sublist between left and right
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    // Create a dummy node
    struct ListNode dummy;
    dummy.val = 0;
    dummy.next = head;
    struct ListNode* leftPrev = &dummy;
    struct ListNode* curr = head;
    struct ListNode* prev = NULL;

    // Move leftPrev and curr to the right positions
    for (int i = 0; i < left - 1; i++) {
        leftPrev = leftPrev->next;
        curr = curr->next;
    }

    struct ListNode* subListHead = curr;

    // Reverse the sublist
    for (int i = 0; i <= right - left; i++) {
        struct ListNode* nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }

    leftPrev->next = prev;
    subListHead->next = curr;

    return dummy.next;
}

// Utility to create a new node
struct ListNode* newNode(int val) {
    struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

// Utility to print the linked list
void printList(struct ListNode* head) {
    while (head) {
        printf("%d", head->val);
        if (head->next) printf("->");
        head = head->next;
    }
    printf("
");
}

// Example usage
int main() {
    // Create list: 1->2->3->4->5
    struct ListNode* head = newNode(1);
    head->next = newNode(2);
    head->next->next = newNode(3);
    head->next->next->next = newNode(4);
    head->next->next->next->next = newNode(5);

    int left = 2, right = 4;
    printf("Original list: ");
    printList(head);

    struct ListNode* newHead = reverseBetween(head, left, right);

    printf("Reversed list between %d and %d: ", left, right);
    printList(newHead);

    return 0;
}