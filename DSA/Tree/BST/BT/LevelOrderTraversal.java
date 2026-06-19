import java.util.*;

// TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    // Function to build tree from array
    public static TreeNode buildTree(Integer[] arr) {

        // Empty tree
        if (arr.length == 0 || arr[0] == null) {
            return null;
        }

        // Create root
        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {

            TreeNode curr = q.poll();

            // Left child
            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    // Level Order Traversal
    public static void levelOrder(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            System.out.print(curr.val + " ");

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {2, 3, 5, 8, 13, 21, 34};

        TreeNode root = buildTree(arr);

        System.out.println("Level Order Traversal:");

        levelOrder(root);
    }
}