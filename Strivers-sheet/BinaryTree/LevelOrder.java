import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class LevelOrder {
    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                level.add(node.data);

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        LevelOrder sol = new LevelOrder();
        List<List<Integer>> result = sol.levelOrderTraversal(root);
        
        System.out.println("Level Order Traversal of Tree:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }

}
