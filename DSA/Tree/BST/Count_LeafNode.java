class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Solution {
    public int countLeafNodes(TreeNode root) {
        if (root == null) return 0; // Base case: empty tree has no leaf nodes
        if (root.left == null && root.right == null) return 1; // Leaf node
        // Recur for left and right subtrees
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}