
package DSA.Tree.BST;
public class Bst {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {

        // BASE CASE
        if (root == null) {
            return node;
        }

        // RECURSIVE CASES
        if (node.data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else if (node.data > root.data) {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }




  public void display(){
    displayHelper(root);
    System.out.println();
  }

  private void displayHelper(Node root){
    if(root!=null){
     
      // Inorder Traversal
       displayHelper(root.left);
      System.out.print(root.data+" ");
      displayHelper(root.right);

    }
    

 
  
  }
  public boolean search(int data){
    return searchHelper(root,data);
  }

  private boolean searchHelper(Node root,int data){
      if(root==null){
        return false;
      }
      else if(root.data==data){
        return true;
      }
      else if(data<root.data){
        return searchHelper(root.left,data);
      
      }
      else{
        return searchHelper(root.right,data); 

      }
  }


  public void remove(int data){
    root = removeHelper(root,data);
  }
  private Node removeHelper(Node root,int data){
    if(searchHelper(root,data)==false){
      System.out.println("Data not found");
      return root;
    }
    else{
      if(root ==null){
        return root;
      }
      else if(data<root.data){
        return removeHelper(root.left,data);

      }
      else if(data>root.data){
        return removeHelper(root.right,data);
      }
      else{
        if(root.left==null && root.right==null){
          root = null;
        }
        else if(root.right!=null){
          root.data=successor(root.right);
          root.right=removeHelper(root.right,root.data);

        }
        else{
          root.data=predecessor(root.left);
          root.left=removeHelper(root.left,root.data);
        }

      }
    }
    return root;

  }

  private int successor(Node root){
   
    //to find the minimum value in the right subtree of the node
    root=root.right;
    while(root.left!=null){
      root=root.left;
    }
    return root.data;
  }
  private int predecessor(Node root){
    //to find the maximum value in the left subtree of the node
    root=root.left;
    while(root.right!=null){
      root=root.right;
    }
    return root.data;
  }
}
