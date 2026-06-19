import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }
}

public class PreIterative {
    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<Integer> preorder = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>(); 
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode current = st.pop();
            preorder.add(current.val);

            if (current.right != null) st.push(current.right);
            if (current.left != null) st.push(current.left);
        }
        
        return preorder;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result =  PreIterative.preorderTraversal(root);

        System.out.print("Preorder Traversal: ");
        result.forEach(val -> System.out.print(val + " "));
        System.out.println();
    }
}
