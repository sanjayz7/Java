BST insert,search,findmin,find max,traversal
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // A utility function to insert a new node with given key
    Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            return new Node(key);
        }

        // Otherwise, recur down the tree
        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    // A utility function to do inorder traversal of BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // A utility function to do preorder traversal of BST
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // A utility function to do postorder traversal of BST
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Function to search a given key in BST
    Node search(Node root, int item) {
        if (root == null ) {
            return root;
        }
        if (item < root.data) {
            return search(root.left, item);
        }
       else if(item>root.data)
           return search(root.right, item);
      else
         return root;
    }

    // Function to find minimum value node in BST
    Node findMin(Node root) {
        if (root.left == null) {
            return root;
        }
        return findMin(root.left);
    }

    // Function to find maximum value node in BST
    Node findMax(Node root) {
        if (root.right == null) {
            return root;
        }
        return findMax(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int val, choice = 1;

        System.out.print("Enter the data to be inserted in the root: ");
        val = scanner.nextInt();
        bst.root = bst.insert(bst.root, val);

        while (choice == 1) {
            System.out.print("Enter the data to be inserted in the tree: ");
            val = scanner.nextInt();
            bst.insert(bst.root, val);
            System.out.print("Press 1 to continue or any other number to exit: ");
            choice = scanner.nextInt();
        }

        // Print inorder traversal of the BST
        System.out.println("\nInorder traversal:");
        bst.inorder(bst.root);
        System.out.println("\nPreorder traversal:");
        bst.preorder(bst.root);
        System.out.println("\nPostorder traversal:");
        bst.postorder(bst.root);

        System.out.print("\nEnter the value to be searched: ");
        int key = scanner.nextInt();
        Node temp = bst.search(bst.root, key);
        if (temp != null) {
            System.out.println("The element " + temp.data + " is found in the tree.");
        } else {
            System.out.println("The element not found.");
        }

        System.out.println("Finding minimum value in the tree:");
        temp = bst.findMin(bst.root);
        System.out.println("The minimum value in the tree is " + temp.data);

        System.out.println("Finding maximum value in the tree:");
        temp = bst.findMax(bst.root);
        System.out.println("The maximum value in the tree is " + temp.data);
        
        scanner.close();
    }
}
