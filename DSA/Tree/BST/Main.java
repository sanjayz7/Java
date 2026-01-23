package DSA.Tree.BST;

public class Main {
    public static void main(String[] args) {

        Bst bst = new Bst();

        bst.insert(new Node(40));
        bst.insert(new Node(70));
        bst.insert(new Node(10));
        bst.insert(new Node(60));
        bst.insert(new Node(20));
        bst.insert(new Node(5));
        bst.insert(new Node(80));

        
        bst.display();
    }
}
