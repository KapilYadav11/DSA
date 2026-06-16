import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}

public class PreOrder {
    public void preorder(Node root, java.util.List<Integer> arr){
        if(root == null){
            return;
        }

        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    public java.util.List<Integer> preOrder(Node root){
        java.util.List<Integer> arr = new java.util.ArrayList<>();
        preorder(root, arr);
        return arr;
    }

     public static void main(String[] args) {

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreOrder sol = new PreOrder();
        java.util.List<Integer> result = sol.preOrder(root);

        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
