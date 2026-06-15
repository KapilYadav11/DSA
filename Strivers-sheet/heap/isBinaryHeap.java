class Node{
    int data;
    Node left, right;

    Node(int value){
        data = value;
        left = right = null;
    }
}
public class isBinaryHeap {
    private int countNode(Node root){
        if(root == null){
            return 0;
        }

        int cnt = 1 + countNode(root.left) + countNode(root.right);
        return cnt;
    }
    private boolean isCBT(Node root, int index, int totalCount){
        if(root == null){
            return true;
        }

        if(index >= totalCount){
            return false;
        }

        boolean left = isCBT(root.left, 2 * index + 1, totalCount);
        boolean right = isCBT(root.right, 2 * index + 2, totalCount);

        return left && right;

    }
    private boolean isMaxOrder(Node root){
        if(root.left == null && root.right == null){
            return true;
        }

        if(root.right == null){
            return root.data >= root.left.data;
        } else{
            boolean checkMax = (root.data >= root.left.data && root.data >= root.right.data) && isMaxOrder(root.left) && isMaxOrder(root.right);

            return checkMax;
        }
        
    }
    public boolean isHeap(Node root){
        if(root == null){
            return true;
        }
        int toalNodes = countNode(root);
        return isCBT(root, 0, toalNodes) && isMaxOrder(root);
    }

    public static void main(String[] args) {
        isBinaryHeap sol = new isBinaryHeap();
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(15);

        if (sol.isHeap(root)) {
            System.out.println("Yes, Given Binary Tree is a Heap!");
        } else {
            System.out.println("No, Given Binary Tree is NOT a Heap!");
        }
    }
}