import java.util.*;

public class combinationSum3 {
   
    public void solve(int i, int n, int k, List<Integer> curr, List<List<Integer>> ans){
        if (n == 0 && k == 0) {
            ans.add(new ArrayList<>(curr)); 
            return;
        }
        
        if (n < 0 || k < 0 || i > 9) {
            return;
        }

        curr.add(i);
        solve(i + 1, n - i, k - 1, curr, ans); 
        curr.remove(curr.size() - 1);         
        solve(i + 1, n, k, curr, ans);
    }
    
    public List<List<Integer>> findCombinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(1, n, k, curr, ans);
        return ans;
    }

    public static void main(String[] args) {
        combinationSum3 sol = new combinationSum3();
        int k = 3; 
        int n = 7; 
        List<List<Integer>> result = sol.findCombinationSum3(k, n);

        // Expected Output for k=3, n=7: 1 2 4 
        for (List<Integer> combination : result) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}