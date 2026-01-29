// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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