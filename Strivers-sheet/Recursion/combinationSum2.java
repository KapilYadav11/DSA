import java.sql.Array;
import java.util.*;
public class combinationSum2 {
    public static void findCombination2(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1]){
                continue;
            }

            if(arr[i] > target){
                break;
            }
            ds.add(arr[i]);

            findCombination2(index + 1, target - arr[i], arr, ans, ds);

            ds.remove(ds.size() - 1);
        }
    } 
    
    public List<List<Integer>> findCombinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombination2(0, target, candidates, ans, ds);
        return ans;
    }

    public static void main(String[] args) {
        combinationSum2 sol = new combinationSum2();

        int[] v = {10, 1, 2, 7, 6, 1, 5};  
        int target = 8; 

        List<List<Integer>> comb = sol.findCombinationSum2(v, target);

        System.out.print("[ ");
        for (List<Integer> combination : comb) {
            System.out.print("[ ");
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.print("]");
        }
        System.out.println(" ]");

    }
}
