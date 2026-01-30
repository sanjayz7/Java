import java.util.*;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Step 1: Handle base case (root == null)
        if(root ==null){
            return false;
        }
        // Step 2: Handle leaf node case
            if(root.left==null&&root.right==null){
               if(root.val == targetSum ){
                    return true;
               } 
            }
        // Step 3: Recursive calls for left and right subtrees

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
public class Main {
    // Helper to build tree from level order input (use "null" for empty nodes)
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode curr = queue.poll();
            if (i < values.length && !values[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(curr.left);
            }
            i++;
            if (i < values.length && !values[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree nodes in level order, separated by spaces (use 'null' for missing nodes):");
        String line = sc.nextLine();
        String[] values = line.trim().split("\\s+");
        TreeNode root = buildTree(values);

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.hasPathSum(root, targetSum);
        System.out.println("Path sum " + targetSum + " exists? " + result);
    }
}

/*
Enter tree nodes in level order, separated by spaces (use 'null' for missing nodes):
5 4 8 11 null 13 4 7 2 null null null 1
Enter target sum: 
22
 */