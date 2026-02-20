// Online Java Compiler
// Use this editor to write, compile and run your Java code online

BINARY TREE LEVEL ORDER TRAVERSAL
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values");
      String a[] = sc.nextLine().trim().split("\\s+");
      TreeNode root = buildTree(a);
      System.out.println("Level Order Traversal:");
      levelOrder(root);
    }
    
    public static void levelOrder(TreeNode root){
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size --> 0){
                TreeNode node =q.poll();
                System.out.print(node.val+" ");
                if(node.left!=null) q.add(node.left);
                 if(node.right!=null) q.add(node.right);
            }
              System.out.println();
        }
    }
    public static TreeNode buildTree(String arr[]){
        //if(arr.length()==0||arr[0].equals("null")) return null;
             if(arr.length == 0 || arr[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int i=1;
          while(!q.isEmpty() && i < arr.length){
            TreeNode curr =q.poll();
           
            if(i < arr.length && !arr[i].equals("null")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;
            
            if(i < arr.length && !arr[i].equals("null")){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
        
    }
}

class TreeNode{
    TreeNode left,right;
    int val;
    TreeNode(int val){
        this.val=val;
    }
}


BINARY SEARCH TREE LEVEL ORDER TRAVERSAl

import java.util.*;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {

    // Insert into BST
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Level Order Traversal
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node root = null;

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
    }
}
